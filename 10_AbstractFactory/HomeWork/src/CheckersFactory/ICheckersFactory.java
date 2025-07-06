package CheckersFactory;

import View.BoardView;
import View.CheckerView;
import View.MenuView;
import View.TimerView;

public interface ICheckersFactory {
  
  public MenuView createMenu();
  public BoardView createBoard();
  public CheckerView[] createCheckers();
  public TimerView createTimer();

}
