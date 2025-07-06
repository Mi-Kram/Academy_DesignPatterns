
public class Archivator {

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
