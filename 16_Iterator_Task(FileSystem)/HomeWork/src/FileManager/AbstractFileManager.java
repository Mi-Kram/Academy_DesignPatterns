package FileManager;

import java.io.Closeable;
import java.io.IOException;

import FileSystemListener.FileSystemListener;
import FileSystemListener.IFileSystemOperations;

public abstract class AbstractFileManager implements IFileSystemOperations, Closeable {

  // слушатель опереций
  protected final FileSystemListener listener;
  // текущий каталог
  protected String path = "C:/";

  protected AbstractFileManager() {
    listener = FileSystemListener.getInstance();
    listener.addListener(this);
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  // region Подучение сигналов об изменении файлов

  @Override
  public void onFileCreation(String root, String name) { }

  @Override
  public void onFileMove(String root, String name, String toRoot) { }

  @Override
  public void onFileRemove(String root, String name) { }

  @Override
  public void onFileRename(String root, String oldName, String newName) { }

  @Override
  public void onFolderCreation(String root, String name) { }

  @Override
  public void onFolderMove(String root, String name, String toRoot) { }

  @Override
  public void onFolderRemove(String root, String name) { }

  @Override
  public void onFolderRename(String root, String oldName, String newName) { }

  // endregion

  // region Операции с фалами

  public final void createFile(String name){
    System.out.println("Create file");
    listener.onFileCreation(path, name);
  }

  public final void moveFile(String name, String toRoot){
    System.out.println("Move file");
    listener.onFileMove(path, name, toRoot);
  }

  public final void removeFile(String name){
    System.out.println("Remove file");
    listener.onFileRemove(path, name);
  }

  public final void renameFile(String oldName, String newName){
    System.out.println("Rename file");
    listener.onFileRename(path, oldName, newName);
  }

  public final void createFolder(String name){
    System.out.println("Create folder");
    listener.onFolderCreation(path, name);
  }

  public final void moveFolder(String name, String toRoot){
    System.out.println("Move folder");
    listener.onFolderMove(path, name, toRoot);
  }

  public final void removeFodler(String name){
    System.out.println("Remove folder");
    listener.onFolderRemove(path, name);
  }

  public final void renameFolder(String oldName, String newName){
    System.out.println("Rename folder");
    listener.onFolderRename(path, oldName, newName);
  }

  public final boolean isSamePath(String value){
    return value.equalsIgnoreCase(path);
  }

  // endregion

  @Override
  public void close() throws IOException {
    listener.removeListener(this);
  }


  
}

