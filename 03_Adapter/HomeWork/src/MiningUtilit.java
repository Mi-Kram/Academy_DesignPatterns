public class MiningUtilit implements IAntiVirusUtilit {

  public MiningUtilit(SystemAccess access, AntiVirusType type) { }

  @Override
  public IAntiVirusUtilitResult check(OperatingSystem system) {
    return new MiningUtilitResult();
  }
  
}


class MiningUtilitResult implements IAntiVirusUtilitResult{

  @Override
  public String[] getDangers() {
    return new String[0];
  }

  @Override
  public String info() {
    return "Mining utilit works";
  }

}

