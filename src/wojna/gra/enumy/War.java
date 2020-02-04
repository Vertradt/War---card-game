package wojna.gra.enumy;

import java.util.ArrayList;
import java.util.List;

public class War {
    private List<Card> pullOfCards = new ArrayList<>();

    public void addToPull(List<Card> cards) {
        pullOfCards.addAll(cards);
    }

    public void makeWar() {

//        pullOfCards.add(card1);
//        pullOfCards.add(card2);
        for (Card pullOfCard : pullOfCards) {
            System.out.println(pullOfCard);
        }
        System.out.println("+++++++++++++++++++++++++++++++");
    }
    //Porównuję karty
    //Gdy karty są równe trafiają do puli
    // Dokładam dwie zakryte karty do puli
    //Porównuję kolejne dwie karty
    // Jeśli jedna większa to pula jest przekazywana do jenej z list
    // Jeśli obie równe ponownie to zapętlam przeprowadzenie wojny


}
