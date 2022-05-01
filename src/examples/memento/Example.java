package examples.memento;

import examples.memento.models.CareTaker;
import examples.memento.models.Originator;

public class Example
{
  public Example()
  {
    System.out.println("[#]  Memento example is running");

    // Create the originator and caretaker
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    // Create the first state, but not saved as memento
    String snapshot1 = new String("Snapshot #1");
    originator.setState(snapshot1);
    
    // Create a second state
    String snapshot2 = new String("Snapshot #2");
    originator.setState(snapshot2);
    
    // Save second state as first checkpoint in memento list
    careTaker.add(originator.saveStateToMemento());
    
    // Create a third state
    String snapshot3 = new String("Snapshot #3");
    originator.setState(snapshot3);

    // Save third state as second checkpoint in memento list
    careTaker.add(originator.saveStateToMemento());

    System.out.println("Current state is:" + originator.getState());

    // Restore state from first checkpoint in memento list
    System.out.println("Restoring state 0");
    originator.getStateFromMemento(careTaker.get(0)); 
    System.out.println("Current state is:" + originator.getState());
    
    // Restore state from second checkpoint in memento list
    System.out.println("Restoring state 1");
    originator.getStateFromMemento(careTaker.get(1)); 
    System.out.println("Current state is:" + originator.getState());
  }
}