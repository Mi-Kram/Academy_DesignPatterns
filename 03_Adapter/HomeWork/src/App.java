import java.util.Random;

public class App {
  public static void main(String[] args) throws Exception {
    OperatingSystem system = new OperatingSystem();
    AntiVirus antiVirus = new AntiVirus();

    antiVirus.add(new FileSystemUtilit(SystemAccess.high, AntiVirusType.full));
    antiVirus.add(new MiningUtilit(SystemAccess.medium, AntiVirusType.detail));
    antiVirus.add(new PasswordUtilit(SystemAccess.low, AntiVirusType.fast));
    antiVirus.add(new MyNetworkUtilit(SystemAccess.high, AntiVirusType.detail));

    antiVirus.check(system);




    Random rand = new Random();
    System.out.println(String.format("\n\nОбнаружено потенциальных угроз: %d !", rand.nextInt(3, 10)));
    System.out.println("Купите Pro версию, чтобы устранить неполадки!\n");
    
  }
}
