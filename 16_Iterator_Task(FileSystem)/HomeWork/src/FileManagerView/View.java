package FileManagerView;

public class View {
  protected StringBuffer text;

  public View(String text) {
    this.text = new StringBuffer(text);
  }

  @Override
  public String toString() {
    return getText();
  }

  public String getText() {
    return text.toString();
  }

  public void setText(String text) {
    this.text.delete(0, text.length());
    this.text.append(text);
  }

  public void appendText(String text) {
    this.text.append(text);
  }

}
