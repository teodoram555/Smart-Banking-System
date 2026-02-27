void main()
{
    BankDataLoader loader = new BankDataLoader();

    Customer customer1 = loader.loadFromFile("src/BankData.txt");

    if (customer1 != null) {
        System.out.println("Data loaded successfully" + customer1.toString());
        customer1.statement();

    } else {
        System.out.println("No data in the database");
    }
}