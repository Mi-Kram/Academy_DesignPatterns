import java.util.ArrayList;
import java.util.Collection;

import View.View;

public class CheckersActivity {
  
  ArrayList<View> views;

  public CheckersActivity() {
    views = new ArrayList<>();
  }

  public void add(View view){
    views.add(view);
  }

  public void add(View[] arr){
    if(arr == null) return;

    for (View view : arr) {
      views.add(view);
    }
  }

  public void remove(View view){
    views.remove(view);
  }

  public void print(){
    for (View view : views) {
      view.print();
      System.out.println();
    }
  }

}
