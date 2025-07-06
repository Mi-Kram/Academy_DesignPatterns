public class TurtleUnit extends Unit {

  public TurtleUnit(CommandServer commandServer) {
    super(commandServer, UnitType.turtle);
  }

  @Override
  public void move(int x, int y) {
    System.out.println(String.format("%s: move(%d, %d)", this, x, y));
  }

  @Override
  public void attack(int x, int y) {
    System.out.println(String.format("%s: attack(%d, %d)", this, x, y));
  }

  @Override
  public void attack(Unit object) {
    System.out.println(String.format("%s: attack(\"%s\")", object));
  }

  @Override
  public void attack(int range) {
    System.out.println(String.format("%s: attack(%d)", this, range));
  }

  @Override
  public void retreat(int x, int y) {
    System.out.println(String.format("%s: retreat(%d, %d)", this, x, y));
  }

  @Override
  public void standby(int x, int y) {
    System.out.println(String.format("%s: standby(%d, %d)", this, x, y));
  }
  
  @Override
  public String toString() {
    return String.format("Turtle %s", super.toString());
  }
  
}
