package ATMRoomRequirements;

public class User {
    Card card;

    public User(final Card card) {
        this.card = card;
    }

    public Card getCard() {
        return this.card;
    }
}
