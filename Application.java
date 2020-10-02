import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        System.out.println("Launched application...");

        Company company = new Company();
        boolean stop = false;

        // All: 0 == exit
        // User identifier: 1 == Customer, 2 == Personal, 0 == exit application
        // 1. Customer: 1 == Display list of flights, 2 == Book a flight
        // 2. Personal: 1 == Display list of Customer, 2== Create flights

        // Ex: Display list customer >> 1
        // Ex: Create Flights >> 2 Paris Budapest 20/08/2020

        while(!stop) {

            System.out.println("Choose from menu: 1> Customer \n2> Personal \n0> Exit");
            Scanner sc = new Scanner(System.in);
            int userChoice = sc.nextInt();

            switch(userChoice) {
                case 1:
                    // company.createBooking(b);
                    break;
                case 2:
                    // company.createFlight();
                    break;
                case 0:
                    stop = true;
                    break;
            }

        }
        System.out.println("Application is shutting down!");
    }
}
