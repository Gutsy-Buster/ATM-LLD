package ATMWithdrawalProcessor;

import ATMRoomRequirements.ATM;

public class FiveHundredProcessor extends CashWithdrawalProcessor {

    public FiveHundredProcessor(CashWithdrawalProcessor nexProcessor) {
        super(nexProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount) {
        int notesRequired = amount/500;
        int remainingAmount = amount%500;

        if(notesRequired <= atm.getNoOfFiveHundredNotes()) {
            atm.deductNoOfFiveHundredNotes(notesRequired);
        } else {
            int availableNotes = atm.getNoOfFiveHundredNotes();
            atm.deductNoOfFiveHundredNotes(availableNotes);
            remainingAmount = remainingAmount + (notesRequired - availableNotes) * 500;
        }

        if(remainingAmount != 0) {
            super.withdraw(atm, remainingAmount);
        }
    }
    
}
