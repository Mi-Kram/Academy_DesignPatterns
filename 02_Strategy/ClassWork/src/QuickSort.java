import java.util.ArrayList;

public class QuickSort <T extends Comparable<T>> implements ISort<T> {

  @Override
  public void sort(ArrayList<T> array) {
    sort(array, 0, array.size() - 1);
  }

  private void sort(ArrayList<T> array, int low, int high) {
    if (array.size() == 0) return;
    if (low >= high) return;

    int middle = low + (high - low) / 2;
    T opora = array.get(middle);

    int i = low, j = high;
    while (i <= j) {
        while (array.get(i).compareTo(opora) < 0) i++;
        while (array.get(j).compareTo(opora) > 0) j--;

        if (i <= j) {
            T temp = array.get(i);
            array.set(i, array.get(j));
            array.set(j, temp);
            i++;
            j--;
        }
    }

    if (low < j) sort(array, low, j);
    if (high > i) sort(array, i, high);
  }

}
