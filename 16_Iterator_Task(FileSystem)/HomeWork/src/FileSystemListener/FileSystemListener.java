package FileSystemListener;

public class FileSystemListener extends FileSystemObserver {
  private final static FileSystemListener instance;

  static {
    instance = new FileSystemListener();
  }

  private FileSystemListener() { }

  public static FileSystemListener getInstance(){
    return instance;
  }

}
