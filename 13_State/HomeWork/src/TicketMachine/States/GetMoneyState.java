package TicketMachine.States;

import java.util.Scanner;

import TicketMachine.TicketMachine;

public class GetMoneyState implements IState {

  @Override
  public void handle(TicketMachine context) {

    System.out.println(String.format(context.getValues().getPrice(), context.getPrice()));
    
    while (context.getUserMoney() < context.getPrice()) {
      System.out.print(String.format(context.getValues().getGiveMoney(), context.getPrice() - context.getUserMoney()));
      String moneyStr = context.getScanner().nextLine().trim();

      if(moneyStr.length() > 0){
        try {
          int money = Integer.parseInt(moneyStr);

          if(money > 0){
            context.addUserMoney(money);
          }

        } catch (Exception e) { }
      }

      System.out.println();

    }

    context.setState(new GiveChangeState());
    context.request();

  }
  
}
