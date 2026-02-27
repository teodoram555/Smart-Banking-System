import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BankDataLoader {
    public Customer loadFromFile(String file){
        ArrayList<Account> account=new ArrayList<>();
        ArrayList<Transactions> transaction=new ArrayList<>();
        Customer customer=null;
        try{
            File myFile=new File(file);
            Scanner reader=new Scanner(myFile);

            String firstLine=reader.nextLine();
            String[] customerData=firstLine.split(",");
            String name=customerData[0];
            String id=customerData[1];

            customer=new Customer(name,id,account,transaction);

            while(reader.hasNextLine()){
                String line=reader.nextLine();
                String[] accountData=line.split(",");

                String accountType=accountData[0];
                String iban=accountData[1];
                double accBalance=Double.parseDouble(accountData[2]);

                if(accountType.equals("SAVINGS")){
                    double minBalance=Double.parseDouble(accountData[3]);
                    customer.openAccounts(new SavingsAccount(iban,name,accBalance,minBalance));
                }
                else if(accountType.equals("CURRENT")){
                    double limit=Double.parseDouble(accountData[3]);
                    customer.openAccounts(new CurrentAccount(iban,name,accBalance,limit));
                } else if (accountType.equals("FIXED")) {
                    customer.openAccounts(new FixedDepositAccount(iban,name,accBalance));
                }

            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("The file " + file + " was not found");
        }
        return customer;
    }
}
