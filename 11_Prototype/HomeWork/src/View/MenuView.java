package View;

public class MenuView extends View {
  MenuStyle style;

  public MenuView(MenuStyle style) {
    this.style = style;
  }

  private MenuView(MenuView target) {
    this.style = target.style;
  }

  public void set(MenuStyle style) {
    this.style = style;
  }

  @Override
  public void print() {
    System.out.println("Menu:");
    System.out.println(String.format("Style: %s", style));
  }
  
  @Override
  public View clone() {
    return new MenuView(this);
  }

  public enum MenuStyle {
    Volumetric,
    Float
  }

}
