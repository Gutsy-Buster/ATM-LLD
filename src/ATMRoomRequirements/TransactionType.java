package ATMRoomRequirements;

public enum TransactionType {
    CASH_WITHDRAWAL,
    CHECK_BALANCE;

    public static void showTransactionTypes() {
        for(TransactionType type: TransactionType.values()) {
            System.out.println(type.name());
        }
    }
}
