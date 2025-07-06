public class App {
  public static void main(String[] args) throws Exception {
    Archivator archivator = new Archivator();

    String[] files = new String[]{
      "C://Temp/text.txt",
      "C://Temp/picture.png",
      "C://Temp/video.mp4"
    };

    archivator.zip(files, "zip", "C://User/Desktop/result.zip");
    archivator.unzip("C://User/Desktop/result.zip", "C://User/Desktop/result_catalog");
    
  }
}
