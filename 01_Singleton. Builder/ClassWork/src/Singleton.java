public final class Singleton{
  private static Singleton instance = new Singleton();

  private Singleton() { }

  public static Singleton Instance(){
    return instance;
  }
}
