package Lesson3;

import java.util.Stack;

public class CardGame {
    public Stack<Card> deck;

    public Stack<Card> graveyard;

    public Card getCardFromDeck(){
        return deck.pop();
    }

    public void discard(Card card){
        graveyard.push(card);
    }

    public Card lookTopCard(){
        return deck.peek();
    }
}
