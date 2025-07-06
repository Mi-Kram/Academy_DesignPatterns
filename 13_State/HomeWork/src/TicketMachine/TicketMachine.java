package TicketMachine;

import java.util.Scanner;

import TicketMachine.States.IState;
import TicketMachine.States.LanguageState;
import TicketMachine.Values.Values;

public class TicketMachine {
  
  protected Values values;
  protected IState state;
  protected Scanner scanner;

  protected int tripsCount = 0;
  protected int price = 0;
  protected int userMoney = 0;

  public TicketMachine() {
    values = new Values();
    state = new LanguageState();
    scanner = new Scanner(System.in);
  }

  public void start(){
    request();
  }

  public void request(){
    state.handle(this);
  }

  public Values getValues() {
    return values;
  }

  public void setValues(Values values) {
    this.values = values;
  }

  public IState getState() {
    return state;
  }

  public void setState(IState state) {
    this.state = state;
  }

  public Scanner getScanner() {
    return scanner;
  }

  public int getTripsCount() {
    return tripsCount;
  }

  public void setTripsCount(int tripsCount) {
    this.tripsCount = tripsCount;
    this.price = tripsCount * 20;
  }

  public int getPrice() {
    return price;
  }

  public int getUserMoney() {
    return userMoney;
  }

  public void setUserMoney(int userMoney) {
    this.userMoney = userMoney;
  }

  public void addUserMoney(int userMoney) {
    this.userMoney += userMoney;
  }

  public int getMoneyChange(){
    int result = userMoney - price;
    userMoney = 0;
    return result;
  }


  

}
