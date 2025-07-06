import RallyObject.RallyCarObject;
import RallyObject.RallyMyCarObject;
import RallyObject.RallyRoadObject;
import RallyObject.RallyTreeObject;
import RallyObject.RallyWallObject;

public class RallyFactory implements IRallyFactory {

  @Override
  public RallyMap generateMap(RidingMode mode) throws Exception {
    switch (mode) {
      case Free: return generateFreeMap();
      case Race: return generateRaceMap();
      case Tournament: return generateTournamentMap();
      default: throw new Exception("Unknown riding mode!");
    }
  }

  private RallyMap generateFreeMap(){
    RallyMap map = new RallyMap(100, 100);

    map.add(new RallyMyCarObject(10, 10, 20, "red"));

    map.add(new RallyRoadObject(10, 10, "Tile"));
    map.add(new RallyRoadObject(10, 11, "Tile"));
    map.add(new RallyRoadObject(10, 12, "Tile"));

    map.add(new RallyTreeObject(15, 10, 5));
    map.add(new RallyTreeObject(15, 15, 5));

    return map;
  }

  private RallyMap generateRaceMap(){
    RallyMap map = new RallyMap(100, 100);

    map.add(new RallyMyCarObject(20, 10, 20, "red"));

    map.add(new RallyCarObject(25, 10, 16, "Blue"));
    map.add(new RallyCarObject(30, 10, 16, "Green"));

    map.add(new RallyWallObject(10, 10, "Brick"));
    map.add(new RallyWallObject(10, 11, "Brick"));
    map.add(new RallyWallObject(10, 12, "Brick"));

    map.add(new RallyTreeObject(15, 10, 5));
    map.add(new RallyTreeObject(15, 15, 5));

    return map;
  }

  private RallyMap generateTournamentMap(){
    RallyMap map = new RallyMap(100, 100);

    map.add(new RallyMyCarObject(20, 10, 20, "red"));

    map.add(new RallyCarObject(10, 10, 16, "Blue"));
    map.add(new RallyCarObject(15, 10, 16, "Green"));
    map.add(new RallyCarObject(20, 10, 16, "Pink"));
    map.add(new RallyCarObject(25, 10, 16, "White"));
    map.add(new RallyCarObject(30, 10, 16, "Orange"));
    map.add(new RallyCarObject(35, 10, 16, "Black"));
    map.add(new RallyCarObject(40, 10, 16, "Yellow"));

    return map;
  }
  
}
