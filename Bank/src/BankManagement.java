import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BankManagement {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Customer> customerList;
    private ArrayList<BankAccount> bankAccountList;

    public BankManagement() {
        this.customerList = new ArrayList<>();
        this.bankAccountList = new ArrayList<>();
    }


    public void addNewCustomer(Customer customer){

        customerList.add(customer);


        //hier in 2. function auslagern

        int accountNumber = createAccountNumber();
        System.out.println("start balance: ");
        double startBalance = scanner.nextDouble();
        scanner.nextLine();

        BankAccount newAccount = new BankAccount(accountNumber, customer, startBalance);
        bankAccountList.add(newAccount);


    }

    public Customer createNewCustomer() {
        System.out.print("You want to add a new Customer, please enter details: \n name: ");
        String name = scanner.nextLine();
        System.out.print("age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("address: ");
        String address = scanner.nextLine();


        Customer newCustomer = new Customer(name, age, address);
        return newCustomer;
    }



    public int createAccountNumber(){
        Random randomNumber = new Random();
        return randomNumber.nextInt(5000); //number in () is the obergrenze zwischen 0 und dem wert
    }

    public String getCustomer(){}


    public void listClients(){
        for (Customer customer : customerList) {
            System.out.println(customer); //java.lang.toString method, i overwrote it in Customer.java
        }

        for (BankAccount account : bankAccountList) {
            System.out.println(account);
        }
    }

    public void showBalanceForUser(){
        for (Customer customer : customerList) {
            System.out.println(customer.name); //java.lang.toString method, i overwrote it in Customer.java
        }

        System.out.println("For which client do you want to see the balance? Type here: ");
        String selectedUser = scanner.nextLine();
        System.out.println(selectedUser);

        for (BankAccount account : bankAccountList) {
            if (account.getCustomer().getName().equals(selectedUser)){
                System.out.println(account.getBalance());
            }
        }

    }

    public void calculateWithdraw() {
        for (Customer customer : customerList) {
            System.out.println("Customer: " + customer.name ); //java.lang.toString method, i overwrote it in Customer.java
        }

        System.out.println("For which client do you want to make a withdraw? Type here: ");
        String selectedUser = scanner.nextLine();
        System.out.println(selectedUser);

        for (BankAccount account : bankAccountList) {
            if (account.getCustomer().getName().equals(selectedUser)){
                System.out.println("Balance: " + account.getBalance());
                double newBalance = enterWithdraw(account.getBalance());
                System.out.println("updated balance: " + newBalance );
            }
        }

    }
    public double enterWithdraw(double balance) {
        System.out.println("please enter your withdraw: ");
        double enteredNumber = scanner.nextDouble();
        double finalSum = balance - enteredNumber;
        return finalSum;
    }

    public void calculateDeposit(){
        for (Customer customer : customerList) {
            System.out.println("Customer: " + customer.name ); //java.lang.toString method, i overwrote it in Customer.java
        }

        System.out.println("For which client do you want to make a deposit? Type here: ");
        String selectedUser = scanner.nextLine();
        System.out.println(selectedUser);

        for (BankAccount account : bankAccountList) {
            if (account.getCustomer().getName().equals(selectedUser)){
                System.out.println("Balance: " + account.getBalance());
                double newBalance = enterDeposit(account.getBalance());
                System.out.println("updated balance: " + newBalance );
            }
        }

    }
    public double enterDeposit(double balance) {
        System.out.println("please enter your deposit: ");
        double enteredNumber = scanner.nextDouble();
        double finalSum = balance + enteredNumber;
        return finalSum;
    }

    public void deleteCustomer(){
        System.out.println("");
    }

    //getters:
    public ArrayList<Customer> getClientList() {
        return customerList;
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }




}
