package examples.decorator;

import examples.decorator.resources.ArmourDecorator;
import examples.decorator.resources.BaseEnemy;
import examples.decorator.resources.Enemy;
import examples.decorator.resources.HelmetDecorator;

public class Example
{
  public Example()
  {
    System.out.println("[#] Decorator example is running");

    // Create a conctrete base Enemy object
    Enemy baseEnemy = new BaseEnemy();
    baseEnemy.printDamage();
    System.out.println("BaseEnemy object instance hash is: " + baseEnemy.hashCode());
    
    // Add the Helmet decorator to the base Enemy
    Enemy helmetEnemy = new HelmetDecorator(baseEnemy);
    helmetEnemy.printDamage();
    System.out.println("HelmetEnemy object instance hash is: " + helmetEnemy.hashCode());
    
    // Add the Armour decorator to the Helmet decorator
    Enemy armourEnemy = new ArmourDecorator(helmetEnemy);
    armourEnemy.printDamage();
    System.out.println("ArmourEnemy object instance hash is: " + armourEnemy.hashCode());
  }
}