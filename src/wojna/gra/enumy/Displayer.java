package wojna.gra.enumy;

import java.util.List;

public class Displayer {


    static void display(List<Card> cards) {
        int i = 1;
        for (Card card1 : cards) {
            System.out.println(i + ": " + card1);
            i++;
        }
        System.out.println("---------------------");
    }
}
