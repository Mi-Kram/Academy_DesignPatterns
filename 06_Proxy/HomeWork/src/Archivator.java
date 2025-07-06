import java.util.Scanner;

interface IArchivator{
  boolean zip(String[] files, String zipMethod, String result_path);
  boolean unzip(String archive_path, String result_path);
}

public class Archivator implements IArchivator{

  public boolean zip(String[] files, String zipMethod, String result_path){
    ArchivatorData data = new ArchivatorData();
    data.Add(files);
    if(!data.hasFiles()) return false;

    ZipAlgorithm algorithm = ZipAlgorithm.byType(zipMethod);
    if(algorithm == null) return false;

    byte[] result = algorithm.zip(data);
    // File.writeAllBytes(result_path, result);
    System.out.println("Запись результата\n");

    return true;
  }

  public boolean unzip(String archive_path, String result_path){
    ArchivatorData data = new ArchivatorData();
    data.Add(archive_path);
    if(!data.hasFiles() || !data.isZipFile()) return false;
    
    ZipAlgorithm algorithm = ZipAlgorithm.byType(data.getZipAlgorithm());
    if(algorithm == null) return false;
    
    byte[] result = algorithm.unzip(data);
    // File.writeAllBytes(result_path, result);
    System.out.println("Запись результата\n");

    return true;
  }
}

class ProtectedArchivator implements IArchivator{

  Archivator archivator;
  Scanner sc;

  public ProtectedArchivator(){
    archivator = new Archivator();
    sc = new Scanner(System.in);
  }

  @Override
  public boolean zip(String[] files, String zipMethod, String result_path) {
    try{
      System.out.print("Enter password> ");
      String password = sc.nextLine();

      if(password.length() == 0) return false;
    }
    catch(Exception ex) { System.out.println(ex.getMessage()); }
    
    return archivator.zip(files, zipMethod, result_path);
  }

  @Override
  public boolean unzip(String archive_path, String result_path) {

    try {
      System.out.print("Enter password> ");
      String password = sc.nextLine();

      if(password.length() == 0) return false;
    } 
    catch(Exception ex) { 
      System.out.println("Exception. " + ex.getMessage());
    }
    
    return archivator.unzip(archive_path, result_path);
  }


}

class LazzyArchivator implements IArchivator{

  Archivator archivator = null;

  public LazzyArchivator() { }

  @Override
  public boolean zip(String[] files, String zipMethod, String result_path) {
    if(archivator == null) archivator = new Archivator();
    return archivator.zip(files, zipMethod, result_path);
  }

  @Override
  public boolean unzip(String archive_path, String result_path) {
    if(archivator == null) archivator = new Archivator();
    return archivator.unzip(archive_path, result_path);
  }


}
