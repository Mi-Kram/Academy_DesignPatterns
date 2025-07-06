public class App {
  public static void main(String[] args) throws Exception {
    IRallyFactory rallyFactory = new RallyFactory();

    RallyMap map = rallyFactory.generateMap(RidingMode.Free);

    map.print();

  }
}
