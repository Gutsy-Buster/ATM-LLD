package ATMRoomRequirements;

public class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void updateBalance(final int amount) {
        balance = balance - amount;
    }
}
