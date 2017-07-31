
import java.util.ArrayList;
import java.util.Scanner;


/* @author marbi */
public class Planes {
    private ArrayList<Plane> planes;

    public Planes() {
        this.planes = new ArrayList<Plane>();
    }
    
    public void add(Scanner reader) {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        
        Plane plane = new Plane(id, capacity);
        planes.add(plane);
    }
    
    public Plane getPlane(String id) {
        //String id = reader.nextLine();
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                return plane;
            }
        }
        
        return null;
    }
    
    public void printPlanes() {
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }
    
}
