package FileSystemListener;

public interface IFileSystemOperations {
  void onFileCreation(String root, String name);
  void onFileRemove(String root, String name);
  void onFileRename(String root, String oldName, String newName);
  void onFileMove(String root, String name, String toRoot);

  void onFolderCreation(String root, String name);
  void onFolderRemove(String root, String name);
  void onFolderRename(String root, String oldName, String newName);
  void onFolderMove(String root, String name, String toRoot);
}
