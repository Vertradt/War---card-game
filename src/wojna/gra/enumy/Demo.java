package wojna.gra.enumy;

import java.util.List;

public class Demo {
    private GameManager gameManager;

    public Demo(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    public void demonstateTheProgram() {

        Card card = new Card(Rank.AS, Suit.KARO);

        Card card1 = new Card(Rank.AS, Suit.PIK);

        System.out.println();
        DeckFactory deckFactory = new DeckFactory();

        List<Card> deckOfCards = deckFactory.createAndGetDeck();
        Player player1 = new Player();
        Player player2 = new Player();
        CardManager cardManager = new CardManager(player1, player2, deckOfCards);
        System.out.println("*******************************");
        List<Card> shuffledCards = cardManager.shuffleDeckOfCards();
        cardManager.dealTheCards(shuffledCards);
        Displayer displayer1 = new Displayer(player1);
        Displayer displayer2 = new Displayer(player2);
        displayer1.display();
        displayer2.display();


        GameManager gameManager = new GameManager(player1, player2);
//        gameManager.giveCardsFromTable();


//        gameManager.evaluate(player1.giveCardFromTop(), player2.giveCardFromTop());
//        gameManager.playTheGame(player2, player1);
        gameManager.playTheGame();


        displayer1.display();
        displayer2.display();

    }
}
