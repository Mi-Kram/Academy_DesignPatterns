public class MyNetworkUtilit implements IAntiVirusUtilit {
  NetworkUtilit utilit;

  public MyNetworkUtilit(SystemAccess access, AntiVirusType type) {
    utilit = new NetworkUtilit(NetworkType.normal);
  }

  @Override
  public IAntiVirusUtilitResult check(OperatingSystem system) {
    utilit.doAnalysis();
    // ...
    return new MyNetworkUtilitResult();
  }
  
}

class MyNetworkUtilitResult implements IAntiVirusUtilitResult{

  @Override
  public String[] getDangers() {
    return new String[0];
  }

  @Override
  public String info() {
    return "My Network utilit works";
  }

}
