
/**
 *
 * @author Brian Avadikian
 * This is the caretaker class which calls on the originator to complete its
 * encapsulated actions, and calls for mementos to be created which it stores in
 * an array of history
 */
import java.util.ArrayList;

public class CareTaker {

    private CrayonBox crayonBox;
    private ArrayList<Memento> history = new ArrayList<>(); //initializing the new array list of crayons;

    public CareTaker(CrayonBox crayola) {
        this.crayonBox = crayola;
        System.out.println("CareTaker Object Created!");
    }

    public void addCrayon(Crayon crayonToAdd) {
        Memento additionEvent = crayonBox.createMemento(); //Saves a memento before the action
        addMemento(additionEvent);
        crayonBox.addCrayon(crayonToAdd);
    }

    public void removeCrayon(int crayonToRemove) {
        Memento removalEvent = crayonBox.createMemento(); //Saves a memento before the action
        addMemento(removalEvent);
        crayonBox.removeCrayon(crayonToRemove);
    }

    public void useCrayon(Crayon crayonToUse) {
        Memento removalEvent = crayonBox.createMemento(); //Saves a memento before the action
        addMemento(removalEvent);
        crayonToUse.useCrayon();
    }

    public void undoAction(CrayonBox CrayonBoxToUndo, int i) {
        Memento undo = history.get(history.size() - i - 1);
        CrayonBoxToUndo.restoreFromMemento(undo);
    }

    public void addMemento(Memento mementoToAdd) {
        history.add(mementoToAdd);
    }
}
