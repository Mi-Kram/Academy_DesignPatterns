package RallyObject;

public class RallyMyCarObject extends RallyCarObject {

  public RallyMyCarObject(int x, int y, int speed, String color) {
    super(x, y, speed, color);
  }

  @Override
  public void print() {
    System.out.println(String.format("My Car: x = %d, y = %d, speed = %d, color = %s", x, y, speed, color));
  }

}
