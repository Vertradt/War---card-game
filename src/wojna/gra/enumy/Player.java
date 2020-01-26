package wojna.gra.enumy;

import java.util.List;

public class Player {
    private List<Card> playerCards;

    void offerCards(List<Card> pileOfCards) {
        playerCards = pileOfCards;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }


    public Card giveOneCard(int a) {
        return playerCards.get(a - 1);
    }


}
