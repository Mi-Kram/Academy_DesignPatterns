public class ArchivatorData{

  public void Add(String path) {
    System.out.println("Файл получен");
  }
  public void Add(String[] paths) {
    System.out.println("Файлы получены");
  }

  public String getZipAlgorithm() { return "zip"; }

  public boolean hasFiles() { return true; }
  public boolean isZipFile() { return true; }
  
}
