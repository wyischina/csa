package com.wyischina.blackjack;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class DeckTest {

    @Test
    public void testNewDeck() {
        Deck d = new Deck();
        try {
            for (int i = 0; i < 52; i++) {
                d.dealCard();
            }
        } catch (EndOfDeckException e) {
            fail("not expecting exception", e);
        }
        try {
            d.dealCard();
            fail("expected a EndOfDeckException");
        } catch (EndOfDeckException e) {
            // ignore
        }
    }

    @Test
    public void testDeckContainsAllCards() {
        Deck d = new Deck();
        try {
            Set expectedCards = new HashSet();
            for (int i = 1; i <= 13; i++) {
                for (Suit suit : Suit.values()) {
                    Card card = new Card(suit, i);
                    expectedCards.add(card);
                }
            }
            Set dealtCards = new HashSet();
            for (int j = 0; j < 52; j++) {
                dealtCards.add(d.dealCard());
            }
            assertEquals(expectedCards, dealtCards);
        } catch (EndOfDeckException e) {
            fail("not expecting exception", e);
        }
    }
}
