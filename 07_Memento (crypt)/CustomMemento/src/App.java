
import CustomMemento.CustomMemento;

public class App {
  public static void main(String[] args) throws Exception {

    CustomMemento<String> memento = new CustomMemento<String>(10);

    memento.add("First");   memento.add("Second");   memento.add("Third");
    memento.add("Fourth");  memento.add("Fifth");    memento.add("Sixth");
    memento.add("Seventh"); memento.add("Eighth");   memento.add("Ninth");
    memento.add("Tenth");   memento.add("Eleventh"); memento.add("Twelvth");

    memento.print();
    memento.save();
    // */
    

    // ============================


    /*CustomMemento<String> memento = new CustomMemento<String>(10);
    memento.restore();


    memento.print();


    // System.out.println(memento.getAt(1));
    // memento.removeWithoutLast(5);
    // System.out.println(memento.getAt(1));
    // memento.print();
    // */



    // ===========================


    /*CustomMemento<Person> memento = new CustomMemento<Person>(10);

    memento.add(new Person("Name1", 11, "Address1", "Phone1"));
    memento.add(new Person("Name2", 22, "Address2", "Phone2"));
    memento.add(new Person("Name3", 33, "Address3", "Phone3"));
    memento.add(new Person("Name4", 44, "Address4", "Phone4"));
    memento.add(new Person("Name5", 55, "Address5", "Phone5"));

    memento.print();
    memento.save(); //*/


    /*CustomMemento<String> memento = new CustomMemento<String>(10);
    memento.restore();
    memento.print(); //*/




  }
}
