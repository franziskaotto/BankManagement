import java.util.ArrayList;
import java.util.Scanner;

public class BankManagement {

    private ArrayList<Customer> customerList;
    private ArrayList<BankAccount> bankAccountList;

    // Constructor to initialize customerList and bankAccountList


    public BankManagement() {
        this.customerList = new ArrayList<>();
        this.bankAccountList = new ArrayList<>();
    }


    public Customer addNewCustomer(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("You want to add a new Customer, please enter details: \n name: ");
        String name = scanner.nextLine();
        System.out.print("age: ");
        int age = scanner.nextByte();
        System.out.print("address: ");
        String address = scanner.nextLine();

        Customer newCustomer = new Customer(name, age, address);
        customerList.add(newCustomer);

        System.out.println(newCustomer);
        return newCustomer;

    }

    public void listClients(){
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

    }




        /*
        here comes the scanner
        the arrays for new clients

            im bankmanager die arrays als constructor schreiben, den dann in main initialisieren


         */

    //getters:
    public ArrayList<Customer> getClientList() {
        return customerList;
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }




}
