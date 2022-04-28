package examples.proxy.models;

public class User implements UserInterface {
  
  private int countryId;

  public User(int countryId) 
  {
    this.countryId = countryId;
  }

  public int getCountryId()
  {
    return this.countryId;
  }

  @Override
  public void printMovieInfo(int movieId) 
  {
    System.out.println("[+] Movie info => ID: " + movieId);
  }

}
