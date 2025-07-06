package Sort;

import java.util.Comparator;

import Collection.Collection;

public abstract class Sort<T> {
  protected Comparator<T> comparator;

  public Sort(Comparator<T> comparator) {
    this.comparator = comparator;
  }

  public abstract void sort(Collection<T> collection);
}
