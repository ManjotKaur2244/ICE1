/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaurM
 */
/**
 *  
 * @ Manjot kaur, StudentID: 991791059
 * 
 */

import java.util.Random;
public class CardTrick {

    public static void main(String[] args) {
        Random rand = new Random();
        Card[] magicHand = new Card[7];

        // Fill magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // values 1 to 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // random suit
            magicHand[i] = c;
        }

        // Hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");

        // Search for lucky card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && 
                card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report result
        if (found) {
            System.out.println("Congratulations! Your lucky card was found in the magic hand!");
        } else {
            System.out.println("Sorry! Your lucky card was NOT found in the magic hand.");
        }
    }
}
