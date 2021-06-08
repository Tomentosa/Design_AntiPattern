
import java.util.ArrayList;

/**
 *
 * @author Brian Avadikian This is the memento class which accepts a state from
 * the originator
 */
public class Memento {

    private ArrayList<Crayon> state;

    public Memento(ArrayList state) {
        this.state = state;
        System.out.println("Memento Created");
    }

    public ArrayList<Crayon> getState() {
        return state;

    }

}


