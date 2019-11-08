package com.wyischina.blackjack;

/**
 * Class representing a hand of cards.
 */
public class Hand {

    /**
     * cards in the hand.
     */
    private Card[] cards = new Card[52];

    /**
     * Current number of cards.
     */
    private int numberOfCards = 0;

    /**
     * Ace count.
     */
    private int aceCount = 0;

    /**
     * Add a card to the hand.
     * @param card to be added to the hand.
     */
    public void addCard(Card card) {
        cards[numberOfCards] = card;
        numberOfCards++;
        if (card.getNumber() == 1) {
            aceCount++;
        }
    }

    /**
     * Get the number of cards in this hand.
     * @return int number of cards.
     */
    public int getNumberOfCards() {
        return numberOfCards;
    }

    /**
     * Calculate the maximum number of points of this hand.
     * @return int the number of points according to the rule of blackjack.
     */
    public int getMaximumNumberOfPoints() {
        int points = 0;
        for (int i = 0; i < numberOfCards; i++) {
            Card c = cards[i];
            if (c.getNumber() == 1) {
                points += 11;
            } else if (c.getNumber() > 10) {
                points += 10;
            } else {
                points += c.getNumber();
            }
        }
        return points;
    }

    /**
     * Calculate the maximum number of points of this hand.
     * @return int the number of points according to the rule of blackjack.
     */
    public int getMinimumNumberOfPoints() {
        int points = 0;
        for (int i = 0; i < numberOfCards; i++) {
            Card c = cards[i];
            if (c.getNumber() == 1) {
                points += 1;
            } else if (c.getNumber() > 10) {
                points += 10;
            } else {
                points += c.getNumber();
            }
        }
        return points;
    }

    /**
     * Is this hand a blackjack?
     * @return true if the hand is blackjack, false otherwise.
     */
    public boolean isBlackjack() {
        // base points are points of cards without counting the Aces.
        int basePoints = 0;
        for (int i = 0; i < numberOfCards; i++) {
            Card c = cards[i];
            if (c.getNumber() > 10) {
                basePoints += 10;
            } else if (c.getNumber() > 1){
                basePoints += c.getNumber();
            }
        }
        // only combinations based on the number of aces.
        // 1: 1, 11,
        // 2: 2, 12, 22
        // 3: 3, 13, 23,...
        // 4: 4, 15, ...
        if (basePoints + aceCount == 21) {
            return true;
        } else if (basePoints + aceCount + 10 == 21) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Is this hand a bust?
     * @return true if the hand is bust, false otherwise.
     */
    public boolean isBust() {
        return getMinimumNumberOfPoints() > 21;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < numberOfCards; i++) {
            Card c = cards[i];
            builder.append(c.toString());
            if (i < numberOfCards - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
