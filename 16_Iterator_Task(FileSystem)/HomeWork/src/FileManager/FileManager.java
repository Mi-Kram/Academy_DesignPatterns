package FileManager;

import java.util.ArrayList;

import File.FileItemInfo;
import FileManagerView.*;
import FileManagerView.FileItemCreator.*;
import FileManagerView.FileItemFactory.*;

public class FileManager extends AbstractFileManager {

  // файлы текущей папки
  protected final ArrayList<FileItemInfo> fileItems;
  // тип вьюшки для отображения фала (list, grid)
  protected FileItemViewType fileItemViewType;
  // создатель вьюшек
  protected final FileItemCreator fileItemCreator;

  public FileManager() {
    fileItems = new ArrayList<>();
    // прочить файлы из текущей папки
    readFiles(); 

    fileItemViewType = FileItemViewType.list;
    fileItemCreator = new FileItemCreator(getFactory());
  }

  protected void readFiles(){
    fileItems.clear();
    fileItems.add(new FileItemInfo("C:/Temp/Patterns", "text.txt", 1648761918000l, 123, true));
    fileItems.add(new FileItemInfo("C:/Temp/Patterns", "test.txt", 1648766918000l, 482, true));
    fileItems.add(new FileItemInfo("C:/Temp/Patterns", "Pictures", 1648561918000l, 0, false));
    fileItems.add(new FileItemInfo("C:/Temp/Patterns", "mouse.jpg", 1648261918000l, 78230, true));
    fileItems.add(new FileItemInfo("C:/Temp/Patterns", "code.java", 1649761918000l, 820, true));
  }

  @Override
  public void setPath(String path) {
    super.setPath(path);
    // прочить файлы из текущей папки
    readFiles();
  }

  // найти фабрику по типу fileItemViewType
  protected FileItemFactory getFactory(){
    switch (fileItemViewType) {
      case list: return new ListFileItemFactory();
      case grid: return new GridFileItemFactory();
      default: return new ListFileItemFactory();
    }
  }
  
  // изменить тип отображения элементов
  public void setType(FileItemViewType type){
    fileItemViewType = type;
    fileItemCreator.setFileItemFactory(getFactory());
  }

  // изменить отображающуюся информацию элементов
  public void setShowValues(boolean date, boolean size){
    // обновить значение до начального
    fileItemCreator.resetDecorator();
    // если надо отображать дату, то добавить соответсвующий декоратор
    if(date) fileItemCreator.addDecorator(new DateViewCreator());
    // если надо отображать размер, то добавить соответсвующий декоратор
    if(size) fileItemCreator.addDecorator(new SizeViewCreator());
  }

  public void printItems(){
    // вывод всех файлов и папок
    for (FileItemInfo file : fileItems) {
      // создать вьюшку
      View view = fileItemCreator.create(file);
      System.out.println(view.toString());
    }
  }

  // region FileOperation Events 

  @Override
  public void onFileCreation(String root, String name) {
    if(isSamePath(root)) System.out.println("OnFileCreation");
  }

  @Override
  public void onFileMove(String root, String name, String toRoot) {
    if(isSamePath(root)) System.out.println("OnFileMove");
  }

  @Override
  public void onFileRemove(String root, String name) {
    if(isSamePath(root)) System.out.println("OnFileRemove");
  }

  @Override
  public void onFileRename(String root, String oldName, String newName) {
    if(isSamePath(root)) System.out.println("OnFileRename");
  }

  @Override
  public void onFolderCreation(String root, String name) {
    if(isSamePath(root)) System.out.println("OnFolderCreation");
  }

  @Override
  public void onFolderMove(String root, String name, String toRoot) {
    if(isSamePath(root)) System.out.println("OnFolderMove");
  }

  @Override
  public void onFolderRemove(String root, String name) {
    if(isSamePath(root)) System.out.println("OnFolderRemove");
  }

  @Override
  public void onFolderRename(String root, String oldName, String newName) {
    if(isSamePath(root)) System.out.println("OnFolderRename");
  }

  // endregion
  
}
