package examples.decorator.models;

public class BaseEnemy implements Enemy {
  
  @Override
  public int computeDamage() {
    System.out.println("[+] Taking damage for BaseEnemy");

    return 100;
  }

  @Override
  public void printDamage()
  {
    System.out.println("[+] The BaseEnemy damage is: " + this.computeDamage());
  }
}
