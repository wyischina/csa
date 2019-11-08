package com.wyischina.blackjack;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Card {

    /**
     * Suit of the card.
     */
    private Suit suit;

    /**
     * Ace is 1, 2 - 10 is face value, 11 is Jack, 12 is Queen, 13 is King.
     */
    private int number;

    /**
     * Create a card with a given suit and number.
     * @param suit the suit of the card.
     * @param number the number of the card.
     */
    public Card(Suit suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    /**
     * Get the suit of the card.
     * @return Suit of the card.
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Get the number of the card.
     * @return int Ace is 1, 2 - 10 is face value, 11 is Jack, 12 is Queen, 13 is King.
     */
    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return number == card.number &&
                suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, number);
    }

    @Override
    public String toString() {
        return this.suit + ":" + this.number;
    }
}
