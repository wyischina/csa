package com.wyischina.blackjack;

import java.util.Random;

public class Deck {

    /**
     * cards in the deck.
     */
    private Card[] cards = new Card[52];

    /**
     * Index to the next card.
     */
    private int nextCardIndex;

    /**
     * Create a new deck of card with cards shuffled.
     */
    public Deck() {
        Random random = new Random();
        for(int number = 1; number <= 13; number++) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(suit, number);
                while(true) {
                    int randomIndex = random.nextInt(cards.length);
                    if (cards[randomIndex] == null) {
                        cards[randomIndex] = card;
                        break;
                    }
                }
            }
        }
    }

    /**
     * Deal a new card.
     * @return Card card dealt.
     * @throws EndOfDeckException when the deck is empty.
     */
    public Card dealCard() throws EndOfDeckException {
        if (nextCardIndex < cards.length) {
            Card newCard = cards[nextCardIndex];
            nextCardIndex++;
            return newCard;
        } else {
            throw new EndOfDeckException();
        }
    }

}
