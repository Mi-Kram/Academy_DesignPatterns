import CheckersFactory.ICheckersFactory;

public class Checkers {
  
  ICheckersFactory checkersFactory;

  public Checkers(ICheckersFactory checkersFactory) {
    this.checkersFactory = checkersFactory;
  }

  public void setCheckersFactory(ICheckersFactory checkersFactory){
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
