import java.util.Scanner;

public class Player {

    private int field;
    private Scanner Scanner = new Scanner(System.in);
    private String kast="";

    private void turn(){
        do {
            System.out.println("Tast 2 for at kaste terningen: ");
            kast = Scanner.nextLine();
        } while (forkert());
        setfield(Dice.getcup());
        System.out.println("Spilleren landte på felt nr. " + getfield() + ".");
    }

    public void setfield(int field) {
        this.field = field;
    }
    public int getfield(){
        return field;
    }
    public void getturn() {
    turn();
    }
    public boolean forkert(){
        boolean forkert;
        if (!kast.equals("2")) {  //tjekker for korrekt input
            System.out.println("Forkert input...");
           forkert =true;
        } else {
            forkert = false;
        }
        return forkert;
    }


    public static boolean Win() {
        boolean w=false;
        //if(Player money>3000){
        // w=true}
        return w; //TODO 'Player money>3000' substituere det statement, der skal fortælle os, om én spiller har vundet.
    }




}
