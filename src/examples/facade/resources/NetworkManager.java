package examples.facade.resources;

import java.net.InetAddress;
import java.net.NetworkInterface;

public class NetworkManager {
  
  public String getIPAddress()
  {
    String ipAddress = null;

    try 
    {
			InetAddress inetAddress = InetAddress.getLocalHost();
		  ipAddress = inetAddress.getHostAddress();
		} 
    catch (Exception e) 
    {
			e.printStackTrace();
		}

    return ipAddress;
  }

  public String getMACAddress()
  {
    StringBuilder stringBuilder = new StringBuilder();

    try
    {
      InetAddress inetAddress = InetAddress.getLocalHost();
      NetworkInterface networkInterface = NetworkInterface.getByInetAddress(inetAddress);
      
      byte[] macAddress = networkInterface.getHardwareAddress();
    
      for (int i = 0; i < macAddress.length; i++) 
      {
        stringBuilder.append(String.format("%02X%s", macAddress[i], (i < macAddress.length - 1) ? "-" : ""));
      }  
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }

    return stringBuilder.toString();
  }
}
