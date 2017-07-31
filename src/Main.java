
import java.util.Scanner;

public class Main {

    public static void airportPanel(Scanner in, Planes planes, Flights flights) {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");

            String input = in.nextLine();

            if (input.equals("1")) {
                planes.add(in);
            } else if (input.equals("2")) {
                flights.add(in, planes);
            } else {
                flightService(in, planes, flights);
            }
        }
    }

    public static void flightService(Scanner in, Planes planes, Flights flights) {
        System.out.println();
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");

            String input = in.nextLine();

            if (input.equals("1")) {
                planes.printPlanes();
            } else if (input.equals("2")) {
                flights.printFlights();
            } else if (input.equals("3")) {
                System.out.print("Give plane ID: ");
                String id = in.nextLine();
                System.out.println(planes.getPlane(id));
            } else {
                System.exit(0);
            }
        }

    }

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner in = new Scanner(System.in);
        Planes planes = new Planes();
        Flights flights = new Flights();
        
        airportPanel(in, planes, flights);

    }
}
