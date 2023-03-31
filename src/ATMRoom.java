import ATMRoomRequirements.ATM;
import ATMRoomRequirements.BankAccount;
import ATMRoomRequirements.Card;
import ATMRoomRequirements.User;

public class ATMRoom {
    ATM atm;
    User user;

    public ATMRoom() {
        atm = new ATM();
        atm.setAtmBalance(3500, 1, 2, 5);
        user = createUser();
    }

    private User createUser() {
        User user = new User(createCard());
        return user;
    }

    private Card createCard() {
        Card card = new Card();
        card.setBankAccount(craeteBankAccount());
        return card;
    }

    private BankAccount craeteBankAccount() {
        BankAccount bankAccount = new BankAccount(3000);
        return bankAccount;
    }
}
