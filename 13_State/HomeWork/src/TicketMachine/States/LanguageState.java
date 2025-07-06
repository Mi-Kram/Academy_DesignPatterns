package TicketMachine.States;

import java.util.Map.Entry;

import TicketMachine.TicketMachine;
import TicketMachine.Values.Values;

public class LanguageState implements IState {

  @Override
  public void handle(TicketMachine context) {

    while (true) {
      System.out.println("Languages:");
      for (Entry<String, String> item : Values.languages.entrySet()) {
        System.out.println(String.format("%s: %s", item.getKey(), item.getValue()));
      }
      
      System.out.print("\nChooose language> ");
      String lang = context.getScanner().nextLine();

      if(Values.languages.containsKey(lang)){
        context.setValues(Values.getValues(lang));
        break;
      }
      else {
        System.out.println(String.format("Language \"%s\" is unknown!\n", lang));
      }
      
    }
    System.out.println();

    context.setState(new CountState());
    context.request();

  }
  
}
