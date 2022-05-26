package examples.strategy.resources;

public class SimpleAntivirus extends SimpleAnalysis {
  
  @Override
  public void start() {
    System.out.println("[+] Simple antivirus is starting");
  }

  @Override
  public void inspectFiles() {
    System.out.println("[+] Simple antivirus is inspecting files");
  }

  @Override
  public void stop() {
    System.out.println("[+] Simple antivirus is stopping");
  }
}
