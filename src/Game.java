import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Player Player1 = new Player();
        Player Player2 = new Player();
        Rules ex = new Rules();

        while(!Rules.Win()){
            Player1.turn("1");
            Player1.extra("1");
            //TODO Her skal muligvis være en get til den opdaterede kapital

        if(!Rules.Win()){
            //TODO Her skal muligvis være en get til den opdaterede kapital-
            Player2.turn("2");
            Player2.extra("2");
        }
        }
        Game.Won();
    }

    //TODO skal flyttes et mere relavant sted hen, og fikses så spiller 2 kan vinde
    public static void Won(){
        if(Rules.Win()) {
            System.out.println();
            System.out.println("Spiller nr.1 vandt");
        } else {
            System.out.println();
            System.out.println("Spiller nr.2 vandt");
        }
    }

}
