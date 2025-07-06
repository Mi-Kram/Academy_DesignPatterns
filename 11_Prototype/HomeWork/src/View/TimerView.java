package View;

public class TimerView extends View {
  TimerAligment aligment;

  public TimerView(TimerAligment aligment) {
    this.aligment = aligment;
  }

  private TimerView(TimerView target) {
    this.aligment = target.aligment;
  }

  public void set(TimerAligment aligment) {
    this.aligment = aligment;
  }

  @Override
  public void print() {
    System.out.println("Timer:");
    System.out.println(String.format("Aligment: %s", aligment));
  }

  @Override
  public View clone() {
    return new TimerView(this);
  }

  public enum TimerAligment {
    Right,
    Left
  }
  
}
