package examples.proxy.resources;

public class UserProxy implements UserInterface {
  
  private User user;
  private int countryId;

  public UserProxy(int countryId)
  {
    this.countryId = countryId;
  }

  @Override
  public int getCountryId()
  {
    if(this.user == null)
    {
      this.user = new User(this.countryId);
    }

    return this.user.getCountryId();
  }

  @Override
  public void printMovieInfo(int movieId)
  {
    if(this.user == null)
    {
      this.user = new User(this.countryId);
    }

    System.out.println("[+] Requesting movie info for user from country " + this.user.getCountryId());

    // This proxy only allows to access movies info from country 0
    if(this.user.getCountryId() == 0)
    {
      this.user.printMovieInfo(movieId);
    } 
    else
    {
      System.out.println("[+] The user country is not allowed to see the movie info");
    }
  }
}
