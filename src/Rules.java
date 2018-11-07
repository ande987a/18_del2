public class Rules {

    private Player p = new Player();
    //TODO virker endnu ikke inde i Game.java
    public void extra(String arg){
        while(p.getfield()==10) {
            p.turn(arg);
        }
    }





    public static boolean Win() {
        boolean w=false;
        //if(Player money>3000){
        // w=true}
        return w; //TODO 'Player money>3000' substituere det statement, der skal fortælle os, om én spiller har vundet.
    }



}
