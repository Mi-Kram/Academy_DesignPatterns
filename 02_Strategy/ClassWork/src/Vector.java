import java.util.ArrayList;

public class Vector<T extends Comparable<T>> {
  ArrayList<T> arr;
  ISort<T> sort;

  public Vector(ISort<T> sort) {
    arr = new ArrayList<T>();
    this.sort = sort;
  }

  public void add(T... items){
    for (T item : items) arr.add(item);
  }

  public void sort(){
    sort.sort(arr);
  }

  public void print(String title){
    System.out.println(title);
    for (T item : arr) System.out.println(item);
    System.out.println();
  }

}
