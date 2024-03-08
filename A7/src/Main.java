import java.util.ArrayList;
import java.util.List;


class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}


class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}


class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}


public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();


        originator.setState("Forma inițială de punere la dispoziția pacienților a rezultatelor");
        caretaker.addMemento(originator.saveStateToMemento());


        originator.setState("Punerea la dispoziție a rezultatelor prin intermediul platformei online");
        caretaker.addMemento(originator.saveStateToMemento());


        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("Starea actuală după revenire: " + originator.getState());
    }
}
