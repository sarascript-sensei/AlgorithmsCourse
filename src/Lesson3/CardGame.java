package Lesson3;

import java.util.Stack;

public class CardGame {
    private Stack<Card> deck;

    private Stack<Card> graveyard;

    public Card getCardFromDeck(){
        return deck.pop();
    }

    public void discard(Card card){
        graveyard.push(card);
    }

    public Card lookTopCard(){
        return deck.peek();
    }

    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }

    public void setGraveyard(Stack<Card> graveyard) {
        this.graveyard = graveyard;
    }

    public Stack<Card> getDeck() {
        return deck;
    }

    public Stack<Card> getGraveyard() {
        return graveyard;
    }
}
