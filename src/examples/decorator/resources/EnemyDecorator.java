package examples.decorator.resources;

public abstract class EnemyDecorator implements Enemy {
  
  protected Enemy enemy;

  public EnemyDecorator(Enemy enemy)
  {
    this.enemy = enemy;
  }

  @Override
  public int computeDamage()
  {
    return this.enemy.computeDamage();
  }
}
