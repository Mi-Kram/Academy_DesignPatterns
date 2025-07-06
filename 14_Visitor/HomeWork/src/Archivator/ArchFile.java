package Archivator;

import java.util.Random;

public abstract class ArchFile {

  public String path;
  public String destPath;
  public byte[] bytes;
  public ZipAlgorithm algorithm;

  public ArchFile(String path, String destPath) {
    this.path = path;
    this.destPath = destPath;
    this.algorithm = null;
  }

  public void setAlgorithm(ZipAlgorithm algorithm){
    this.algorithm = algorithm;
  }

  public ZipAlgorithm getAlgorithm(){
    return algorithm;
  }

  public ZipAlgorithm defineAlgorithm(byte[] bytes){
    if(algorithm != null) return algorithm;

    switch(new Random().nextInt(3)){
      case 0: return ZipAlgorithm.rar;
      case 1: return ZipAlgorithm.zip;
      case 2: return ZipAlgorithm.gzip;
      default: return ZipAlgorithm.rar;
    }
  }

  public abstract void readBytes();

  public abstract void zipBytes(ZipAlgorithm algorithm);

  public abstract void unzipBytes(ZipAlgorithm algorithm);

  public abstract void writeBytes();
}
