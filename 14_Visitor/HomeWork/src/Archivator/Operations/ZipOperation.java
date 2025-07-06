package Archivator.Operations;

import Archivator.ArchFile;
import Archivator.ZipAlgorithm;

public class ZipOperation implements IOperation {

  @Override
  public void handle(ArchFile file) {
    ZipAlgorithm algorithm = file.getAlgorithm();
    file.zipBytes(algorithm);
  }
  
}
