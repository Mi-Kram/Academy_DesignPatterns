package FileManagerView.FileItemCreator;

import File.FileItemInfo;
import FileManagerView.View;

public interface IFileViewCreator {
  View create(FileItemCreator creator, FileItemInfo file);
}
