package com.wyischina.blackjack;

public class Game {
    private Dealer dealer1;
    private User user1;
    private Deck deck = new Deck();
    private int pile = 0;
    private int payoff = 2;
    private int gameIndex = 0;

    public Game(Dealer p1, User p2) {
        this.dealer1 = p1;
        this.user1 = p2;
    }

    public void askBet() {
        boolean isValid = false;
        while(!isValid) {
            int bet = user1.getBet();
            if (bet <= user1.getMoney()) {
                if (this.pile == 0 || this.pile >= bet) {
                    user1.addMoney(-bet);
                    pile += bet;
                    isValid = true;
                } else {
                    System.out.println("You can't double down more than your first bet.");
                }
            } else {
                System.out.println("You don't have " + bet + " in your account (Money left: " + user1.getMoney() + ").");
            }
        }
    }

    public void drawStartingCards() {
        user1.addCard(deck.drawCard());
        user1.addCard(deck.drawCard());
        dealer1.addCard(deck.drawCard());
        dealer1.addCard(deck.drawCard());
    }

    public void takeTurn(Player player) {
        while (player.hand.getTotalPoints() < 21) {
            try {
                Move nextMove = player.getNextMove();
                if (nextMove == Move.Hit) {
                    player.addCard(deck.drawCard());
                    if (player == user1) {
                        gameReport("inGame");
                    }
                } else {
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Please enter either hit(1) or stand(2).");
            }
        }
    }

    public boolean bustCheck(Player player){
        return player.hand.getTotalPoints() > 21;
    }

    public Player getWinner() {
        if (user1.hand.getTotalPoints() > dealer1.hand.getTotalPoints()) {
            return user1;
        } else if (user1.hand.getTotalPoints() < dealer1.hand.getTotalPoints()){
            return dealer1;
        } else {
            return null;
        }
    }

    public void resetGame() {
        gameIndex++;
        user1.hand.reset();
        dealer1.hand.reset();
        pile = 0;
        shuffleDeckIfNeeded();
        System.out.println();
        System.out.println("Initialized Game " + this.gameIndex);
        System.out.println();
        gameReport("inGame");
    }

    public void gameReport(String s) {
        System.out.println("Your Money: " + user1.getMoney());
        System.out.println("Your Hand: " + user1.revealHand());
        System.out.println("Your points: " + user1.hand.getTotalPoints());
        System.out.println("Dealer's Money: " + dealer1.getMoney());
        if(s.equals("inGame")) {
            System.out.println("Dealer's Hand: " + dealer1.revealHand());
        } else {
            System.out.println("Dealer's Hand: " + dealer1.revealFinalHand());
            System.out.println("Dealer's points: " + dealer1.hand.getTotalPoints());
        }
    }

    public Player getDealer1() {
        return this.dealer1;
    }

    public Player getUser1() {
        return this.user1;
    }

    public void payout(String s) {
        if (s.equals("win")){
            this.user1.addMoney(this.pile * this.payoff);
        } else if (s.equals("draw")) {
            this.user1.addMoney(this.pile);
        }
    }

    public void victoryCheck(){
        if(getWinner() == null){
            System.out.println("Its a draw! (+" + this.pile + ")");
            payout("draw");
        } else if(getWinner().equals(user1)){
            System.out.println("You win! (+" + this.pile*2 + ")");
            payout("win");
        } else if(getWinner().equals(dealer1)) {
            System.out.println("dealer wins! (+0)");
        } else {
            System.out.println("Invalid victory condition");
        }
    }

    public void shuffleDeckIfNeeded(){
        if(deck.getTotalCards() <= 20){
            deck = new Deck();
        }
    }

    public int getGameIndex(){
        return this.gameIndex;
    }
}