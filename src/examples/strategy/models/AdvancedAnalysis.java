package examples.strategy.models;

public abstract class AdvancedAnalysis implements Strategy {
  
  @Override
  public void analyze() {
  
      start();
      inspectFiles();
      inspectEmails();
      inspectRootkits();
      stop();
  }

  public abstract void start();

  public abstract void inspectFiles();

  public abstract void inspectEmails();
  
  public abstract void inspectRootkits();
  
  public abstract void stop();

}
