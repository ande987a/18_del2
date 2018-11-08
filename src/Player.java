import java.util.Scanner;

public class Player {

    private int field;
    private Scanner Scanner = new Scanner(System.in);
    private Bank b = new Bank();
    private String kast = "";
    private boolean a = true; //TODO find en bedre måde at stoppe dobbeltudprint ved ekstratur på.
    boolean win = false;

    private void turn(String arg) {
        System.out.println();
        System.out.println("Spiller nr." + arg + " kaster");
        do {
            System.out.println("Tast 2 for at kaste terningen: ");
            kast = Scanner.nextLine();
        } while (wrongin());
        setfield(DiceCup.getcup());
        System.out.println("Spilleren landte på felt nr. " + getfield() + ".");

        fieldtype(arg);
        Win(arg);
    }

    public void setfield(int field) {
        this.field = field;
    }

    public int getfield() {
        return this.field;
    }

    public void getturn(String arg) {
        turn(arg);
    }

    private boolean wrongin() {
        boolean wrong;
        if (!kast.equals("2")) {  //tjekker for korrekt input
            System.out.println("Forkert input...");
            wrong = true;
        } else {
            wrong = false;
        }
        return wrong;
    }

    private void fieldtype(String arg) {
        switch (getfield() - 1) {
            case 1:
                b.setBalance(b.getBalance() + 250);
                System.out.println("Du går forbi et gammelt tårn og finder et lommeur liggende på jorden. +250 guld!");
                break;
            case 2:
                b.setBalance(b.getBalance() - 100);
                System.out.println("Du finder et stort krater i jorden og kommer til at falde der ned. -100 guld!");
                break;
            case 3:
                b.setBalance(b.getBalance() + 100);
                System.out.println("Du går forbi en stor palads port og finder en pengepung liggende på jorden. +100 guld!");
                break;
            case 4:
                b.setBalance(b.getBalance() - 20);
                System.out.println("Du er ude i ørkenen og da det bliver nat, opdager du at du har glemt dit tæppe. -20 guld!");
                break;
            case 5:
                b.setBalance(b.getBalance() + 180);
                System.out.println("Du tager forbi 'Kowloon Walled City' og stjæler fra en tilfældig pusher. +180 guld!");
                break;
            case 6:
                b.setBalance(b.getBalance() + 0);
                System.out.println("Du tager forbi et kloster og opdager et det ikke var anderledes end forventet. +0 guld!");
                break;
            case 7:
                b.setBalance(b.getBalance() - 70);
                System.out.println("Du finder en mørk grotte som du gerne vil udforske, desværre har du glemt din lommelygte. -70 guld!");
                break;
            case 8:
                b.setBalance(b.getBalance() + 60);
                System.out.println("Du er ude og klatre i bjergene, da du begynder at blive træt og sulten. Heldigvis ser du en bjerghytte, hvor du kan få lidt mad og få sovet lidt. +60 guld!");
                break;
            case 9:
                b.setBalance(b.getBalance() - 80);
                System.out.println("Du støder ind i en mur af varulve, heldigvis finder du en butik, der sælger kødben. -80 guld! +ekstra tur");
                System.out.println(b.getBalance());
                a = false;
                turn(arg);
                a = true;
                break;
            case 10:
                b.setBalance(b.getBalance() - 50);
                System.out.println("Du går en tur og tilfældigvis falder du ned i et hul i vejen");
                break;
            case 11:
                b.setBalance(b.getBalance() + 650);
                System.out.println("Du finder en gammel guldmine i bjergene og beslutter de for at tage noget af guldet med hjem. +650 guld!");
                break;
        }
        if (a) System.out.println(b.getBalance());
    }

    private boolean Win(String arg) {
        if (b.getBalance() >= 3000) {
            System.out.println("Spiller " + arg + " har vundet !!!");
            win = true;
        }

        return win;
    }

    public boolean getwin() {
        return win;
    }

}
