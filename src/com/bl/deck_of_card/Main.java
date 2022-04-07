package com.bl.deck_of_card;

public class Main {
    public static void main(String[] args) {
        Card card = new Card();
        card.shuffleCard();
        card.assignCards();
        card.display();
    }
}
