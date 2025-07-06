package Components;

public abstract class Component {
  protected String name;

  public Component(String name) {
    this.name = name;
  }

  public abstract void moveBy(int dx, int dy);
  public abstract void display(int depth); 

}
