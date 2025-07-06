package FileManagerView.FileItemCreator;

import File.FileItemInfo;
import FileManagerView.View;

// дополнительный декоратор
public abstract class FileViewDecorator implements IFileViewCreator {
  protected IFileViewCreator base = null;

  public FileViewDecorator() {
    this.base = (FileItemCreator creator, FileItemInfo file) -> new View("");
  }

  public FileViewDecorator(IFileViewCreator base) {
    this.base = base;
  }

  public FileViewDecorator setDefaultCreator(IFileViewCreator base){
    this.base = base;
    return this;
  }

}
