package examples.decorator.models;

public class HelmetDecorator extends EnemyDecorator {
  
  public HelmetDecorator(Enemy enemy)
  {
    super(enemy);
  }

  @Override
  public int computeDamage()
  {
    System.out.println("[+] Taking damage for HelmetDecorator, reduces it to 50%");

    return super.computeDamage() / 2;
  }

  @Override
  public void printDamage()
  {
    System.out.println("[+] The Helmet decorated Enemy damage is: " + this.computeDamage());
  }
}
