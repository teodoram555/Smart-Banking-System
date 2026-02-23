void main()
{
    ArrayList<Account> myAccounts = new ArrayList<>();
    ArrayList<Transactions> myTransactions = new ArrayList<>();
    Customer customer1 = new Customer("Mihai", "RO-1", myAccounts, myTransactions);

    SavingsAccount savings = new SavingsAccount("RO01SAV", "Mihai", 1500.0, 200.0);
    CurrentAccount current = new CurrentAccount("RO02CUR", "Mihai", 500.0, 1000.0);
    FixedDepositAccount fixed = new FixedDepositAccount("RO03FIX", "Mihai", 5000.0);

    customer1.openAccounts(savings);
    customer1.openAccounts(current);
    customer1.openAccounts(fixed);


    System.out.println("Test SavingsAccount");
    savings.withdraw(1400);
    savings.withdraw(500);

    System.out.println("Test CurrentAccount");
    current.withdraw(1000);
    current.withdraw(600);

    System.out.println("Test FixedDepositAccount");
    fixed.withdraw(1000);
    fixed.withdraw(5000);

    System.out.println("Interest");
    double rate = 0.05;
    int term = 12;


    for(Account acc : myAccounts) {

        if(acc instanceof Specs) {
            Specs specAccount = (Specs) acc;
            double dobanda = specAccount.calculateInterest(rate, term);

            System.out.println("The interest for " + acc.accountNumber + " is " + dobanda);
        }
    }

    System.out.println("Statement");

    customer1.statement();

}