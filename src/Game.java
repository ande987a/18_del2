public class Game {
    public static void main(String[] args) {

        Player Player1 = new Player();
        Player Player2 = new Player();

        while (!Player1.getwin() && !Player2.getwin()) {
            Player1.getturn("1");


            if (!Player1.getwin() && !Player2.getwin()) {
                Player2.getturn("2");
            }
        }
    }
}
