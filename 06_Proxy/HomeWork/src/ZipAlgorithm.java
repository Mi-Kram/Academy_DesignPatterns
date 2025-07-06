public class ZipAlgorithm {

  private ZipAlgorithm(String zipType) { }

  public static ZipAlgorithm byType(String zipType) {
    if(!exist(zipType)) return null;
    System.out.println("Алгоритм сжатия найден");
    return new ZipAlgorithm(zipType); 
  }
  
  private static boolean exist(String zipType) { return true; }

  public byte[] zip(ArchivatorData data){
    System.out.println("Архивация информации");
    return new byte[0];
  }

  public byte[] unzip(ArchivatorData data){
    System.out.println("Разархивация информации");
    return new byte[0];
  }

}
