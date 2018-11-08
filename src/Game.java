public class Game {
    public static void main(String[] args) {

        Player Player1 = new Player();
        Player Player2 = new Player();

        while(!Win()){
            Player1.getturn("1");

            if(!Win()){
                Player2.getturn("2");
            }
        }
        Game.Won();
    }
    private static boolean Win() {
        boolean w=false;
        Bank b = new Bank();

        if(b.getBalance()>=3000){
            System.out.println("Spiller 1 har vundet !!!");
            w=true;
        }
        else if (b.getBalance()>=3000){
            System.out.println("Spiller 2 har vundet !!!");
            w=true;
        }

        return w; //TODO 'Player money>3000' substituere det statement, der skal fortælle os, om én spiller har vundet.
    }
    //TODO skal flyttes et mere relavant sted hen, og fikses så spiller 2 kan vinde
    private static void Won(){
        if(Win()) {
            System.out.println();
            System.out.println("Spiller nr.1 vandt");
        } else {
            System.out.println();
            System.out.println("Spiller nr.2 vandt");
        }
    }

}
