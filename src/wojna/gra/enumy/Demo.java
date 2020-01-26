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
        Player player1 = new Player();
        Player player2 = new Player();
        CardManager cardManager = new CardManager(player1, player2, deckOfCards);
        System.out.println("*******************************");
        List<Card> shuffledCards = cardManager.shuffleDeckOfCards();
        cardManager.dealTheCards(shuffledCards);
        player1.giveOneCard(1);
        player2.giveOneCard(1);
        Displayer displayer1 = new Displayer(player1);
        Displayer displayer2 = new Displayer(player2);
        displayer1.display();
        displayer2.display();


    }
}
