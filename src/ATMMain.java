import ATMRoomRequirements.TransactionType;

public class ATMMain {
    public static void main(String[] args) throws Exception {
        ATMRoom atmRoom = new ATMRoom();

        atmRoom.atm.displayCurrentStatu();
        atmRoom.atm.getCurrentState().insertCard(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.getCurrentState().authenticatePin(atmRoom.atm, atmRoom.user.getCard(), 1997);
        atmRoom.atm.getCurrentState().selectOperation(atmRoom.atm, atmRoom.user.getCard(), TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentState().cashWithdrawal(atmRoom.atm, atmRoom.user.getCard(), 2700);
        atmRoom.atm.getCurrentState().displayBalance(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.displayCurrentStatu();
    }
}
