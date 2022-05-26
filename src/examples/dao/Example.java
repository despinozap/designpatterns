package examples.dao;

import java.util.List;

import examples.dao.resources.Person;
import examples.dao.resources.PersonController;

public class Example
{
  public Example()
  {
    System.out.println("[#] DAO example is running");
    
    // Create the controller (DAO implementation)
    PersonController personController = new PersonController();
    
    // Get list of persons
    System.out.println("Requesting a list of persons");
    List<Person> personList = personController.index();
    System.out.println(personList.size() + " persons gotten");
    
    // Store a new person
    Person p = new Person(1, "John");
    System.out.println("Storing a new person (" + p.getName() + ")");
    personController.store(p);
    
    // Store another person
    Person p2 = new Person(2, "Jane");
    System.out.println("Storing a new person (" + p2.getName() + ")");
    personController.store(p2);
    
    // Get list of persons
    personList = personController.index();
    System.out.println(personList.size() + " persons gotten");
  
    // Update person
    String newName = "Freddy";
    System.out.println("Updating person (" + p.getName() + " to " + newName + ")");
    personController.update(p, 10, newName);

    // Get list of persons
    personList = personController.index();
    System.out.println(personList.size() + " persons gotten");

    // Remove person
    System.out.println("Removing person (" + p.getName() + ")");
    personController.remove(p.getId());

    // Get list of persons
    personList = personController.index();
    System.out.println(personList.size() + " persons gotten");
  }
}