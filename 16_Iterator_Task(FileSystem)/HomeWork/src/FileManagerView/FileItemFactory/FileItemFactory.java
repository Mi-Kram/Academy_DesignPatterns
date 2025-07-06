package FileManagerView.FileItemFactory;

import File.FileItemInfo;
import FileManagerView.View;

public abstract class FileItemFactory {
  
  public abstract View createType(FileItemInfo file);
  public abstract View createName(FileItemInfo file);
  public abstract View createDate(FileItemInfo file);
  public abstract View createSize(FileItemInfo file);

}
