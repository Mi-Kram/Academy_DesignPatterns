package RallyObject;

public class RallyTreeObject extends RallyObject {
  int height;

  public RallyTreeObject(int x, int y, int height) {
    super(x, y);
    this.height = height;
  }
  
  @Override
  public void print() {
    System.out.println(String.format("Tree: x = %d, y = %d, height = %d", x, y, height));

  }

}
