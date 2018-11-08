import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PlayerTest {

    @Test
    public void setfield() {
        // Tester om vi kan lande på et felt der ikke befinder sig i intervallet for 1-12.
        for (int i = 0; i < 1100; i++) {
            int tal = DiceCup.getcup();
            assertTrue(tal > 0 && tal < 13);
        }
        // Tester hvor mange gange man lander på hvert enkelt felt.
        int f2 = 0, f3 = 0, f4 = 0, f5 = 0, f6 = 0, f7 = 0, f8 = 0, f9 = 0, f10 = 0, f11 = 0, f12 = 0;
        for (int i = 0; i < 12000; i++) {
            int tal = DiceCup.getcup();

            if (tal == 2) {
                f2++;
            }
            if (tal == 3) {
                f3++;
            }
            if (tal == 4) {
                f4++;
            }
            if (tal == 5) {
                f5++;
            }
            if (tal == 6) {
                f6++;
            }
            if (tal == 7) {
                f7++;
            }
            if (tal == 8) {
                f8++;
            }
            if (tal == 9) {
                f9++;
            }
            if (tal == 10) {
                f10++;
            }
            if (tal == 11) {
                f11++;
            }
            if (tal == 12) {
                f12++;
            }
        }
        System.out.println("Antal gange landt på:");
        System.out.println("Felt 2 = " + f2);
        System.out.println("Felt 3 = " + f3);
        System.out.println("Felt 4 = " + f4);
        System.out.println("Felt 5 = " + f5);
        System.out.println("Felt 6 = " + f6);
        System.out.println("Felt 7 = " + f7);
        System.out.println("Felt 8 = " + f8);
        System.out.println("Felt 9 = " + f9);
        System.out.println("Felt 10 = " + f10);
        System.out.println("Felt 11 = " + f11);
        System.out.println("Felt 12 = " + f12);

    }
}