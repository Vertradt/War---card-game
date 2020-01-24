package wojna.gra.enumy;

public enum Rank {
    DZIESIATKA("Ten", 10),
    JOPEK("Jack", 11),
    DAMA("Queen", 12),
    KROL("King", 13),
    AS("Ace", 14);

    private final String engRankName;
    private final int power;

    Rank(String engRankName, int cardPower) {
        this.engRankName = engRankName;
        this.power = cardPower;
    }

    public int getPower() {
        return power;

    }

    public String getEngRankName() {
        return engRankName;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
