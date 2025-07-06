package View;

public class BoardView extends View {
  BoardStyle style;

  public BoardView(BoardStyle style) {
    this.style = style;
  }

  private BoardView(BoardView target){
    this.style = target.style;
  }

  public void set(BoardStyle style) {
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

  @Override
  public View clone() {
    return new BoardView(this);
  }
  
}
