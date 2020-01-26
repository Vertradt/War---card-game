package wojna.gra.enumy;

public class Displayer {
    private Player player;

    public Displayer(Player player) {
        this.player = player;
    }

    public void display() {
        int i = 1;

        for (Card card1 : player.getPlayerCards()) {
            System.out.println(i + ": " + card1);
            i++;
        }
        System.out.println("---------------------");
    }
}
