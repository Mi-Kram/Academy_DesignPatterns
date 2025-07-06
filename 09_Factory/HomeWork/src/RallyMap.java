import java.util.ArrayList;

import RallyObject.RallyObject;

public class RallyMap {
  int width, height;

  ArrayList<RallyObject> objects;

  public RallyMap(int width, int height) {
    this.width = width;
    this.height = height;
    objects = new ArrayList<>();
  }

  public void add(RallyObject obj){
    objects.add(obj);
  }

  public void print(){
    for (RallyObject rallyObject : objects) {
      rallyObject.print();
    }
  }

}
