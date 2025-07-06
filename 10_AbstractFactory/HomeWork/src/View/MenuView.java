package View;

public class MenuView extends View {
  MenuStyle style;

  public MenuView(MenuStyle style) {
    this.style = style;
  }

  @Override
  public void print() {
    System.out.println("Menu:");
    System.out.println(String.format("Style: %s", style));
  }

  
  public enum MenuStyle {
    Volumetric,
    Float
  }

}
