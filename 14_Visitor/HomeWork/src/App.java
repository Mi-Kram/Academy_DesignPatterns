import Archivator.Archivator;
import Archivator.FileInfo;

public class App {
  public static void main(String[] args) throws Exception {
    Archivator archivator = new Archivator();

    FileInfo zipFile = new FileInfo("C:\\Temp\\text.txt", "C:\\Temp\\text.zip");
    archivator.zip(zipFile);

    FileInfo unzipFile = new FileInfo("C:\\Temp\\text.zip", "C:\\Temp\\text.txt");
    archivator.unzip(unzipFile);

  }
}
