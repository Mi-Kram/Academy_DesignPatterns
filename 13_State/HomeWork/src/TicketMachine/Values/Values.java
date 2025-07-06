package TicketMachine.Values;

import java.util.HashMap;

public class Values {  
  
  public static HashMap<String, String> languages;

  static {
    languages = new HashMap<>();
    languages.put("en", "English");
    languages.put("ru", "Russian");
  }

  public static Values getValues(String lang) {
    switch (lang) {
      case "en": return new Values();
      case "ru": return new RussianValues();
      default: return new Values();
    }
  }

  public String getEnterCount(){
    return "Enter the number of trips> ";
  }

  public String getCountMustBePositive(){
    return "Count must be a positive number!";
  }

  public String getCount20IsMax(){
    return "20 is a maximum value!";
  }

  public String getCountIsInvalid(){
    return "\"%s\" is invalid value!";
  }

  public String getPrice(){
    return "Price: %d";
  }

  public String getGiveMoney(){
    return "Give money (%d)> ";
  }

  public String getYourChange(){
    return "Your change: %d";
  }

  public String getTakeTicket() {
    return "Please, take your ticket on %d trips!";
  }

}
