public class Dice {
    private static int roll() {
        float t1 = (float) Math.random();
        float t2 = t1 * 5;
        int t3 = Math.round(t2);
        return t3 + 1;
    }

    private static int cup() {
        return Dice.roll() + Dice.roll();
    }

    public static int getcup(){
        return cup();
    }

}
