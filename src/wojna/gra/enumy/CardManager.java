package wojna.gra.enumy;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;

public class CardManager {
    private Player player1;
    private Player player2;
    private List<Card> allCards;


    public CardManager(Player player1, Player player2, List<Card> allCards) {
        this.player1 = player1;
        this.player2 = player2;
        this.allCards = allCards;
    }

    public List<Card> shuffleDeckOfCards() {
        shuffle(allCards);
        return allCards;
    }

    void dealTheCards(List<Card> shuffledCards) {
        List<Card> cards1 = new ArrayList<>();
        List<Card> cards2 = new ArrayList<>();
        for (int i = 0; i < shuffledCards.size(); i++) {
            if (i % 2 == 0) {
                cards1.add(allCards.get(i));
            } else {
                cards2.add(allCards.get(i));

            }
        }
        player1.offerCards(cards1);
        player2.offerCards(cards2);
    }


}
