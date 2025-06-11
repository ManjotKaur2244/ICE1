/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaurM
 * Manjot Kaur
 * Student ID: 991791059
 */
public class Card {
    private String suit; //clubs, spades, diamonds, hearts
    private int value; //1-13

    public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
