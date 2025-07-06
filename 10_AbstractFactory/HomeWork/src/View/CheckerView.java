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

  @Override
  public void print() {
    System.out.println("Checker:");
    System.out.println(String.format("X: %d, Y: %d", x, y));
    System.out.println(String.format("Color: %s", color));
    System.out.println(String.format("Type: %s", type));
    System.out.println(String.format("Style: %s", style));
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


