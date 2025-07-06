package Archivator.Operations;

import Archivator.ArchFile;
import Archivator.ZipAlgorithm;

public class ReadOperation implements IOperation {

  @Override
  public void handle(ArchFile file) {
    file.readBytes();
    ZipAlgorithm algorithm = file.defineAlgorithm(file.bytes);
    file.setAlgorithm(algorithm);
  }
  
}
