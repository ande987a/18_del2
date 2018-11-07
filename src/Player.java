import java.util.Scanner;

public class Player {

    private static void turn(){
        int field;
        boolean f;
        Scanner Scanner = new Scanner(System.in);

        do {
            System.out.println("Tast 2 for at kaste terningen: ");
            String kast = Scanner.nextLine();
            if (kast.equals("2")) {  //tjekker for korrekt input
                f=false;
                field=Dice.getcup();
                System.out.println("Spilleren landte på felt nr. " + field + ".");
                setfield(field);
            } else {
                System.out.println("Forkert input...");
                f=forkert();
            }
        } while (f);
    }

    public static int setfield(int field) {
        return field;
    }

    public static void getturn() {
    turn();
    }

    public static boolean forkert(){ //TODO er det her for meget? altså, vi opdatere jo stadig vores f inde i Player.turn, så denne er vel overflødig???
        return true;
    }


    public static boolean Win() {
        boolean w=false;
        //if(Player money>3000){
        // w=true}
        return w; //TODO 'Player money>3000' substituere det statement, der skal fortælle os, om én spiller har vundet.
    }




}
