package TicketMachine.States;

import TicketMachine.TicketMachine;

public interface IState {
  void handle(TicketMachine context);
}
