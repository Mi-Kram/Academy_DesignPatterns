package Sort;

import java.util.Comparator;

import Collection.Collection;

public class BubbleSort<T> extends Sort<T> {

  public BubbleSort(Comparator<T> comparator) {
    super(comparator);
  }

  @Override
  public void sort(Collection<T> collection) {
    int n = collection.count() - 1;
    T temp;

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j < n-i; j++) {
        if (comparator.compare(collection.get(j), collection.get(j+1)) > 0) {
          temp = collection.get(j);
          collection.set(j, collection.get(j+1));
          collection.set(j+1, temp);
        }
      }
    }

  }
  
}
