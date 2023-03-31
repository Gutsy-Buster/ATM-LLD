package ATMStates;

import ATMRoomRequirements.ATM;
import ATMRoomRequirements.Card;

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Please insert your card");
        System.out.println();
        atm.setCurrentState(new HasCardState());
    }
}
