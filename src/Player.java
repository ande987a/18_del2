import java.util.Scanner;

public class Player {

    public static void turn(){
        int t = 0,felt=0;
        boolean f=false;
        Scanner Scanner = new Scanner(System.in);

        do {
            System.out.println("Tast 2 for at kaste terningen: ");
            t=Dice.cup();
            String kast = Scanner.nextLine();
            if (kast.equals("2")) {  //tjekker for korrekt input
                f=false;
                System.out.println("Spilleren slog: " + t);
                System.out.println();
                felt += t;
                if(felt>12){
                    felt+=-12;
                }
                System.out.println("Spiller landte på felt nr. " + felt + ".");
                //TODO Her skal muligvis være en set felt, så vi kan udregne den opdaterede kapital

            } else {
                System.out.println("Forkert input...");
                f=forkert();
            }
        } while (f); //tjekker for 2 ens
        //Scanner.close();  TODO ret sikker på, at denne skal være der, et sted, men den crasher koden, fordi hoveddokumentet ikke importere java.util.scanner... hvilket det heller ikke burde behøve.
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

    //TODO? her skal muligvis laves en metode, der udføre vores if 'felt>12'.


}
