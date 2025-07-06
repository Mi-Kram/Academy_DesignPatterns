public class PasswordUtilit implements IAntiVirusUtilit {

  public PasswordUtilit(SystemAccess access, AntiVirusType type) { }

  @Override
  public IAntiVirusUtilitResult check(OperatingSystem system) {
    return new PasswordUtilitResult();
  }
  
}

class PasswordUtilitResult implements IAntiVirusUtilitResult{

  @Override
  public String[] getDangers() {
    return new String[0];
  }

  @Override
  public String info() {
    return "Password utilit works";
  }

}
