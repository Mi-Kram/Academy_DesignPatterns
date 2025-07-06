package Components;

import java.util.ArrayList;

public abstract class GroupComponent extends Component {

  protected ArrayList<Component> children;

  public GroupComponent(String name) {
    super(name);
    children = new ArrayList<>();
  }

  public abstract void add(Component c);   
  public abstract void remove(Component c);

}
