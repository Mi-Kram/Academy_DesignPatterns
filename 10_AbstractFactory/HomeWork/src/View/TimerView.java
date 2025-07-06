package View;

public class TimerView extends View {
  TimerAligment aligment;

  public TimerView(TimerAligment aligment) {
    this.aligment = aligment;
  }

  @Override
  public void print() {
    System.out.println("Timer:");
    System.out.println(String.format("Aligment: %s", aligment));
  }

  public enum TimerAligment {
    Right,
    Left
  }
  
}
