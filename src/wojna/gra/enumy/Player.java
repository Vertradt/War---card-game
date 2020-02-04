package wojna.gra.enumy;


import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> playerCards = new ArrayList<>();

    void offerCards(List<Card> pileOfCards) {
        this.playerCards = pileOfCards;
    }

    List<Card> getPlayerCards() {
        return playerCards;
    }

    Card giveCardFromTop() {
        Card card = null;
        for (int i = 0; i < playerCards.size(); i++) {
            card = playerCards.get(0);
        }
        playerCards.remove(card);
        return card;
    }

    void addTwoCardsToDeck(List<Card> cards) {
        playerCards.addAll(cards);
    }


    Player whoWins(Player player) {
        return player;
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder();
//        sb.append();
//        return sb.toString();
//    }
}
