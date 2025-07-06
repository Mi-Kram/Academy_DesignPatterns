package RallyObject;

public abstract class RallyObject {
  int x, y;

  public RallyObject(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void print(){
    System.out.println(String.format("Object: x = %d, y = %d", x, y));
  }

}
