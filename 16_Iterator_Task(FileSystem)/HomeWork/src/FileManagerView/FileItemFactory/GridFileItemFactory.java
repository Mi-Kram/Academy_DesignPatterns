package FileManagerView.FileItemFactory;

import java.util.Date;

import File.FileItemInfo;
import FileManagerView.View;

public class GridFileItemFactory extends FileItemFactory {

  @Override
  public View createType(FileItemInfo file) {
    return new View(file.isFile() ? "\"File\"" : "\"Folder\"");
  }

  @Override
  public View createName(FileItemInfo file) {
    return new View("\"" + file.getName() + "\"");
  }

  @Override
  public View createDate(FileItemInfo file) {
    return new View("\"" + new Date(file.getDate()).toString() + "\"");
  }

  @Override
  public View createSize(FileItemInfo file) {
    return new View(String.format("\"%d B\"", file.getSize()));
  }
  
}
