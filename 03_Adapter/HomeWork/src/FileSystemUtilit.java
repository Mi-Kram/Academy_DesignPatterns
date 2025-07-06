public class FileSystemUtilit implements IAntiVirusUtilit {

  public FileSystemUtilit(SystemAccess access, AntiVirusType type) { }

  @Override
  public IAntiVirusUtilitResult check(OperatingSystem system) {
    return new FileSystemUtilitResult();
  }
  
}

class FileSystemUtilitResult implements IAntiVirusUtilitResult{

  @Override
  public String[] getDangers() {
    return new String[0];
  }

  @Override
  public String info() {
    return "File System utilit works";
  }

}
