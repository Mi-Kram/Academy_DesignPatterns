package Archivator.Operations;

import Archivator.ArchFile;

public class WriteOperation implements IOperation {

  @Override
  public void handle(ArchFile file) {
    file.writeBytes();
  }
  
}
