package Collection;

import Sort.Sort;

public class LinkedList<T> extends Collection<T> {

  java.util.LinkedList<T> linkedList;

  public LinkedList(Sort<T> sortStrategy, java.util.LinkedList<T> collection) {
    super(sortStrategy, collection);
    linkedList = collection;
  }

  @Override
  public T get(int i) {
    return linkedList.get(i);
  }

  @Override
  public void set(int i, T value) {
    linkedList.set(i, value);
  }

  @Override
  public int count() {
    return linkedList.size();
  }

  @Override
  public void print() {
    for (T item : linkedList) {
      System.out.print(item + "  ");
    }
    System.out.println("\n");
  }
  
}
