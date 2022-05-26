package examples.singleton.resources;

public class Singleton
{
  private static Singleton instance;

  /*
   * The private constructor avoids creating new instances
   * making it not accessible from the outside
   */
  private Singleton()
  {
    // Sets the instance to null
    instance = null;
  }

  public static Singleton getInstance()
  {
    // If the instance is null, creates a new instance
    if(instance == null)
    {
      instance = new Singleton();
    }
    
    return instance;
  }

  /*
   * Example execution
   */
  public void execute()
  {
    System.out.println("[+] This is a message from the Singleton instance");
  }
}