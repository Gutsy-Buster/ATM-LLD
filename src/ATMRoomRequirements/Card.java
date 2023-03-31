package ATMRoomRequirements;

public class Card {
    int cardNumber;
    int cardExpiry;
    int cvv;
    String cardHolderName;
    private static final int PIN_NUMBER = 1997;
    BankAccount bankAccount;

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardExpiry() {
        return this.cardExpiry;
    }

    public void setCardExpiry(int cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public boolean validatePin(final int pinCode) {
        return PIN_NUMBER == pinCode;
    }
}
