package Sort;

import java.util.Comparator;

import Collection.Collection;

public class QuickSort<T> extends Sort<T> {

  public QuickSort(Comparator<T> comparator) {
    super(comparator);
  }

  @Override
  public void sort(Collection<T> collection) {
    sort(collection, 0, collection.count() - 1);
  }
  
  private void sort(Collection<T> collection, int low, int high) {
    if (collection.count() == 0) return;
    if (low >= high) return;

    int middle = low + (high - low) / 2;
    T opora = collection.get(middle);

    int i = low, j = high;
    while (i <= j) {
      while (comparator.compare(collection.get(i), opora) < 0) i++;
      while (comparator.compare(collection.get(j), opora) > 0) j--;

      if (i <= j) {
        T temp = collection.get(i);
        collection.set(i, collection.get(j));
        collection.set(j, temp);
        i++;
        j--;
      }
    }

    if (low < j) sort(collection, low, j);
    if (high > i) sort(collection, i, high);
  }

}
