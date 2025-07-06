package View;

public class BoardView extends View {
  BoardStyle style;

  public BoardView(BoardStyle style) {
    this.style = style;
  }

  @Override
  public void print() {
    System.out.println("Board:");
    System.out.println(String.format("Style: %s", style));
  }

  public enum BoardStyle {
    Wooded,
    Steel,
    Plastic,
    Glow
  }
  
}
