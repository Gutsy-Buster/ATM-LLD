package ATMStates;

import ATMRoomRequirements.ATM;
import ATMRoomRequirements.Card;
import ATMWithdrawalProcessor.CashWithdrawalProcessor;
import ATMWithdrawalProcessor.FiveHundredProcessor;
import ATMWithdrawalProcessor.OneHundredProcessor;
import ATMWithdrawalProcessor.TwoThousandProcessor;

public class CashWithdrawalState extends ATMState {

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmount) {
        if(atm.getAtmBalance() <= withdrawalAmount) {
            System.out.println("Insufficient funds in ATM Machine");
            exit(atm);
        } else if(card.getBankAccount().getBalance() < withdrawalAmount) {
            System.out.println("Insufficient funds in your bank account");
            exit(atm);
        } else {
            atm.deductATMBalance(withdrawalAmount);
            card.getBankAccount().updateBalance(withdrawalAmount);

            CashWithdrawalProcessor processor = new TwoThousandProcessor(
                new FiveHundredProcessor(new OneHundredProcessor(null)));

            processor.withdraw(atm, withdrawalAmount);
            atm.setCurrentState(new CheckBalanceState());
        }
    }

    @Override
    public void exit(ATM atm) {
        returnBack();
        atm.setCurrentState(new IdleState());
        System.out.println("Exited transaction");
    }
}
