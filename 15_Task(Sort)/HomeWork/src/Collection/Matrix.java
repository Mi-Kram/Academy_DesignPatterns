package Collection;

import Sort.Sort;

public class Matrix<T> extends Collection<T> {

  T[][] matrix;

  public Matrix(Sort<T> sortStrategy, T[][] collection) {
    super(sortStrategy, collection);
    matrix = collection;
  }

  @Override
  public T get(int i) {
    Point point = getPosition(i);
    return matrix[point.i][point.j];
  }

  @Override
  public void set(int i, T value) {
    Point point = getPosition(i);
    matrix[point.i][point.j] = value;
  }

  @Override
  public int count() {
    int count = 0;
    for (T[] row : matrix) count += row.length; 
    return count;
  }

  private Point getPosition(int index){
    int i = 0;
    int j = index; 

    while (matrix[i].length <= j) {
      j -= matrix[i++].length;
    }

    return new Point(i, j);
  }

  private class Point {
    int i = 0;
    int j = 0;

    public Point(int i, int j) {
      this.i = i;
      this.j = j;
    }
  }

  @Override
  public void print() {
    for (T[] row : matrix) {
      for (T item : row) {
        System.out.print(item + "  ");
      }
      System.out.println();
    }
    System.out.println();
  }
  
}
