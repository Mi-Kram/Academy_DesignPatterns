package RallyObject;

public class RallyWallObject extends RallyObject {
  String material;

  public RallyWallObject(int x, int y, String material) {
    super(x, y);
    this.material = material;
  }

  @Override
  public void print() {
    System.out.println(String.format("Wall: x = %d, y = %d, material = %s", x, y, material));
  }
  
}
