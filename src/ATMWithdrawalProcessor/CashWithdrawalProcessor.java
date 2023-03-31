package ATMWithdrawalProcessor;

import ATMRoomRequirements.ATM;

public abstract class CashWithdrawalProcessor {
    
    CashWithdrawalProcessor nextProcessor;

    public CashWithdrawalProcessor(CashWithdrawalProcessor nexProcessor) {
        this.nextProcessor = nexProcessor;
    }

    public void withdraw(ATM atm, int amount) {
        if(nextProcessor != null) {
            nextProcessor.withdraw(atm, amount);
        } else if(amount != 0) {
            System.out.println("Insufficient notes in ATM machine");
        }
    }
}
