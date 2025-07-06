package Archivator;

public class FileInfo extends ArchFile {

  public FileInfo(String path, String destPath) {
    super(path, destPath);
  }

  @Override
  public void readBytes() {
    System.out.println("Read bytes from " + path);
  }

  @Override
  public void zipBytes(ZipAlgorithm algorithm) {
    System.out.println("Zip bytes from " + path);
  }

  @Override
  public void unzipBytes(ZipAlgorithm algorithm) {
    System.out.println("Unzip bytes from " + path);
  }

  @Override
  public void writeBytes() {
    System.out.println("Write bytes to " + destPath);
  }
  
}
