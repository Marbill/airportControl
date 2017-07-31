
/* @author marbi */
public class Plane {
    private String id;
    private int capacity;

    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    
    @Override
    public String toString() {
        return this.id + " (" + this.capacity + " ppl)";
    }
    
    
}
