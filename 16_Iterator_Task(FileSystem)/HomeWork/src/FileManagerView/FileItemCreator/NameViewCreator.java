package FileManagerView.FileItemCreator;

import File.FileItemInfo;
import FileManagerView.View;
import FileManagerView.FileItemFactory.FileItemFactory;

// декоратор названия файла
public class NameViewCreator extends FileViewDecorator {

  public NameViewCreator() { }

  public NameViewCreator(IFileViewCreator base) {
    super(base);
  }

  @Override
  public View create(FileItemCreator creator, FileItemInfo file) {
    // получить вьюшку (Layoyt)
    View view = base.create(creator, file);
    // получить фабрику
    FileItemFactory factory = creator.getFileItemFactory();
    // добавить во вьюшку элемент названия фала
    view.appendText(factory.createName(file).toString());
    view.appendText("  ");
    
    return view;
  }
  
}
