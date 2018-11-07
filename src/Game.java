public class Game {
    public static void main(String[] args) {

        Player Player1 = new Player();
        Player Player2 = new Player();
        Rules ex = new Rules();
        Bank b = new Bank();

        while(!Rules.Win()){
            Player1.turn("1");
            //TODO Tænkte at vi kunne flytte switch statementet over i en ny klasse som vi f.eks. kalder "board".
            switch (Player1.getfield()-1) {
                case 1: b.setBalance1(b.getBalance1()+250);
                    System.out.println("Du går forbi et gammelt tårn og finder et lommeur liggende på jorden. +250 guld!");
                    break;
                case 2: b.setBalance1(b.getBalance1()-100);
                    System.out.println("Du finder et stort krater i jorden og kommer til at falde der ned. -100 guld!");
                    break;
                case 3: b.setBalance1(b.getBalance1()+100);
                    System.out.println("Du går forbi en stor palads port og finder en pengepung liggende på jorden. +100 guld!");
                    break;
                case 4: b.setBalance1(b.getBalance1()-20);
                    System.out.println("Du er ude i ørkenen og da det bliver nat, opdager du at du har glemt dit tæppe. -20 guld!");
                    break;
                case 5: b.setBalance1(b.getBalance1()+180);
                    System.out.println("???");
                    break;
                case 6: b.setBalance1(b.getBalance1()+0);
                    System.out.println("Du tager forbi et kloster og opdager et det ikke var anderledes end forventet. +0 guld!");
                    break;
                case 7: b.setBalance1(b.getBalance1()-70);
                    System.out.println("Du finder en mørk grotte som du gerne vil udforske, desværre har du glemt din lommelygte. -70 guld!");
                    break;
                case 8: b.setBalance1(b.getBalance1()+60);
                    System.out.println("Du er ude og klatre i bjergene, da du begynder at blive træt og sulten. Heldigvis ser du en bjerghytte, hvor du kan få lidt mad og få sovet lidt. +60 guld!");
                    break;
                case 9: b.setBalance1(b.getBalance1()-80);
                    System.out.println("???");
                    break;
                case 10: b.setBalance1(b.getBalance1()-50);
                    System.out.println("???");
                    break;
                case 11: b.setBalance1(b.getBalance1()+650);
                    System.out.println("Du finder en gammel guldmine i bjergene og beslutter de for at tage noget af guldet med hjem. +650 guld!");
                    break;}
                    //TODO sout'en nedenunder er bare for testning
                    System.out.println(b.getBalance1());
            Player1.extra("1");

            if(!Rules.Win()){
                Player2.turn("2");
                //TODO Tænkte at vi måske kunne flytte switch statementet over i en ny klasse som vi f.eks. kalder "board".
                switch (Player2.getfield()-1) {
                    case 1: b.setBalance2(b.getBalance2()+250);
                        System.out.println("Du går forbi et gammelt tårn og finder et lommeur liggende på jorden. +250 guld!");
                        break;
                    case 2: b.setBalance2(b.getBalance2()-100);
                        System.out.println("Du finder et stort krater i jorden og kommer til at falde der ned. -100 guld!");
                        break;
                    case 3: b.setBalance2(b.getBalance2()+100);
                        System.out.println("Du går forbi en stor palads port og finder en pengepung liggende på jorden. +100 guld!");
                        break;
                    case 4: b.setBalance2(b.getBalance2()-20);
                        System.out.println("Du er ude i ørkenen og da det bliver nat, opdager du at du har glemt dit tæppe. -20 guld!");
                        break;
                    case 5: b.setBalance2(b.getBalance2()+180);
                        System.out.println("???");
                        break;
                    case 6: b.setBalance2(b.getBalance2()+0);
                        System.out.println("Du tager forbi et kloster og opdager et det ikke var anderledes end forventet. +0 guld!");
                        break;
                    case 7: b.setBalance2(b.getBalance2()-70);
                        System.out.println("Du finder en mørk grotte som du gerne vil udforske, desværre har du glemt din lommelygte. -70 guld!");
                        break;
                    case 8: b.setBalance2(b.getBalance2()+60);
                        System.out.println("Du er ude og klatre i bjergene, da du begynder at blive træt og sulten. Heldigvis ser du en bjerghytte, hvor du kan få lidt mad og få sovet lidt. +60 guld!");
                        break;
                    case 9: b.setBalance2(b.getBalance2()-80);
                        System.out.println("???");
                        break;
                    case 10: b.setBalance2(b.getBalance2()-50);
                        System.out.println("???");
                        break;
                    case 11: b.setBalance2(b.getBalance2()+650);
                        System.out.println("Du finder en gammel guldmine i bjergene og beslutter de for at tage noget af guldet med hjem. +650 guld!");
                        break;}
                //TODO sout'en nedenunder er bare for testning
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
