package day35_Encapsulation.encapsulation.Task;

public class BankAccount {
    //3. create a class named BankAccount
    //        Private variables:
    //            accountHolder, accountNumber, balance

    private String accountHolder;
    private long accountNumber;
    private long balance;

    //        encapsulate all the fields

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;

    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
// did not generate setter for balance, because balance should only be set when deposit() & withdraw() methods are being executed

    //        Add a constructor that allows user to set all the fields when the object is created.
    //                        (If the arguments not valid it should not be set to the instances)


    //        Extra methods:
    //                deposit()

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Depositing amount can not be negative or zero");
            System.exit(1);
        }
        System.out.println("Depositing $" + " amount + " + accountNumber);
        balance += amount;
    }

    //                withdraw()
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.err.println("Withdrawing amount can not be negative or zero");
            System.exit(1);
        }

        //                checkbalance()
        if (balance <= 0) {
            System.err.println("Insufficient balance");
            System.exit(1);
        }
        System.out.println("Withdrawing $" + amount + " from the account " + accountNumber);
        balance -= amount;
        //                toString()


        //
        //            DO NOT duplicate any code fragments
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
