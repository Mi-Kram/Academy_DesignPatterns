package CheckersFactory;

import View.*;
import View.BoardView.*;
import View.CheckerView.*;
import View.MenuView.*;
import View.TimerView.*;

public class CustomCheckersFactory implements ICheckersFactory {
  
  @Override
  public MenuView createMenu() {
    return new MenuView(MenuStyle.Float);
  }

  @Override
  public BoardView createBoard() {
    return new BoardView(BoardStyle.Glow);
  }

  @Override
  public CheckerView[] createCheckers() {
    return new CheckerView[] {
      new CheckerView(1, 1, CheckerColor.Black, CheckerType.Simple, CheckerStyle.Steel),
      new CheckerView(3, 1, CheckerColor.Black, CheckerType.Simple, CheckerStyle.Steel),
      new CheckerView(1, 5, CheckerColor.White, CheckerType.King, CheckerStyle.Steel)
    };
  }

  @Override
  public TimerView createTimer() {
    return new TimerView(TimerAligment.Right);
  }

}
