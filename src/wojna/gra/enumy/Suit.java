package wojna.gra.enumy;

public enum Suit {
    PIK("speades"),
    TREFL("clubs"),
    KARO("diamonds"),
    KIER("hearts");

    private final String engSuitName;

    Suit(String engSuitName) {
        this.engSuitName = engSuitName;
    }

    @Override
    public String toString() {
        String cardColour = super.toString();
        return cardColour.toLowerCase();
    }
}
