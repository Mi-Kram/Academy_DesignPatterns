package Components;

public class EditText extends Component {

  public EditText(String name) {
    super(name);
  }

  @Override
  public void moveBy(int dx, int dy) {

  }

  @Override
  public void display(int depth) {
    System.out.println(new String("-").repeat(depth) + name);
  }
  
}
