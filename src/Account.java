public class Account
{
    public String accountNumber;
    public String accountHolderName;
    private double balance;

    public Account(String accountNumber,String accountHolderName,double balance)
    {
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public boolean withdraw(double money)
    {
        if(money<=this.balance)
        {
            System.out.println("Successful withdraw "+money);
            this.balance=-money;
            return true;
        }
        else{
            System.out.println("Insufficient funds.The current balance is  "+this.balance);
            return false;
        }
    }
    public double deposit(double money)
    {
        if(money>0)
        {
            System.out.println("You added "+money+"in your account");
            this.balance+=money;
            double newBalance=this.balance;
            System.out.println("Your current balance is "+newBalance);
            return newBalance;
        }
        else{
            System.out.println("The transaction couldn't be made");
            return this.balance;
        }
    }
    public double getBalance()
    {
        return this.balance;
    }
    public double setBalance(double newBalance){
        newBalance=getBalance();
        return newBalance;
    }
}
