package examples.memento.models;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
  
  private List<Memento> mementoList;
  
  public CareTaker()
  {
    this.mementoList = new ArrayList<Memento>();
  }

  public void add(Memento memento)
  {
    this.mementoList.add(memento);
  }

  public Memento get(int index)
  {
    return this.mementoList.get(index);
  }
}
