public class SavingsAccount extends Account implements Specs {

    double minBalance;

    public SavingsAccount(String accountNumber,String accountHolderName,double balance,double minBalance){
        super(accountNumber,accountHolderName,balance);
        this.minBalance=minBalance;
    }
    @Override
    public double calculateInterest(double rate,int term){
        double interest=0.0;
        interest=getBalance()*rate;
        return interest;
    }
    @Override
    public boolean withdraw(double money){
        if (money <= 0) {
            System.out.println("Invalid amount");
            return false;
        }
        if((getBalance()-money)<minBalance)
        {
            System.out.println("Insufficient funds");
            return false;
        }
        else{
            setBalance(getBalance()-money);
            System.out.println("Successful withdraw "+money);
            return true;
        }
    }
}
