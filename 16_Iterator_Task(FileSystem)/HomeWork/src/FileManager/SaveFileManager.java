package FileManager;

// файл менеджер который сеачала проверяет путь
// а потом уже меняет его
public class SaveFileManager extends FileManager {

  @Override
  public void setPath(String path) {
    if(path.length() == 0) path = "C:\\"; 
    // File folder = new File(path);
    // if(!folder.exists() || !folder.isDirectory()) return;

    super.setPath(path);
  }
  
}
