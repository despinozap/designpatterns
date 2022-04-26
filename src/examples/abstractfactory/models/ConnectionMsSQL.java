package examples.abstractfactory.models;

public class ConnectionMsSQL implements Connection {

  private final String type = "MsSQL";

  @Override
  public void connect() {
    System.out.println("[+] Connecting to " + this.type);
  }

  @Override
  public void disconnect() {
    System.out.println("[+] Disconnecting from " + this.type);
  }
}
