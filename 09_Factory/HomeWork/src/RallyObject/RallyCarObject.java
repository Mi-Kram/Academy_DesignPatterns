package RallyObject;

public class RallyCarObject extends RallyObject {

  int speed;
  String color;

  public RallyCarObject(int x, int y, int speed, String color) {
    super(x, y);
    this.speed = speed;
    this.color = color;
  }

  @Override
  public void print() {
    System.out.println(String.format("Car: x = %d, y = %d, speed = %d, color = %s", x, y, speed, color));
  }
  
}
