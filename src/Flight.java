
/* @author marbi */
public class Flight {
    private String departureAirportCode;
    private String destinationAirportCode;
    private Plane plane;

    public Flight(String departureAirportCode, String destinationAirportCode, Plane plane) {
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;
        this.plane = plane;
    }

    @Override
    public String toString() {
        return this.plane + " (" + this.departureAirportCode + "-" + this.destinationAirportCode + ")";
    } 
    
}
