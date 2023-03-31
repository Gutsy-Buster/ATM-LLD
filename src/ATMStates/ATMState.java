package ATMStates;

import ATMRoomRequirements.ATM;
import ATMRoomRequirements.Card;
import ATMRoomRequirements.TransactionType;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPs! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("OOPs! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType type) {
        System.out.println("OOPs! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmount) {
        System.out.println("OOPs! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card) {
        System.out.println("OOPs! Something went wrong");
    }

    public void exit(ATM atm) {
        System.out.println("OOPs! Something went wrong");
    }

    public void returnBack() {
        System.out.println("Please collect your card");
    }
}
