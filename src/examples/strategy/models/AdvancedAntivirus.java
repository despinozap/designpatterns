package examples.strategy.models;

public class AdvancedAntivirus extends AdvancedAnalysis {
  
  @Override
  public void start() {
    System.out.println("[+] Advanced antivirus is starting");
  }

  @Override
  public void inspectFiles() {
    System.out.println("[+] Advanced antivirus is inspecting files");
  }

  @Override
  public void inspectEmails() {
    System.out.println("[+] Advanced antivirus is inspecting emails");
  }
  @Override
  public void inspectRootkits() {
    System.out.println("[+] Advanced antivirus is inspecting rootkits");
  }

  @Override
  public void stop() {
    System.out.println("[+] Advanced antivirus is stopping");
  }
  
}
