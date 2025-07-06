public class App {
  public static void main(String[] args) throws Exception {
    CommandServer commandServer = new CommandServer();

    Unit unit1 = new TurtleUnit(commandServer);
    Unit unit2 = new TurtleUnit(commandServer);
    Unit unit3 = new SnakeUnit(commandServer);
    Unit unit4 = new HedgehogUnit(commandServer);

    commandServer.standby(11, 11, UnitType.turtle);
    System.out.println();

    commandServer.attack(22, 22, unit3);
    System.out.println();

    commandServer.retreat(33, 33, new Unit[] { unit3, unit4 });
    System.out.println();

    commandServer.moveAll(44, 44);
    System.out.println();

  }
}
