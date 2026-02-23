import java.util.ArrayList;

public class Customer {
    private String name;
    private String id;
    private ArrayList<Account> accounts;
    protected ArrayList<Transactions> transactionHistory;

    public Customer(String name,String id,ArrayList<Account> accounts,ArrayList<Transactions> transactionHistory){
        this.name=name;
        this.id=id;
        this.accounts=accounts;
        this.transactionHistory=transactionHistory;
    }
    public void openAccounts(Account account){
        this.accounts.add(account);
    }
    public String toString(){
        return  "All your accounts: "+this.accounts;
    }
    public void statement(){
        System.out.println("Statement made for: "+accounts);
        for(Transactions t:transactionHistory){
            t.printTransaction();
        }
    }

}
