public class Rules {

    private Player p = new Player();
    //TODO hmm







    public static boolean Win() {
        boolean w=false;
        Bank b = new Bank();

        if(b.getBalance1()>=3000){
            System.out.println("Spiller 1 har vundet !!!");
            w=true;
        }
        else if (b.getBalance2()>=3000){
            System.out.println("Spiller 2 har vundet !!!");
            w=true;
        }

        return w; //TODO 'Player money>3000' substituere det statement, der skal fortælle os, om én spiller har vundet.
    }
}
