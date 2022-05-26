package examples.decorator.resources;

public class ArmourDecorator extends EnemyDecorator {
  
  public ArmourDecorator(Enemy enemy)
  {
    super(enemy);
  }

  @Override
  public int computeDamage()
  {
    System.out.println("[+] Taking damage for ArmourDecorator, reduces it to 20%");

    return super.computeDamage() / 5;
  }

  @Override
  public void printDamage()
  {
    System.out.println("[+] The Armour decorated Enemy damage is: " + this.computeDamage());
  }

}
