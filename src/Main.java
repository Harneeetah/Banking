public class Main {
    public static void main(String[] args){
      Bank bank = new Bank("FC Bank");
      bank.addBranch("Lagos");
      bank.addCustomer("Lagos", "Annie", 200.50);
      bank.addCustomer("Lagos", "Joy", 80.8);
      bank.addCustomer("Lagos", "Justice", 90.8);

      bank.addBranch("Delta");
      bank.addCustomer("Delta", "Peace", 70);

        bank.addCustomerTransaction("Lagos", "Annie", 500.50);
        bank.addCustomerTransaction("Lagos", "Justice", 60.8);
        bank.addCustomerTransaction("Lagos", "Justice", 10.8);

        bank.listCustomers("Lagos", true);
         bank.listCustomers("Delta", true);


    }
}
