import Components.*;

public class App {
  public static void main(String[] args) throws Exception {
    Panel root = new Panel("root");
    root.add(new Button("Button 1"));
    root.add(new Button("Button 2"));

    Panel panel1 = new Panel("Panel");
    panel1.add(new Button("Button 3"));
    panel1.add(new Button("Button 4"));

    root.add(panel1);
    root.add(new Button("Button 5"));

    EditText editText = new EditText("TextEdit 1");
    root.add(editText);

    root.display(1);
  }
}
