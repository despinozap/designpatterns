package examples.facade.models;

import examples.facade.resources.NetworkManager;
import examples.facade.resources.OSManager;

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
