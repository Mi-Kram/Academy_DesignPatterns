package FileSystemListener;

import java.util.ArrayList;

public abstract class FileSystemObserver implements IFileSystemOperations {
  // слушатели фаловых операций
  protected ArrayList<IFileSystemOperations> listeners;

  public FileSystemObserver() {
    listeners = new ArrayList<>();
  }

  public final void addListener(IFileSystemOperations listener){
    listeners.add(listener);
  }

  public final void removeListener(IFileSystemOperations listener){
    listeners.remove(listener);
  }

  @Override
  public final void onFileCreation(String root, String name) {
    for (IFileSystemOperations listener : listeners)
      if(listener != null)
        listener.onFileCreation(root, name);
  }

  @Override
  public final void onFileMove(String root, String name, String toRoot) {
    for (IFileSystemOperations listener : listeners)
      if(listener != null)
        listener.onFileMove(root, name, toRoot);
  }

  @Override
  public final void onFileRemove(String root, String name) {
    for (IFileSystemOperations listener : listeners)
      if(listener != null)
        listener.onFileRemove(root, name);
  }

  @Override
  public final void onFileRename(String root, String oldName, String newName) {
    for (IFileSystemOperations listener : listeners)
      if(listener != null)
        listener.onFileRename(root, oldName, newName);
  }

  @Override
  public final void onFolderCreation(String root, String name) {
    for (IFileSystemOperations listener : listeners)
      if(listener != null)
        listener.onFolderCreation(root, name);
  }

  @Override
  public final void onFolderMove(String root, String name, String toRoot) {
    for (IFileSystemOperations listener : listeners)
      if(listener != null)
        listener.onFolderMove(root, name, toRoot);
  }

  @Override
  public final void onFolderRemove(String root, String name) {
    for (IFileSystemOperations listener : listeners)
      if(listener != null)
        listener.onFolderRemove(root, name);
  }

  @Override
  public final void onFolderRename(String root, String oldName, String newName) {
    for (IFileSystemOperations listener : listeners)
      if(listener != null)
        listener.onFolderRename(root, oldName, newName);
  }

}
