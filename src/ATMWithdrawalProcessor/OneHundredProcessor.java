package ATMWithdrawalProcessor;

import ATMRoomRequirements.ATM;

public class OneHundredProcessor extends CashWithdrawalProcessor {

    public OneHundredProcessor(CashWithdrawalProcessor nexProcessor) {
        super(nexProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount) {
        int notesRequired = amount/100;
        int remainingAmount = amount%100;

        if(notesRequired <= atm.getNoOfOneHundredNotes()) {
            atm.deductNoOfOneHundredNotes(notesRequired);
        } else {
            int availableNotes = atm.getNoOfOneHundredNotes();
            atm.deductNoOfOneHundredNotes(availableNotes);
            remainingAmount = remainingAmount + (notesRequired - availableNotes) * 2000;
        }

        if(remainingAmount != 0) {
            super.withdraw(atm, remainingAmount);
        }
    }
    
}
