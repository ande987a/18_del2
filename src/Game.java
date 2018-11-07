public class Game {
    public static void main(String[] args) {

        Player Player1 = new Player();
        Player Player2 = new Player();

        Bank b = new Bank();


        while(!Player.Win()){
            System.out.println();
            System.out.println("Spiller nr.1 kaster");
            Player1.getturn();
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
            //TODO Her skal muligvis være en get til den opdaterede kapital

        if(!Player.Win()){
            System.out.println();
            System.out.println("Spiller nr.2 kaster");
            Player2.getturn();
            //TODO Her skal muligvis være en get til den opdaterede kapital-
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
