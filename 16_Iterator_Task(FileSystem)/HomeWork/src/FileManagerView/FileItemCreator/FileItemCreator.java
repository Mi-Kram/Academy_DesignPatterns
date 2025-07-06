package FileManagerView.FileItemCreator;

import File.FileItemInfo;
import FileManagerView.View;
import FileManagerView.FileItemFactory.FileItemFactory;

// создатель элементов контейнера
public class FileItemCreator {
  
  // фабрика для создания подэлементов
  protected FileItemFactory fileItemFactory;
  // создатель начального подэлемента
  protected IFileViewCreator creator;

  public FileItemCreator(FileItemFactory fileItemFactory) {
    this.fileItemFactory = fileItemFactory;

    // установить начальные подэлементы
    resetDecorator();
    addDecorator(new DateViewCreator());
    addDecorator(new SizeViewCreator());
  }

  public FileItemFactory getFileItemFactory() {
    return fileItemFactory;
  }

  public void setFileItemFactory(FileItemFactory fileItemFactory){
    this.fileItemFactory = fileItemFactory;
  }

  // добавить подэлемент
  public void addDecorator(FileViewDecorator decorator){
    decorator.setDefaultCreator(creator);
    creator = decorator;
  }

  // сбросить подэлементы до минимума
  public void resetDecorator(){
    IFileViewCreator type = new TypeViewCreator();
    IFileViewCreator name = new NameViewCreator(type);
    creator = name;
  }

  // создать вьюшку из подэлементов
  public View create(FileItemInfo file){
    return creator.create(this, file);
  }

}
