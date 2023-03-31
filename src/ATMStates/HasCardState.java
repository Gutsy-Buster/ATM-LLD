package ATMStates;

import ATMRoomRequirements.ATM;
import ATMRoomRequirements.Card;

public class HasCardState extends ATMState {

    public HasCardState() {
        System.out.println("Successfully Inserted card");
    }
    
    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        if(card.validatePin(pin)) {
            System.out.println("Pin validated");
            atm.setCurrentState(new SelectOperationState());
        } else {
            System.out.println("Invalid Pin");
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        returnBack();
        atm.setCurrentState(new IdleState());
        System.out.println("Exited transaction");
    }
}
