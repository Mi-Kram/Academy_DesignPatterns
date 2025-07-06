package CheckersFactory;

import View.*;
import View.BoardView.*;
import View.CheckerView.*;
import View.MenuView.*;
import View.TimerView.*;

public class DefaultCheckersFactory implements ICheckersFactory {

  @Override
  public MenuView createMenu() {
    return new MenuView(MenuStyle.Volumetric);
  }

  @Override
  public BoardView createBoard() {
    return new BoardView(BoardStyle.Wooded);
  }

  @Override
  public CheckerView[] createCheckers() {
    return new CheckerView[] {
      new CheckerView(1, 1, CheckerColor.Black, CheckerType.Simple, CheckerStyle.Wooded),
      new CheckerView(3, 1, CheckerColor.Black, CheckerType.Simple, CheckerStyle.Wooded),
      new CheckerView(1, 5, CheckerColor.White, CheckerType.King, CheckerStyle.Wooded)
    };
  }

  @Override
  public TimerView createTimer() {
    return new TimerView(TimerAligment.Left);
  }
  
}
