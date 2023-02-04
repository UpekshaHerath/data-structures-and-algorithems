public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Upeksha", "200032000448", "Kurunegala", new Account("2345", 20000.00f, "Saving"));
        Customer customer2 = new Customer("Dilshan", "200032000456", "Anuradhapura", new Account("1234", 40000.00f, "Current"));
        Customer customer3 = new Customer("Herath", "200032000457", "kandy", new Account("1250", 45000.00f, "Saving"));

        Bank cl = new Bank();
        cl.addCustomerToFront(customer1);
        cl.addCustomerToFront(customer2);
        cl.addCustomerToFront(customer3);
        cl.printCustomers();

        // search for an account
        if (cl.searchForAccountHolder("Dilshan", "200032000456") == null) {
            System.out.println("There is not a customer like this");
        } else {
            System.out.println("This customer has an account in the Bank\n");
        }

        System.out.println("After the removal of customer1");
        cl.removeCustomer(customer1);
        cl.printCustomers();

        System.out.println("After the adding of an account to the customer2 (Dilshan)");
        cl.addAccountToCustomer(customer2, new Account("1000", 45000.00f, "Saving"));
        cl.printCustomers();

        System.out.println("After the removal of account of the customer2 (Dilshan)");
        cl.removeAccount(customer2, "Current");
        cl.printCustomers();

    }
}
