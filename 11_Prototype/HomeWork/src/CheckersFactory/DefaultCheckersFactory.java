package CheckersFactory;

import View.*;
import View.BoardView.*;
import View.CheckerView.*;
import View.MenuView.*;
import View.TimerView.*;

public class DefaultCheckersFactory extends CheckersFactory {

  @Override
  public MenuView createMenu() {
    MenuView view = (MenuView) menuViewPrototype.clone();
    if(view == null) view = new MenuView(null);

    view.set(MenuStyle.Volumetric);
    return view;
  }

  @Override
  public BoardView createBoard() {
    BoardView view = (BoardView) boardViewPrototype.clone();
    if(view == null) view = new BoardView(null);

    view.set(BoardStyle.Wooded);
    return view;
  }

  @Override
  public CheckerView[] createCheckers() {
    CheckerView view1 = (CheckerView) checkerViewPrototype.clone();
    if(view1 == null) view1 = new CheckerView(0, 0, null, null, null);

    CheckerView view2 = (CheckerView) checkerViewPrototype.clone();
    if(view2 == null) view2 = new CheckerView(0, 0, null, null, null);

    CheckerView view3 = (CheckerView) checkerViewPrototype.clone();
    if(view3 == null) view3 = new CheckerView(0, 0, null, null, null);

    view1.set(1, 1, CheckerColor.Black, CheckerType.Simple, CheckerStyle.Wooded);
    view2.set(3, 1, CheckerColor.Black, CheckerType.Simple, CheckerStyle.Wooded);
    view3.set(1, 5, CheckerColor.White, CheckerType.King, CheckerStyle.Wooded);

    return new CheckerView[] {
      view1,
      view2,
      view3
    };
  }

  @Override
  public TimerView createTimer() {
    TimerView view = (TimerView) timerViewPrototype.clone();
    if(view == null) view = new TimerView(null);

    view.set(TimerAligment.Left);
    return view;
  }
  
}
