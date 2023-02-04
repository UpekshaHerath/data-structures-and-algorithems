public class Account {
    String accountNumber;
    float currentBalance;
    String typeOfAccount;
    Account next;

    public Account(String accountNumber, float currentBalance, String typeOfAccount) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.typeOfAccount = typeOfAccount;
        this.next = null;
    }
}
