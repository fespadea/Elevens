package com.company;

import java.util.ArrayList;

/**
 * Created by fs279 on 3/15/17.
 */
public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    public Deck(String [] ranks, String [] suits, int [] pointValues){
        for (int i = 0; i < suits.length; i++) {
            Card bob = new Card(ranks[i], suits[i], pointValues[i])
        }
    }
}
