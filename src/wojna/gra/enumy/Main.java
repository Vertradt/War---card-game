package wojna.gra.enumy;

public class Main {

    public static void main(String[] args) {
        Demo demo = new Demo(new GameManager(new Player(), new Player()));
        demo.demonstateTheProgram();
    }
}
