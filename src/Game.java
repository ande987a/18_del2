import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Player Player1 = new Player();
        Player Player2 = new Player();
        Rules ex = new Rules();
        Bank b = new Bank();

        while(!Rules.Win()){
            Player1.turn("1");
            switch (Player1.getfield()-1) {
                case 1: b.setBalance1(b.getBalance1()+250);
                    break;
                case 2: b.setBalance1(b.getBalance1()-100);
                    break;
                case 3: b.setBalance1(b.getBalance1()+100);
                    break;
                case 4: b.setBalance1(b.getBalance1()-20);
                    break;
                case 5: b.setBalance1(b.getBalance1()+180);
                    break;
                case 6: b.setBalance1(b.getBalance1()+0);
                    break;
                case 7: b.setBalance1(b.getBalance1()-70);
                    break;
                case 8: b.setBalance1(b.getBalance1()+60);
                    break;
                case 9: b.setBalance1(b.getBalance1()-80);
                    break;
                case 10: b.setBalance1(b.getBalance1()-50);
                    break;
                case 11: b.setBalance1(b.getBalance1()+650);
                    break;}
            System.out.println(b.getBalance1());
            Player1.extra("1");

            //TODO Her skal muligvis være en get til den opdaterede kapital

            if(!Rules.Win()){
                //TODO Her skal muligvis være en get til den opdaterede kapital-
                Player2.turn("2");
                switch (Player2.getfield()-1) {
                    case 1: b.setBalance2(b.getBalance2()+250);
                        break;
                    case 2: b.setBalance2(b.getBalance2()-100);
                        break;
                    case 3: b.setBalance2(b.getBalance2()+100);
                        break;
                    case 4: b.setBalance2(b.getBalance2()-20);
                        break;
                    case 5: b.setBalance2(b.getBalance2()+180);
                        break;
                    case 6: b.setBalance2(b.getBalance2()+0);
                        break;
                    case 7: b.setBalance2(b.getBalance2()-70);
                        break;
                    case 8: b.setBalance2(b.getBalance2()+60);
                        break;
                    case 9: b.setBalance2(b.getBalance2()-80);
                        break;
                    case 10: b.setBalance2(b.getBalance2()-50);
                        break;
                    case 11: b.setBalance2(b.getBalance2()+650);
                        break;}
                System.out.println(b.getBalance2());
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
