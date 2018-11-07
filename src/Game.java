import java.util.Scanner;

public class Game {
    public static void main(String[] args) {


        while(!Player.Win()){
            System.out.println();
            System.out.println("Spiller nr.1 kaster");
            Player.getturn();
            //TODO Her skal muligvis være en get til den opdaterede kapital

        if(!Player.Win()){
            System.out.println();
            System.out.println("Spiller nr.2 kaster");
            //TODO Her skal muligvis være en get til den opdaterede kapital-
            Player.getturn();
        }
        }
        Game.Won();
    }

    //TODO skal flyttes et mere relavant sted hen
    public static void Won(){
        if(Player.Win()) {
            System.out.println();
            System.out.println("Spiller nr.1 vandt");
        } else {
            System.out.println();
            System.out.println("Spiller nr.2 vandt");
        }
    }

}
