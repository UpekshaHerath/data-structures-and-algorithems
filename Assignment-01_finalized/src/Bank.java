public class Bank {
    Customer head;

    // add customer to front of the customer linked list
    public void addCustomerToFront(String name, String NICNumber, String address, Account account) {
        Customer newCustomer = new Customer(name, NICNumber, address, account);
        newCustomer.next = head;
        head = newCustomer;
    }
    public void addCustomerToFront(Customer passedCustomer) {
        passedCustomer.next = head;
        head = passedCustomer;
    }

    // when passing the name and the nic this method will return reference to the customer object
    public Customer searchForAccountHolder(String name, String NICNumber) {
        Customer current = head;
        while (current != null) {
            if (current.name.equals(name) && current.NICNumber.equals(NICNumber)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // remove the account holder
    public void removeCustomer(Customer customer) {
        if (head == null) {
            return;
        }
        if (head == customer) {
            head = head.next;
            return;
        }
        Customer current = head;
        while (current.next != null) {
            if (current.next == customer) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // add an account to the back of the account linked list
    public void addAccountToCustomer(Customer customer, Account account) {
        Account currentAccount = customer.account;
        while (currentAccount.next != null) {
            currentAccount = currentAccount.next;
        }
        currentAccount.next = account;
    }

    // remove an account when typeOfAccount and accountHolder is given
    public void removeAccount(Customer customer, String typeOfAccount) {
        Account currentAccount = customer.account;
        if (currentAccount.typeOfAccount.equals(typeOfAccount)) {
            customer.account = currentAccount.next;
            return;
        }
        while (currentAccount.next != null) {
            if (currentAccount.next.typeOfAccount.equals(typeOfAccount)) {
                currentAccount.next = currentAccount.next.next;
                return;
            }
            currentAccount = currentAccount.next;
        }
    }

    // print the details of the customers with all the accounts
    public void printCustomers() {
        Customer current = head;
        while (current != null) {
            System.out.println("*******************************");
            System.out.println("Name: " + current.name);
            System.out.println("NIC Number: " + current.NICNumber);
            System.out.println("Address: " + current.address);
            Account account = current.account;
            while (account != null) {
                System.out.println("Account Number: " + account.accountNumber);
                System.out.println("Current Balance: " + account.currentBalance);
                System.out.println("Type of Account: " + account.typeOfAccount);
                account = account.next;
            }
            System.out.println("*******************************");
            System.out.println();
            current = current.next;
        }
    }
}

