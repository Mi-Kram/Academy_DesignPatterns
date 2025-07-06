package TicketMachine.Values;

public class RussianValues extends Values {

  @Override
  public String getEnterCount() {
    return "Введите кол-во поездок> ";
  }

  @Override
  public String getCountMustBePositive() {
    return "Кол-во должно быть положительным числом!";
  }

  @Override
  public String getCount20IsMax() {
    return "20 это максимальное значение!";
  }

  @Override
  public String getCountIsInvalid() {
    return "\"%s\" неправильное значение!";
  }

  @Override
  public String getPrice(){
    return "Цена: %d";
  }

  @Override
  public String getGiveMoney() {
    return "Дай деньги (%d)> ";
  }

  @Override
  public String getYourChange() {
    return "Ваша сдача: %d";
  }

  @Override
  public String getTakeTicket() {
    return "Пожалуйста, Ваш билет на %d поездок!";
  }

}
