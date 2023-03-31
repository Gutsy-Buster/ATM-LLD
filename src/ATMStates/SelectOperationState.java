package ATMStates;

import ATMRoomRequirements.ATM;
import ATMRoomRequirements.Card;
import ATMRoomRequirements.TransactionType;

public class SelectOperationState extends ATMState {
    public SelectOperationState() {
        System.out.println("Please select from below options");
        showTransactions();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType type) {
        switch(type) {
            case CASH_WITHDRAWAL: atm.setCurrentState(new CashWithdrawalState());
                                  break;
            case CHECK_BALANCE: atm.setCurrentState(new CheckBalanceState());
                                break;
            default: System.out.println("Invalid option");
                     exit(atm);
                    break;
        }
    }

    @Override
    public void exit(ATM atm) {
        returnBack();
        atm.setCurrentState(new IdleState());
        System.out.println("Exited transaction");
    }


    public void showTransactions() {
        TransactionType.showTransactionTypes();
    }
}
