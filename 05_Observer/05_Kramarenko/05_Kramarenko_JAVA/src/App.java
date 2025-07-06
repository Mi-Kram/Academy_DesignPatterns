import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {
    Node node1 = new Node(23.32, 4);
    Node node2 = new Node(2, 14);
    Node node3 = new Node(20, 30);

    Link link1 = new Link(node1, node2);
    Link link2 = new Link(node2, node3);

    System.out.println(link1);
    System.out.println(link2);
    System.out.println();

    //node2.Move(3, 5);

    node2.setX(34);
    System.out.println();
    node2.setY(54);

  }
}

abstract class Subject{
  private ArrayList<Observer> observers;

  public Subject() {
    observers = new ArrayList<>();
  }

  public void subscribe(Observer observer){
    observers.add(observer);
  }

  public void unsubscribe(Observer observer){
    observers.remove(observer);
  }

  public void update(){
    for (Observer observer : observers) observer.update();
  }
}

class Node extends Subject
{
  private double x;
  private double y;

  public Node(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX(){
    return x;
  }

  public void setX(double x){
    this.x = x;
    update();
  }

  public double getY(){
    return y;
  }

  public void setY(double y){
    this.y = y;
    update();
  }

  public void Move(double x, double y)
  {
    this.x = x;
    this.y = y;
    update();
  }

  @Override
  public String toString() {
    return String.format("(%.0f, %.0f)", x, y);
  }

}

class Link
{
  public Node start;
  public Node end;

  public Link(Node start, Node end)
  {
    this.start = start;
    this.end = end;

    this.start.subscribe(new OnItemChanged());
    this.end.subscribe(new OnItemChanged());
  }

  @Override
  public String toString() {
    return String.format("Link update: %s -> %s", start, end);
  }

  private class OnItemChanged extends Observer {
    @Override
    public void update() {
      System.out.println(Link.this);
    }
  }

}

abstract class Observer
{
  public abstract void update();
}



