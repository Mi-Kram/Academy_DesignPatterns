package Collection;

import Sort.Sort;

public class Vector<T> extends Collection<T> {

  T[] array;

  public Vector(Sort<T> sortStrategy, T[] collection) {
    super(sortStrategy, collection);
    array = collection;
  }

  @Override
  public T get(int i) {
    return array[i];
  }

  @Override
  public void set(int i, T value) {
    array[i] = value;
  }

  @Override
  public int count() {
    return array.length;
  }

  @Override
  public void print() {
    for (T item : array) {
      System.out.print(item + "  ");
    }
    System.out.println("\n");
  }
  
}
