import java.util.ArrayList;

public class AntiVirus {
  private ArrayList<IAntiVirusUtilit> utilities;

  public AntiVirus() {
    utilities = new ArrayList<IAntiVirusUtilit>();
  }

  public void add(IAntiVirusUtilit utilit){
    utilities.add(utilit);
  }

  public void check(OperatingSystem system){
    for (IAntiVirusUtilit utilit : utilities) {
      IAntiVirusUtilitResult result = utilit.check(system);
      String info = result.info();
      System.out.println(info);
    }
  }
}

interface IAntiVirusUtilit {
  IAntiVirusUtilitResult check(OperatingSystem system);
}

interface IAntiVirusUtilitResult {
  String[] getDangers();
  String info();
}

enum SystemAccess{
  low,
  medium,
  high
}

enum AntiVirusType{
  fast,
  detail,
  full
}

