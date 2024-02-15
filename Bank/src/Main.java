import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

//         3. while loops
//                ICU: initialise, compare, update
//

    public static void main(String[] args) {
        BankManagement bankMgmt = new BankManagement();

        String menuText = """
                ___________________________________
                This is the BankManager-Tool: press
                A : add Client incl new Konto
                S : show all active Clients
                R : remove Client
                W : withdraw
                D : deposit
                B : show the balance of one client
                
                
                
                Q : quit Program""";


        System.out.println(menuText);
        String menuInput = scanner.next().toUpperCase();
        System.out.println(menuInput);


        while(!menuInput.equals("Q")) {


            switch (menuInput) {
                case "A":
                    bankMgmt.addNewCustomer(bankMgmt.createNewCustomer());
                    break;
                case "S":
                    bankMgmt.listClients();
                    break;
                case "R":
                    System.out.println("User pressed R");
                    break;
                case "W":
                    bankMgmt.calculateWithdraw();
                    break;
                case "D":
                    bankMgmt.calculateDeposit();
                    break;
                case "B":
                    bankMgmt.showBalanceForUser();
                    break;


                default:
                    System.out.println("Invalid option");
                    break;
            }

            System.out.println(menuText);
            menuInput = scanner.next().toUpperCase();
            System.out.println(menuInput);
        }
        System.out.println("Quitting the Bankmanager Tool");
        System.exit(0);

    }
}
