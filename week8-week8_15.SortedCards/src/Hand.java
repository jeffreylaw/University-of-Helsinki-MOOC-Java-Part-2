/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Jeffrey
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public int compareTo(Hand hand) {
        int thisValue = 0;
        for (Card card : this.cards) {
            thisValue += card.getValue();
        }
        
        int otherValue = 0;
        for (Card card : hand.cards) {
            otherValue += card.getValue();
        }
        
        return thisValue - otherValue;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
}
