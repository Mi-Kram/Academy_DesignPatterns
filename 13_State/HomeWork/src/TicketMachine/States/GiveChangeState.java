package TicketMachine.States;

import TicketMachine.TicketMachine;

public class GiveChangeState implements IState {

  @Override
  public void handle(TicketMachine context) {
    
    int moneyChange = context.getMoneyChange();
    System.out.println(String.format(context.getValues().getYourChange()+"\n", moneyChange));

    context.setState(new GiveTicketState());
    context.request();

  }
  
}
