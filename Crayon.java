
/**
 * @author Brian Avadikian
 * This is a simple class to create a Crayon Object with an associated color.]
 *
 * NOTE: The Crayon object is NOT have an associated role is the memento design
 * pattern.
 */
public class Crayon {

    private String color;
    private int remainingCrayon; //the amount of crayon remaining 

    public Crayon(String color) {
        this.color = color;
        this.remainingCrayon = 100;
    }

    public String getColor() {
        return this.color;
    }

    public void useCrayon() {
        System.out.println("Crayon Used\n");
        this.remainingCrayon = this.remainingCrayon - 10;
    }

    public int getRemainingCrayon() {
        return this.remainingCrayon;
    }
}
