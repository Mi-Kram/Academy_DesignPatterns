package Collection;

import Sort.Sort;

public abstract class Collection<T> {

  protected Sort<T> sortStrategy;
  protected Object collection;

  public Collection(Sort<T> sortStrategy, Object collection) {
    this.sortStrategy = sortStrategy;
    this.collection = collection;
  }

  
  public final void sort(){
    sortStrategy.sort(this);
  }

  public final void setSortStrategy(Sort<T> sortStrategy){
    this.sortStrategy = sortStrategy;
  }

  public abstract T get(int i);
  public abstract void set(int i, T value);
  public abstract int count();

  public abstract void print();

}
