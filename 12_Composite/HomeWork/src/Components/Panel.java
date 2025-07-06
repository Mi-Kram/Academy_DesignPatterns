package Components;

public class Panel extends GroupComponent {

  public Panel(String name) {
    super(name);
  }

  @Override
  public void add(Component c) {
    children.add(c);
  }

  @Override
  public void remove(Component c) {
    children.remove(c);
  }

  @Override
  public void display(int depth) {
    System.out.println(new String("-").repeat(depth) + name);

    for (Component child : children) {
      child.display(depth + 2);
    }
  }

  @Override
  public void moveBy(int dx, int dy) {
    for (Component child : children) {
      child.moveBy(dx, dy);
    }
  }
  
}
