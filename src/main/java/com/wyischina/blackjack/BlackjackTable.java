package com.wyischina.blackjack;

/**
 * Class representing one blackjack game.
 */
public class BlackjackTable {

    /**
     * Amount of the bet by the player.
     */
    private int betAmount;

    /**
     * Dealer
     */
    private Dealer dealer;

    /**
     * Payout multiple.
     */
    private float payout;

    /**
     * Deck used to play.
     */
    private Deck deck;

    /**
     * Create a BlackjackTable with a default payout of 1:1.
     */
    public BlackjackTable() {
        this(1);
    }

    /**
     * Create a BlackjackGame
     */
    public BlackjackTable(float payout) {
        dealer = new Dealer(1000000);
        this.deck = new Deck();
        this.payout = payout;
    }

    /**
     * Act to see if the game has ended.
     * @param player to check if game with this player has ended.
     * @return true if game has ended.
     */
    private GameState updateGameState(Player player) {
        if (dealer.getHand().isBlackjack() && player.getHand().isBlackjack()) {
            // dealer and player tie
            player.receivePayout(betAmount);
            return GameState.Tie;
        } else if (dealer.getHand().isBlackjack()) {
            // dealer wins, player loses
            dealer.receivePayout(betAmount);
            return GameState.Lose;
        } else if (player.getHand().isBlackjack()) {
            // player wins
            int payoutAmount = Math.round(betAmount * payout);
            dealer.placeBet(payoutAmount);
            player.receivePayout(betAmount + payoutAmount);
            return GameState.Win;
        } else if (player.getHand().isBust()) {
            // player loses,
            dealer.receivePayout(betAmount);
            return GameState.Lose;
        } else if (dealer.getHand().isBust() && !player.getHand().isBust()) {
            // player wins
            int payoutAmount = Math.round(betAmount * payout);
            dealer.placeBet(payoutAmount);
            player.receivePayout(betAmount + payoutAmount);
            return GameState.Win;
        } else if (dealer.getHand().getMinimumNumberOfPoints() > 16) {
            int playerScore = player.getHand().getMinimumNumberOfPoints();
            int dealerScore = dealer.getHand().getMinimumNumberOfPoints();
            if (playerScore < dealerScore) {
                dealer.receivePayout(betAmount);
                return GameState.Lose;
            } else if (playerScore > dealerScore) {
                int payoutAmount = Math.round(betAmount * payout);
                dealer.placeBet(payoutAmount);
                player.receivePayout(betAmount + payoutAmount);
                return GameState.Win;
            } else {
                player.receivePayout(betAmount);
                return GameState.Tie;
            }
        } else {
            return GameState.Continue;
        }
    }

    /**
     * Start a round of the blackjack game.
     * @param player player who is playing this game.
     */
    public GameState playGame(Player player) {
        try {
            // deal two cards for the dealer and player.
            betAmount = player.promptForBetAmount();
            player.placeBet(betAmount);
            player.getHand().addCard(deck.dealCard());
            dealer.getHand().addCard(deck.dealCard());
            player.getHand().addCard(deck.dealCard());
            dealer.getHand().addCard(deck.dealCard());

            GameState state = updateGameState(player);
            while(state == GameState.Continue) {
                // player's turn.
                while (true) {
                    Move nextMove = player.promptForNextMove();
                    if (nextMove == Move.Hit) {
                        player.getHand().addCard(deck.dealCard());
                        state = updateGameState(player);
                        if (state != GameState.Continue) {
                            return state;
                        }
                    } else if (nextMove == Move.Stand) {
                        break;
                    } else if (nextMove == Move.DoubleDown) {
                        int doubleDownAmount = player.promptForBetAmount();
                        player.placeBet(doubleDownAmount);
                        betAmount = betAmount + doubleDownAmount;
                    }
                }

                // dealer's turn
                while (dealer.getHand().getMinimumNumberOfPoints() < 16) {
                    dealer.getHand().addCard(deck.dealCard());
                }

                // check game state.
                state = updateGameState(player);
            }
            return state;
        } catch (EndOfDeckException e) {
            throw new IllegalStateException("The table has run out of card but it shouldn't happen");
        }
    }

    /**
     * Main method.
     * @param args
     */
    public static void main(String[] args) {
        BlackjackTable table = new BlackjackTable();
        Player player = new Player(100);
        GameState state = table.playGame(player);
        switch(state) {
            case Win:
                System.out.println("You win! Your balance is " + player.getBalance());
                break;
            case Lose:
                System.out.println("You lose! Your balance is " + player.getBalance());
                break;
            case Tie:
                System.out.println("It's a tie! Your balance is " + player.getBalance());
                break;
        }
    }

}
