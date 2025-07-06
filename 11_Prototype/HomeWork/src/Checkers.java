import CheckersFactory.CheckersFactory;

public class Checkers {
  
  CheckersFactory checkersFactory;

  public Checkers(CheckersFactory checkersFactory) {
    this.checkersFactory = checkersFactory;
  }

  public void setCheckersFactory(CheckersFactory checkersFactory){
    this.checkersFactory = checkersFactory;
  }

  public CheckersActivity generateActivity(){
    CheckersActivity activity = new CheckersActivity();

    activity.add(checkersFactory.createMenu());
    activity.add(checkersFactory.createTimer());
    activity.add(checkersFactory.createBoard());
    activity.add(checkersFactory.createCheckers());

    return activity;
  }

}
