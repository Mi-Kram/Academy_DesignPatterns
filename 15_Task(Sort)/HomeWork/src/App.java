
import Collection.*;
import Sort.*;

public class App {
  public static void main(String[] args) throws Exception {
    
    BubbleSort<Integer> bubbleSortInt = new BubbleSort<>(
      (Integer a, Integer b) -> a.compareTo(b)
    );

    SelectionSort<Integer> selectionSortInt = new SelectionSort<>(
      (Integer a, Integer b) -> b.compareTo(a)
    );

    BubbleSort<String> bubbleSortString = new BubbleSort<>(
      (String a, String b) -> a.compareToIgnoreCase(b)
    );

    SelectionSort<String> selectionSortString = new SelectionSort<String>(
      (String a, String b) -> b.compareToIgnoreCase(a)
    );

    System.out.println("Vector of numbers:\n");

    Vector<Integer> vector = new Vector<>(
      bubbleSortInt, 
      new Integer[] { 9, 3, 24, 12, 67, 4, 77}
    );

    vector.print();
    vector.sort();
    vector.print();

    vector.setSortStrategy(selectionSortInt);;
    vector.sort();
    vector.print();

    System.out.println("\nLinkedList of numbers:\n");

    java.util.LinkedList<Integer> sourceLinkedList = new java.util.LinkedList<>();
    sourceLinkedList.add(5);
    sourceLinkedList.add(11);
    sourceLinkedList.add(2);
    sourceLinkedList.add(17);
    sourceLinkedList.add(17);
    sourceLinkedList.add(25);
    sourceLinkedList.add(3);

    LinkedList<Integer> linkedList = new LinkedList<>(
      bubbleSortInt, 
      sourceLinkedList
    );

    linkedList.print();
    linkedList.sort();
    linkedList.print();

    linkedList.setSortStrategy(selectionSortInt);;
    linkedList.sort();
    linkedList.print();

    System.out.println("\nMatrix of numbers:\n");

    Matrix<Integer> matrix = new Matrix<Integer>(
      bubbleSortInt,
      new Integer[][] { 
        { 9, 3, 24, 2, 56 },
        { 12, 67, 4, 45, 7 },
        { 77, 23, 3, 9, 8}
      }
    );

    matrix.print();
    matrix.sort();
    matrix.print();

    matrix.setSortStrategy(selectionSortInt);
    matrix.sort();
    matrix.print();




    System.out.println("\n\n\n\nVector of strings:\n");

    Vector<String> vector2 = new Vector<>(
      bubbleSortString,
      new String[] { "hello", "big", "beautiful", "world", "!!!" }
    );

    vector2.print();
    vector2.sort();
    vector2.print();

    vector2.setSortStrategy(selectionSortString);
    vector2.sort();
    vector2.print();

    System.out.println("\nLinkedList of strings:\n");

    java.util.LinkedList<String> sourceLinkedList2 = new java.util.LinkedList<>();
    sourceLinkedList2.add("Test");
    sourceLinkedList2.add("Play");
    sourceLinkedList2.add("Run");
    sourceLinkedList2.add("Java");
    sourceLinkedList2.add("Abc");

    LinkedList<String> linkedList2 = new LinkedList<>(
      bubbleSortString, 
      sourceLinkedList2
    );

    linkedList2.print();
    linkedList2.sort();
    linkedList2.print();

    linkedList2.setSortStrategy(selectionSortString);
    linkedList2.sort();
    linkedList2.print();

    System.out.println("\nMatrix of strings:\n");

    Matrix<String> matrix2 = new Matrix<String>(
      bubbleSortString,
      new String[][] { 
        { "One", "Two", "Three", "Four", "Five" },
        { "begin", "end", "left", "right", "up" },
        { "down", "run", "walk", "jump", "stand" } 
      }
    );

    matrix2.print();
    matrix2.sort();
    matrix2.print();

    matrix2.setSortStrategy(selectionSortString);
    matrix2.sort();
    matrix2.print();

  }
}
