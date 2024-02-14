import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    //


//    public static main (String[] args) {
//        return
//        /*tasks
//         1. Array anschauen
//         2. Switch case implementieren


//         3. while loops
//                ICU: initialise, compare, update

    //
//         */
    //main gehört in Main! und nicht in dahin wo die constructer liegen!
    public static void main(String[] args) {
        BankManagement bankMgmt = new BankManagement();

        String menuText = """
                ______________________________
                This is the BankManager-Tool: press
                A : add Client
                S : show all active Clients
                R : remove Client
                O : open up new Konto
                B : show the balance of one client
                
                Q : quit Program""";


        System.out.println(menuText);
        String menuInput = scanner.next().toUpperCase();
        System.out.println(menuInput);


        while(!menuInput.equals("Q")) {


            switch (menuInput) {
                case "A":
                    System.out.println("User pressed A");
                    bankMgmt.addNewCustomer();

                    break;
                case "S":
                    System.out.println("User pressed S");
                    bankMgmt.listClients();
                    break;
                case "R":
                    System.out.println("User pressed R");
                    break;
                case "O":
                    System.out.println("User pressed O");
                    break;
                case "B":
                    System.out.println("User pressed B");
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
