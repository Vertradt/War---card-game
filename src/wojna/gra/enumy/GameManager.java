package wojna.gra.enumy;

import java.util.ArrayList;
import java.util.List;

class GameManager {
    private List<Card> cardsOnTable = new ArrayList<>();
    private Player player1;
    private Player player2;

    GameManager(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

//etap 1 gracze z rozdanymi kartami
    //etap prosta symulacja rozgrywki do skonczenia kart  // metoda zagrania po 1 karcie i roztrzygniecia wyniku
    // metoda zebrania kart
    //dopracowac rozpoznawanie konca rozgrywki
    //zaimplementowac wojne  // rozpoznana wojna> dołożenie bonusowych kart(do puli wygranej) >> ponowne wywołanie metody pojedynku

    // pojedynek -> wojna
    // 2 zakryte

    private Card evaluate(List<Card> cards) {
        Card higherCard = null;
        if (cards.get(0).getPower() > cards.get(1).getPower()) {
            higherCard = cards.get(0);
        } else if (cards.get(0).getPower() < cards.get(1).getPower()) {
            higherCard = cards.get(1);
        }
//        else {
//
//
//            War war = new War();
//            war.addToPull(cards);
//            war.addToPull(cardsOnTable);
//            war.makeWar();
//
////            higherCard = cards.get(0);
//
//
//        }

        return higherCard;
    }
    // pojedynek -> wojna


    private List<Card> giveCardsFromTable() {
        while (!player1.getPlayerCards().isEmpty() && !player2.getPlayerCards().isEmpty()) {
            cardsOnTable.add(player1.giveCardFromTop());
            cardsOnTable.add(player2.giveCardFromTop());
            if (player1.getPlayerCards().isEmpty() && player2.getPlayerCards().isEmpty()) {
                System.out.println("Koniec gry");
            }

        }

        return cardsOnTable;
    }

    private void chooseTheWiner(Card card) {
        Card card1 = cardsOnTable.get(0);
        Card card2 = cardsOnTable.get(1);

        if (card.equals(card1)) {
            player1.addTwoCardsToDeck(cardsOnTable);
            System.out.println("Wygrywa player1");
        } else if (card.equals(card2)) {
            player2.addTwoCardsToDeck(cardsOnTable);
            System.out.println("Wygrywa player2");
        }
//        else if (card1.equals(card2)) {
//
//        }
    }

    void playTheGame() {
        List<Card> cards = giveCardsFromTable();
        Card card = evaluate(cards);
        chooseTheWiner(card);


    }

}
