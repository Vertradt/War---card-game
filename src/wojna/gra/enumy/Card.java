package wojna.gra.enumy;

public class Card {
    private Rank rank;
    private Suit colour;

    Card(Rank rank, Suit colour) {
        this.rank = rank;
        this.colour = colour;
    }


//        public Rank getPower() {
//        return rank;
//    }

    @Override
    public String toString() {
        return rank + " " + colour;
    }

    public int getPower() {
        return rank.getPower();
    }
}
