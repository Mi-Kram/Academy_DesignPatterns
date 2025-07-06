public class App {
  public static void main(String[] args) throws Exception {

    Vector<Integer> vector = new Vector<Integer>(new QuickSort<Integer>());

    vector.add(4,7,6,5,8,1,3,2,9,0);
    vector.print("Vector:");

    vector.sort();
    vector.print("QuickSort:");

    vector.sort = new BubbleSort<Integer>();
    vector.sort();
    vector.print("BubbleSort:");

    vector.sort = new InsertionSort<Integer>();
    vector.sort();
    vector.print("InsertionSort:");


  }
}
