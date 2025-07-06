public class NetworkUtilit {

  public NetworkUtilit(NetworkType type) { }

  public String doAnalysis() {
    return "OK";
  }
}

enum NetworkType{
  old,
  normal,
  improved
}

