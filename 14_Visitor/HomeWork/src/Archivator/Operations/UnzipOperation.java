package Archivator.Operations;

import Archivator.ArchFile;
import Archivator.ZipAlgorithm;

public class UnzipOperation implements IOperation {

  @Override
  public void handle(ArchFile file) {
    ZipAlgorithm algorithm = file.getAlgorithm();
    file.unzipBytes(algorithm);
  }
  
}
