package Sort;

import java.util.Comparator;
import Collection.Collection;

public class SelectionSort<T> extends Sort<T> {

  public SelectionSort(Comparator<T> comparator) {
    super(comparator);
  }

  @Override
  public void sort(Collection<T> collection) {
    int n = collection.count();
    for (int i = 0; i < n; i++)
    {
      int min_element = i;

      for (int j = i+1; j < n; j++)
        if (comparator.compare(collection.get(min_element), collection.get(j)) > 0)
          min_element = j;

      if(min_element != i){
        T temp = collection.get(min_element);
        collection.set(min_element, collection.get(i));
        collection.set(i, temp);
      }
    }

  }
  
}
