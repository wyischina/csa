package com.wyischina.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HandTest {

    @Test
    public void testNewHand() {
        Hand h = new Hand();
        assertEquals(0, h.getMinimumNumberOfPoints());
        assertEquals(0, h.getMaximumNumberOfPoints());
        assertEquals(false, h.isBlackjack());
        assertEquals(false, h.isBust());
        assertEquals(0, h.getNumberOfCards());
        assertEquals("[]", h.toString());
    }


    @Test
    public void testMinimumNumberOfPoints() {
        Hand h = new Hand();
        assertEquals(0, h.getMinimumNumberOfPoints());
        h.addCard(new Card(Suit.Club, 5));
        assertEquals(5, h.getMinimumNumberOfPoints());
        h.addCard(new Card(Suit.Diamond, 1));
        assertEquals(6, h.getMinimumNumberOfPoints());
    }

    @Test
    public void testMaximumNumberOfPoints() {
        Hand h = new Hand();
        assertEquals(0, h.getMaximumNumberOfPoints());
        h.addCard(new Card(Suit.Club, 5));
        assertEquals(5, h.getMaximumNumberOfPoints());
        h.addCard(new Card(Suit.Diamond, 1));
        assertEquals(16, h.getMaximumNumberOfPoints());
    }


    @Test
    public void testIsBust() {
        Hand h = new Hand();
        assertEquals(0, h.getMaximumNumberOfPoints());
        h.addCard(new Card(Suit.Club, 10));
        h.addCard(new Card(Suit.Diamond, 10));
        assertEquals(false, h.isBust());
        h.addCard(new Card(Suit.Heart, 2));
        assertEquals(true, h.isBust());
    }


    @Test
    public void testIsBlackjack() {
        Hand h = new Hand();
        h.addCard(new Card(Suit.Club, 10));
        assertEquals(false, h.isBlackjack());
        h.addCard(new Card(Suit.Diamond, 1));
        assertEquals(true, h.isBlackjack());
    }

    @Test
    public void testIsBlackjackWithMultipleAces1() {
        Hand h = new Hand();
        h.addCard(new Card(Suit.Club, 1));
        h.addCard(new Card(Suit.Diamond, 1));
        h.addCard(new Card(Suit.Diamond, 10));
        h.addCard(new Card(Suit.Diamond, 9));
        assertEquals(true, h.isBlackjack());
    }

    @Test
    public void testIsBlackjackWithMultipleAces2() {
        Hand h = new Hand();
        h.addCard(new Card(Suit.Club, 1));
        h.addCard(new Card(Suit.Diamond, 1));
        h.addCard(new Card(Suit.Diamond, 9));
        assertEquals(true, h.isBlackjack());
    }
}
