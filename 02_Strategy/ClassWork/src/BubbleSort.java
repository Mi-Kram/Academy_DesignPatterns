import java.util.ArrayList;

public class BubbleSort <T extends Comparable<T>> implements ISort<T> {

  @Override
  public void sort(ArrayList<T> array) {
    int n = array.size();
    T temp;

    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (array.get(j - 1).compareTo(array.get(j)) > 0) {
          temp = array.get(j - 1);
          array.set(j - 1, array.get(j));
          array.set(j, temp);
        }
      }
    }
  }

}
