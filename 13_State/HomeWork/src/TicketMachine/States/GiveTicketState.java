package TicketMachine.States;

import TicketMachine.TicketMachine;

public class GiveTicketState implements IState {

  @Override
  public void handle(TicketMachine context) {
    
    System.out.println(String.format(context.getValues().getTakeTicket()+"\n", context.getTripsCount()));
    
    context.setState(new LanguageState());
    context.request();
    
  }
  
}
