
import java.util.ArrayList;
import java.util.Scanner;


/* @author marbi */
public class Flights {

    private ArrayList<Flight> flights;

    public Flights() {
        this.flights = new ArrayList<Flight>();
    }

    public void add(Scanner reader, Planes planes) {

        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        Plane temp = planes.getPlane(id);
        
        if (temp != null) {
            System.out.print("Give departure airport code: ");
            String departure = reader.nextLine();
            
            System.out.print("destination airport code: ");
            String destination = reader.nextLine();
            
            Flight flight = new Flight(departure, destination, temp);
            flights.add(flight);
        }   
    }
    
public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

}
