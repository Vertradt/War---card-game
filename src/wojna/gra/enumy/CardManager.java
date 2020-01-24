package wojna.gra.enumy;

import java.util.ArrayList;
import java.util.Collections;
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

    List<Card> shuffleDeckOfCards() {
        shuffle(allCards);
        return allCards;
    }

    void dealTheCards() {
        Collections.shuffle(allCards);
//        initList();
        List<Card> handOfPlayer1 = new ArrayList<>();
        List<Card> handOfPlayer2 = new ArrayList<>();
        for (int i = 0; i < allCards.size(); i++) {
            if (i % 2 == 0) {
                handOfPlayer1.add(allCards.get(i));
            } else {
                handOfPlayer2.add(allCards.get(i));

            }
        }
        player1.givePlayerDeck(handOfPlayer1);
        player2.givePlayerDeck(handOfPlayer1);
        System.out.println("****************");
    }


}
