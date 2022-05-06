package examples.strategy;

import examples.strategy.models.AdvancedAntivirus;
import examples.strategy.models.Context;
import examples.strategy.models.SimpleAntivirus;

public class Example
{
  public Example()
  {
    System.out.println("[#] Strategy example is running");
    
    // Create a simple antivirus
    SimpleAntivirus simpleAntivirus = new SimpleAntivirus();
    Context simpleAntivirusContext = new Context(simpleAntivirus);
    // Execute context
    simpleAntivirusContext.execute();
    
    // Create an advanced antivirus
    AdvancedAntivirus advancedAntivirus = new AdvancedAntivirus();
    Context advancedAntivirusContext = new Context(advancedAntivirus);
    // Execute context
    advancedAntivirusContext.execute();
  }
}