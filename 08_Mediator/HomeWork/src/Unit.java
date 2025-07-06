public abstract class Unit {
  private static int unitNumbers = 0;
  private int unitNamber;

  protected UnitType type;

  CommandServer commandServer;
  
  public Unit(CommandServer commandServer, UnitType type) {
    unitNamber = ++unitNumbers;
    this.type = type;
    this.commandServer = commandServer;
    commandServer.registerUnit(this);
  }

  public void destroy(){
    unitNumbers--;
    commandServer.unregisterUnit(this);
  }

  public abstract void move(int x, int y);

  public abstract void attack(int x, int y);
  public abstract void attack(Unit object);
  public abstract void attack(int range);

  public abstract void retreat(int x, int y);

  public abstract void standby(int x, int y);

  @Override
  public String toString() {
    return String.format("Unit %d", unitNamber);
  }

}
