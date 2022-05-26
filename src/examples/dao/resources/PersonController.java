package examples.dao.resources;

import java.util.ArrayList;
import java.util.List;

public class PersonController implements PersonDAO {
  
  // For this example, it simulates the database storage
  private List<Person> personList;

  public PersonController()
  {
    this.personList = new ArrayList<Person>();
  }

  @Override
  public List<Person> index() 
  {
    System.out.println("[+] PersonController index executed");
    
    return this.personList;
  }
  
  @Override
  public Person show(int id) 
  {
    System.out.println("[+] PersonController show executed");
    
    int index = -1;
    for (int i = 0; i < this.personList.size(); i++) {
      if(this.personList.get(i).getId() == id)
      {
        index = i;
      }
    }
    
    Person foundPerson = this.personList.get(index);
    return foundPerson;
  }
  
  @Override
  public void store(Person p) 
  {
    System.out.println("[+] PersonController store executed");
    
    this.personList.add(p);
  }
  
  @Override
  public void update(Person p, int id, String name) 
  {
    System.out.println("[+] PersonController update executed");
    
    int index = -1;
    for (int i = 0; i < this.personList.size(); i++) {
      if(this.personList.get(i).getId() == p.getId())
      {
        index = i;
      }
    }
    
    Person foundPerson = this.personList.get(index);
    foundPerson.setId(id);
    foundPerson.setName(name);
    
    this.personList.set(index, foundPerson);
  }
  
  @Override
  public void remove(int id) 
  {
    System.out.println("[+] PersonController remove executed");
    
    int index = -1;
    for (int i = 0; i < this.personList.size(); i++) {
      if(this.personList.get(i).getId() == id)
      {
        index = i;
      }
    }

    this.personList.remove(index);
  }

}
