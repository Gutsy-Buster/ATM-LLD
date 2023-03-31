package ATMStates;

import ATMRoomRequirements.ATM;
import ATMRoomRequirements.Card;

public class CheckBalanceState extends ATMState {
    
    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your balance is : " + card.getBankAccount().getBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        returnBack();
        atm.setCurrentState(new IdleState());
        System.out.println("Exited transaction");
    }
}
