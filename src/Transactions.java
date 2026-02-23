public class Transactions {
    private String type;
    private double amount;
    private double resultingBalance;

    public Transactions(String type,double amount,double resultingBalance){
        this.type=type;
        this.amount=amount;
        this.resultingBalance=resultingBalance;
    }
    public void printTransaction()
    {
        System.out.println(type+" Amount: "+amount+" Resulting Balance: "+resultingBalance);
    }
}
