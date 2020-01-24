package wojna.gra.enumy;

public class War {
    //etap 1 gracze z rozdanymi kartami
    //etap prosta symulacja rozgrywki do skonczenia kart  // metoda zagrania po 1 karcie i roztrzygniecia wyniku
    // metoda zebrania kart
    //dopracowac rozpoznawanie konca rozgrywki
    //zaimplementowac wojne  // rozpoznana wojna> dołożenie bonusowych kart(do puli wygranej) >> ponowne wywołanie metody pojedynku

    // pojedynek -> wojna
    // 2 zakryte
    // pojedynek -> wojna






    void makeWar(Card card1, Card card2){
        if(card1.getPower() > card2.getPower()){
            System.out.printf("Wygrywa kara \"%s\".", card1);
        }
        else if (card1.getPower() < card2.getPower()){
            System.out.printf("Wygrywa kara \"%s\".", card2);

        }
        else {
            System.out.printf("Remis, \"%s\" i \"%s\" są równe.", card1,card2);
        }
    }
}
