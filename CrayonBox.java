
/**
 *
 * @author Brian Avadikian
 *
 * The CrayonBox Class represents an empty box that crayon objects can be added to or
 * removed from. Its contents will be represented by the ArrayList crayons
 *
 * NOTE: The CrayonBox class will be the ORIGINATOR in this design pattern
 */
import java.util.ArrayList;

public class CrayonBox {

    private ArrayList<Crayon> crayons;

    public CrayonBox() {
        this.crayons = new ArrayList<Crayon>();             //initializing the new array list of crayons
        System.out.println("CrayonBox Object Created!");    //Providing a status update to terminal
    }

    public Memento createMemento() {                                //Originator has a method to create memento
        return new Memento((ArrayList<Crayon>) crayons.clone());    //The memento is passed a clone of the state
    }

    public void restoreFromMemento(Memento memento) {   //Originator can restore itself from a memento
        System.out.println("\nRestoring from memento! ");
        this.crayons = memento.getState();  //Using the getState() method of the memento to retrieve its stored past state
    }

    public void addCrayon(Crayon crayonToAdd) {
        crayons.add(crayonToAdd);
        System.out.println(crayonToAdd.getColor() + " Crayon Added\n");

    }

    public void removeCrayon(int crayonToRemove) {
        System.out.println(crayons.get(crayonToRemove).getColor() + " Crayon Removed\n");
        crayons.remove(crayonToRemove);

    }

    @Override
    public String toString() {
        String crayonList = "";

        for (int i = 0; i < crayons.size(); i++) {
            crayonList = crayonList + crayons.get(i).getColor() + "crayon-"+crayons.get(i).getRemainingCrayon()+"% remaining,";
        }
        return crayonList;
    }

    public ArrayList<Crayon> getCrayons() {
        return this.crayons;
    }
}
