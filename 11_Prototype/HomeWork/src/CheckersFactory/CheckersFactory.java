package CheckersFactory;

import View.*;

public abstract class CheckersFactory {

  protected MenuView menuViewPrototype;
  protected BoardView boardViewPrototype;
  protected CheckerView checkerViewPrototype;
  protected TimerView timerViewPrototype;

  public CheckersFactory() {
    menuViewPrototype = new MenuView(null);
    boardViewPrototype = new BoardView(null);
    checkerViewPrototype = new CheckerView(0, 0, null, null, null);
    timerViewPrototype = new TimerView(null);
  }
  
  public abstract MenuView createMenu();
  public abstract BoardView createBoard();
  public abstract CheckerView[] createCheckers();
  public abstract TimerView createTimer();

}
