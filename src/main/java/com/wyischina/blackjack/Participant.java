package com.wyischina.blackjack;

/**
 * Class representing a participant in a blackjack game.
 */
public class Participant {

    /**
     * Bank balance of the participant
     */
    private int balance;

    /**
     * Hand of cards.
     */
    private Hand hand;

    /**
     * Create a participant with a initial balance.
     * @param initialBalance the initial balance.
     */
    public Participant(int initialBalance) {
        assert initialBalance >= 0;
        this.balance = initialBalance;
        this.hand = new Hand();
    }

    /**
     * Get the hand of the participant.
     * @return Hand hand.
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Participant is placing a bet therefore reducing the balance.
     * @param betAmount the amount of the bet.
     */
    public void placeBet(int betAmount) {
        if (betAmount > balance) {
            throw new IllegalArgumentException("insufficient balance");
        }
        balance = balance - betAmount;
    }

    /**
     * Participant has received a payout.
     * @param payoutAmount amount of the payout.
     */
    public void receivePayout(int payoutAmount) {
        assert payoutAmount >= 0;
        balance = balance + payoutAmount;
    }

    /**
     * Get the participant's bank balance.
     * @return int the balance
     */
    public int getBalance() {
        return balance;
    }
}
