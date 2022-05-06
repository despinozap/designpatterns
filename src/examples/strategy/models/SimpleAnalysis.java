package examples.strategy.models;

public abstract class SimpleAnalysis implements Strategy {
  
  @Override
  public void analyze() {
      start();
      inspectFiles();
      stop();
  }

  public abstract void start();

  public abstract void inspectFiles();
  
  public abstract void stop();
}
