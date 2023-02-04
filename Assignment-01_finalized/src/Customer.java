public class Customer {
    String name;
    String NICNumber;
    String address;
    Account account;
    Customer next;

    public Customer(String name, String NICNumber, String address, Account account) {
        this.name = name;
        this.NICNumber = NICNumber;
        this.address = address;
        this.account = account;
        this.next = null;
    }
}
