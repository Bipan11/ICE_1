/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Bipandeep Kaur
 * Student ID-991645867
 * Date-May 24,2022
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner some = new Scanner(System.in);
        Card[] luckyCard = new Card[7];
        
        for (int i=0; i<luckyCard.length; i++)
        {
            Card c = new Card();
            
            c.setValue(c.userValue());
            //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[c.userSuit()]);
            luckyCard[i]=c;
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
       
        for(Card result:luckyCard){
            System.out.println(result.getSuit());
            System.out.println(result.getValue());
        }
        System.out.println("Enter the value");
        
        int Value1 = some.nextInt();
        System.out.println("Enter for the card suit");
        
        int Suit1  = some.nextInt();
        System.out.println("You card is : " +Value1+ "of "+Suit1);
        //insert code to ask the user for Card value and suit, create their card
       
        
        // and search luckyCard here
        for(Card result:luckyCard){
        if(Value1 == result.getValue() && Suit1 ==result.getValue()){
            System.out.println("You Win");
        }
            else{
            System.out.println("You Lost");
            }
        }
        //Then report the result here
    }


    
}
