package FileManagerView.FileItemCreator;

import File.FileItemInfo;
import FileManagerView.View;
import FileManagerView.FileItemFactory.FileItemFactory;

// декоратор типа файла (файл/папка)
public class TypeViewCreator extends FileViewDecorator {

  public TypeViewCreator() {  }

  public TypeViewCreator(IFileViewCreator base) {
    super(base);
  }

  @Override
  public View create(FileItemCreator creator, FileItemInfo file) {
    // получить вьюшку (Layoyt)
    View view = base.create(creator, file);
    // получить фабрику
    FileItemFactory factory = creator.getFileItemFactory();
    // добавить во вьюшку элемент названия фала
    view.appendText(factory.createType(file).toString());
    view.appendText("  ");
    
    return view;
  }
  
}

