package ATMWithdrawalProcessor;

import ATMRoomRequirements.ATM;

public class TwoThousandProcessor extends CashWithdrawalProcessor {
    
    public TwoThousandProcessor(CashWithdrawalProcessor nexWithdrawalProcessor) {
        super(nexWithdrawalProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount) {
        int notesRequired = amount/2000;
        int remainingAmount = amount%2000;

        if(notesRequired <= atm.getNoOfTwothousandNotes()) {
            atm.deductNoOfTwoThousandNotes(notesRequired);
        } else {
            int availableNotes = atm.getNoOfTwothousandNotes();
            atm.deductNoOfTwoThousandNotes(availableNotes);
            remainingAmount = remainingAmount + (notesRequired - availableNotes) * 2000;
        }

        if(remainingAmount != 0) {
            super.withdraw(atm, remainingAmount);
        }
    }
}
