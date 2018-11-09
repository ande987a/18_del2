public class Bank {

    private int balance = 1000;

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            this.balance = 0;
        } else
            this.balance = balance;
    }

}

