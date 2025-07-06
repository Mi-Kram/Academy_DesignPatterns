import CheckersFactory.*;

public class App {
  public static void main(String[] args) throws Exception {
    
    CheckersFactory checkersFactory = new DefaultCheckersFactory();
    Checkers checkers = new Checkers(checkersFactory);

    CheckersActivity activity = checkers.generateActivity();
    printFactoryName(checkersFactory);
    activity.print();

    
    System.out.println("\n");


    checkersFactory = new CustomCheckersFactory();
    checkers.setCheckersFactory(checkersFactory);

    activity = checkers.generateActivity();
    printFactoryName(checkersFactory);
    activity.print();

    

  }

  static void printFactoryName(CheckersFactory checkersFactory ){
    System.out.println(String.format("%s:\n", checkersFactory.getClass().getSimpleName()));
  }


}
