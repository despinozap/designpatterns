package examples.dao.resources;

import java.util.List;

public interface PersonDAO {
  
  List<Person> index();
  Person show(int id);
  void store(Person p);
  void update(Person p, int id, String name);
  void remove(int id);
}
