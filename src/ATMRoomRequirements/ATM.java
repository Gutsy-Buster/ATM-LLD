package ATMRoomRequirements;

import ATMStates.ATMState;
import ATMStates.IdleState;

public class ATM {
    int atmBalance;
    int noOfTwothousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    ATMState currentState;

    public ATM() {
        currentState = new IdleState();
    }

    public int getAtmBalance() {
        return this.atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfTwothousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwothousandNotes = noOfTwothousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public int getNoOfTwothousandNotes() {
        return this.noOfTwothousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return this.noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return this.noOfOneHundredNotes;
    }

    public ATMState getCurrentState() {
        return this.currentState;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public void deductATMBalance(final int amount) {
        atmBalance = atmBalance -  amount;
    }

    public void deductNoOfTwoThousandNotes(final int notes) {
        noOfTwothousandNotes = noOfTwothousandNotes - notes;
    }

    public void deductNoOfFiveHundredNotes(final int notes) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - notes;
    }

    public void deductNoOfOneHundredNotes(final int notes) {
        noOfOneHundredNotes = noOfOneHundredNotes - notes;
    }

    public void displayCurrentStatu() {
        System.out.println("Current Balance of ATM"); 
        System.out.println("Balance  : " + atmBalance);
        System.out.println("2K notes  : " + noOfTwothousandNotes);
        System.out.println("500 notes : " + noOfFiveHundredNotes);
        System.out.println("100 notes : " + noOfOneHundredNotes);
    }
}
