package View;

public class CheckerView extends View {
  int x, y;
  CheckerColor color;
  CheckerType type;
  CheckerStyle style;

  public CheckerView(int x, int y, CheckerColor color, CheckerType type, CheckerStyle style) {
    this.x = x;
    this.y = y;
    this.color = color;
    this.type = type;
    this.style = style;
  }

  private CheckerView(CheckerView target) {
    this.x = target.x;
    this.y = target.y;
    this.color = target.color;
    this.type = target.type;
    this.style = target.style;
  }

  public void set(int x, int y, CheckerColor color, CheckerType type, CheckerStyle style) {
    this.x = x;
    this.y = y;
    this.color = color;
    this.type = type;
    this.style = style;
  }


  @Override
  public void print() {
    System.out.println("Checker:");
    System.out.println(String.format("X: %d, Y: %d", x, y));
    System.out.println(String.format("Color: %s", color));
    System.out.println(String.format("Type: %s", type));
    System.out.println(String.format("Style: %s", style));
  }

  @Override
  public View clone() {
    return new CheckerView(this);
  }

  public enum CheckerColor {
    Black,
    White
  }
  
  public enum CheckerType {
    Simple,
    King
  }
  
  public enum CheckerStyle {
    Wooded,
    Steel,
    Plastic,
    Glow
  }
  
}


