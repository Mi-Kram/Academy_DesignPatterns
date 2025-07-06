package TicketMachine.States;

import TicketMachine.TicketMachine;

public class CountState implements IState {

  @Override
  public void handle(TicketMachine context) {
    
    while (true) {
      
      System.out.print(context.getValues().getEnterCount());
      String countStr = context.getScanner().nextLine().trim();

      if(countStr.length() == 0) {
        System.out.println(String.format(context.getValues().getCountIsInvalid()+"\n", countStr));
        continue;
      }
      
      try {
        int count = Integer.parseInt(countStr);
        if(count <= 0) {
          System.out.println(context.getValues().getCountMustBePositive()+"\n");
          continue;
        }

        if(count > 20) {
          System.out.println(context.getValues().getCount20IsMax()+"\n");
          continue;
        }

        context.setTripsCount(count);

      } catch (Exception e) {
        System.out.println(String.format(context.getValues().getCountIsInvalid()+"\n", countStr));
        continue;
      }

      break;
    }
    System.out.println();

    context.setState(new GetMoneyState());
    context.request();

  }
  
}
