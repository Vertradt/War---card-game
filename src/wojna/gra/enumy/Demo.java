package wojna.gra.enumy;

import java.util.List;

public class Demo {
    private War war;

    public Demo(War war) {
        this.war = war;
    }

    public void demonstateTheProgram() {

        Card card = new Card(Rank.AS, Suit.KARO);

        Card card1 = new Card(Rank.AS, Suit.PIK);
        war.makeWar(card, card1);

        System.out.println();
        DeckFactory deckFactory = new DeckFactory();

        List<Card> deckOfCards = deckFactory.createAndGetDeck();
        Player player1 = new Player(deckOfCards);
        Player player2 = new Player(deckOfCards);
        CardManager cardManager = new CardManager(player1,player2,deckOfCards);
        System.out.println("*******************************");
//        List<Card> shuffledCards = cardManager.shuffleDeckOfCards();
        cardManager.dealTheCards();
        System.out.println(player1.giveOneCard(1));
        System.out.println(player2.giveOneCard(1));
        System.out.println(".............................");
//        System.out.println(player1.giveOneCard(10));
//        System.out.println(player2.giveOneCard(10));


    }
}
