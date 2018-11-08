import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BankTest {


    // Vi tester om vores balance kan blive under 0, hvilket testen viser ikke kan lade sig gøre.
    @Test
    public void setBalance() {
        Bank b = new Bank();
        b.setBalance(-1000);
        int x = b.getBalance();
        assertTrue(x >= 0);
    }


}