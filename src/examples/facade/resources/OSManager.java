package examples.facade.resources;

public class OSManager {

  public String getOSName()
  {
    return System.getProperty("os.name");
  }
}
