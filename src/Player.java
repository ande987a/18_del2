import java.util.Scanner;

public class Player {

    private int field;
    private Scanner Scanner = new Scanner(System.in);
    private String kast="";

    private void turn(String arg){
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
    public void getturn(String arg){turn(arg);}

    private boolean wrongin(){
        boolean wrong;
        if (!kast.equals("2")) {  //tjekker for korrekt input
            System.out.println("Forkert input...");
            wrong =true;
        } else {
            wrong = false;
        }
        return wrong;
    }

    private Bank b = new Bank();
private void fieldtype(String arg){
    switch (getfield()-1) {
        case 1: b.setBalance(b.getBalance()+250);
            System.out.println("Du går forbi et gammelt tårn og finder et lommeur liggende på jorden. +250 guld!");
            break;
        case 2: b.setBalance(b.getBalance()-100);
            System.out.println("Du finder et stort krater i jorden og kommer til at falde der ned. -100 guld!");
            break;
        case 3: b.setBalance(b.getBalance()+100);
            System.out.println("Du går forbi en stor palads port og finder en pengepung liggende på jorden. +100 guld!");
            break;
        case 4: b.setBalance(b.getBalance()-20);
            System.out.println("Du er ude i ørkenen og da det bliver nat, opdager du at du har glemt dit tæppe. -20 guld!");
            break;
        case 5: b.setBalance(b.getBalance()+180);
            System.out.println("Du stjæler fra en tilfældig pusher. +180 guld!");
            break;
        case 6: b.setBalance(b.getBalance()+0);
            System.out.println("Du tager forbi et kloster og opdager et det ikke var anderledes end forventet. +0 guld!");
            break;
        case 7: b.setBalance(b.getBalance()-70);
            System.out.println("Du finder en mørk grotte som du gerne vil udforske, desværre har du glemt din lommelygte. -70 guld!");
            break;
        case 8: b.setBalance(b.getBalance()+60);
            System.out.println("Du er ude og klatre i bjergene, da du begynder at blive træt og sulten. Heldigvis ser du en bjerghytte, hvor du kan få lidt mad og få sovet lidt. +60 guld!");
            break;
        case 9: b.setBalance(b.getBalance()-80);
            System.out.println("Du støder ind i en mur af varulve, heldigvis finder du en butik som sælger kødben. -80 guld! +ekstra tur");
            turn(arg);
            break;
        case 10: b.setBalance(b.getBalance()-50);
            System.out.println("Du går en tur og tilfældigvis falder du ned i et hul i vejen");
            break;
        case 11: b.setBalance(b.getBalance()+650);
            System.out.println("Du finder en gammel guldmine i bjergene og beslutter de for at tage noget af guldet med hjem. +650 guld!");
            break;}
    //TODO sout'en nedenunder er bare for testning
    System.out.println(b.getBalance());
}

public void getfieldtype(String arg){ //TODO Behøves denne... må den tilhørende funktion være public?
    fieldtype(arg);
}


}
