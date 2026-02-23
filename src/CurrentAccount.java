public class CurrentAccount extends Account implements Specs {

    public double limit;

    public CurrentAccount(String accountNumber,String accountHolderName,double balance,double limit){
        super(accountNumber,accountHolderName,balance);
        this.limit=limit;
    }
    public double calculateInterest(double rate,int term)
    {
        return 0;
    }
    @Override
    public boolean withdraw(double money){
        if (money <= 0) {
            System.out.println("Invalid amount");
            return false;
        }
        if(money>getBalance()+limit)
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
