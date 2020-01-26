package wojna.gra.enumy;

import java.util.ArrayList;
import java.util.List;

public class DeckFactory {

    List<Card> createAndGetDeck() {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    void displayDeck(List<Card> cards) {
        int i = 0;
        for (Card card : cards) {
            System.out.println(i + 1 + ". " + card);
            i++;
        }
    }


}
