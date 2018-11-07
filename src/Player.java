import java.util.Scanner;

public class Player {

    private int field;
    private Scanner Scanner = new Scanner(System.in);
    private String kast="";

    public void turn(String arg){
        System.out.println();
        System.out.println("Spiller nr."+arg +" kaster");
        do {
            System.out.println("Tast 2 for at kaste terningen: ");
            kast = Scanner.nextLine();
        } while (wrongin());
        setfield(Dice.getcup());
        System.out.println("Spilleren landte på felt nr. " + getfield() + ".");
    }

    public void setfield(int field) {
        this.field = field;
    }
    public int getfield(){
        return this.field;
    }

    public boolean wrongin(){
        boolean wrong;
        if (!kast.equals("2")) {  //tjekker for korrekt input
            System.out.println("Forkert input...");
            wrong =true;
        } else {
            wrong = false;
        }
        return wrong;
    }

    //TODO har rykket extra herind for at teste/lave den færdig, hvilket jeg ikke kunne i den anden klasse, eftersom den ikke opdaterede
    public void extra(String arg){
        while(getfield()==10) {
            turn(arg);
        }
        // (◉͜ʖ ◉) System.out.println(getfield()); //denne linje er kun til test, vi skriver det, med den ekstra tur, på samme tid som flavor-teksten til hvert felt.
    }




}
