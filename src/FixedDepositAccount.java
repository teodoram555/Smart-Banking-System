public class FixedDepositAccount extends Account implements Specs{
    public FixedDepositAccount(String accountNumber,String accountHolderName,double balance){
        super(accountNumber,accountHolderName,balance);
    }
    public double calculateInterest(double rate,int term)
    {
        double interest=0.0;
        interest=getBalance()*rate*term;
        return interest;
    }
    @Override
    public boolean withdraw(double money){
        if (money <= 0) {
            System.out.println("Invalid amount");
            return false;
        }
        if(money!=getBalance())
        {
            System.out.println("You can't withdraw this sum");
            return false;
        }
        setBalance(0);
        System.out.println("Empty deposit");
        return true;
    }
}
