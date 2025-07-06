package Archivator.Operations;

import Archivator.ArchFile;

public interface IOperation {
  public void handle(ArchFile file);
}
