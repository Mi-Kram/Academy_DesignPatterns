package Archivator;

import java.util.ArrayList;

import Archivator.Operations.*;

public class Archivator {
  ArrayList<IOperation> zipOperations;
  ArrayList<IOperation> unzipOperations;

  public Archivator() {
    zipOperations = new ArrayList<>();
    zipOperations.add(new ReadOperation());
    zipOperations.add(new ZipOperation());
    zipOperations.add(new WriteOperation());

    unzipOperations = new ArrayList<>();
    unzipOperations.add(new ReadOperation());
    unzipOperations.add(new UnzipOperation());
    unzipOperations.add(new WriteOperation());
  }

  public void zip(FileInfo file){
    System.out.println("Zip File:");
    for (IOperation operation : zipOperations) {
      operation.handle(file);
    }
    System.out.println();
  }

  public void unzip(FileInfo file){
    System.out.println("Unzip File:");
    for (IOperation operation : unzipOperations) {
      operation.handle(file);
    }
    System.out.println();
  }

}
