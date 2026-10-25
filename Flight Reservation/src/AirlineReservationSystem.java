import java.sql.*;
import java.util.Scanner;

public class AirlineReservationSystem {

    // Database connection setup
    private static final String DB_URL = "jdbc:mysql://localhost:3306/csc";
    private static final String USER = "root";
    private static final String PASS = "projectx";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        while (true) {
            // Menu
            System.out.println("1. Search for flights");
            System.out.println("2. Make a reservation");
            System.out.println("3. View reservation details");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    searchFlights();
                    break;
                case 2:
                    makeReservation();
                    break;
                case 3:
                    viewReservations();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Method stubs
    private static void searchFlights() {
        // Implement search functionality
    }

    private static void makeReservation() {
        // Implement reservation functionality
    }

    private static void viewReservations() {
        // Implement view reservations functionality
    }
}
