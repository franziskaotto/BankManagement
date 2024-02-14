import java.sql.SQLOutput;
import java.util.Scanner;

public class BankAccount {

    //sind erst final wenn das Construct erstellt ist.
    private int accNumber;
    private Customer customer;
    private double balance;



    public BankAccount (int accNumber, Customer customer, double amount) {
        this.accNumber = accNumber;
        this.customer = customer;
        this.balance = amount;
    }


    //getter functions hier initialisieren
    public int getNumber(){
        return accNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    //SETTERS

    public void setAccNumber(int newAccNumber){
        this.accNumber = newAccNumber;
    }


    public void setCustomer(Customer newCustomer){
        this.customer = newCustomer;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

}
