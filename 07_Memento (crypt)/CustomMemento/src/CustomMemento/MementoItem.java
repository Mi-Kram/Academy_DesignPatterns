package CustomMemento;

import java.io.Serializable;

public class MementoItem<T extends Serializable> implements Serializable {
  long date;
  T data;

  public MementoItem() { }

  public MementoItem(long date, T data) {
    this.date = date;
    this.data = data;
  }
}
