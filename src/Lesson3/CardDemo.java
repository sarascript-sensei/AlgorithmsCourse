package Lesson3;

import java.util.Stack;

public class CardDemo {
    public static void main(String[] args) {
        Stack<Card> deck = new Stack<>();
        deck.push(new Card("Туз"));
        deck.push(new Card("Валет"));
        deck.push(new Card("Дама"));
        deck.push(new Card("Семерка"));
        deck.push(new Card("Шестерка"));
        deck.push(new Card("Король"));

        Stack<Card> graveyard = new Stack<>();

        CardGame cardGame = new CardGame();
        cardGame.setDeck(deck);
        cardGame.setGraveyard(graveyard);

        Card card1 = cardGame.getCardFromDeck();
        Card card2 = cardGame.getCardFromDeck();
        Card card3 = cardGame.getCardFromDeck();

        System.out.println("Какие карты достались игроку?");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        cardGame.discard(card1);
        cardGame.discard(card2);
        cardGame.discard(card3);

        System.out.println("Какие карты находятся в сбросе? ");
        System.out.println(cardGame.getGraveyard().pop());
        System.out.println(cardGame.getGraveyard().pop());
        System.out.println(cardGame.getGraveyard().pop());

    }
}
