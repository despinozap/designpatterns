package examples.facade.resources;

public class Facade {

  private NetworkManager networkManager;
  private OSManager osManager;

  public Facade() {
    this.networkManager = new NetworkManager();
    this.osManager = new OSManager();
  }

  public void printStationInformation()
  {
    System.out.println("[+] Machine information => IP Address: " + networkManager.getIPAddress() + ", MAC Address: " + networkManager.getMACAddress() + ", OS: " + osManager.getOSName());
  }
}
