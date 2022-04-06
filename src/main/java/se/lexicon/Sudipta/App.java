package se.lexicon.Sudipta;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ){
        Customer customer1=new Customer("Emily anderson","emily22@gmail.com",635627889);
        BankAccount account1=new BankAccount(737847749,customer1);

        Customer customer2=new Customer("Maria Svensson","maria21@gmail.com",464474067);
        BankAccount account2=new BankAccount(277948887,customer2);

        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        System.out.println(account1.getCustomer().getCustomerInformation());

        System.out.println(account1.getBalance());
        account1.deposit(20000);
        System.out.println(account1.getBalance());
        account1.withdraw(5000);
        System.out.println(account1.getBalance());



        System.out.println(account2.getCustomer().getCustomerInformation());
    }
}

