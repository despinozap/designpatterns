package examples.abstractfactory.resources;

public class ConnectionMySQL implements Connection {
  
  private final String type = "MySQL";

  @Override
  public void connect() {
    System.out.println("[+] Connecting to " + this.type);
  }

  @Override
  public void disconnect() {
    System.out.println("[+] Disconnecting from " + this.type);
  }
}
