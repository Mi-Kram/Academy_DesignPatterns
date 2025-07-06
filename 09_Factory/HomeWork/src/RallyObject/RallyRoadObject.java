package RallyObject;

public class RallyRoadObject extends RallyObject {
  String material;

  public RallyRoadObject(int x, int y, String material) {
    super(x, y);
    this.material = material;
  }

  @Override
  public void print() {
    System.out.println(String.format("road: x = %d, y = %d, material = %s", x, y, material));
  }
  
}
