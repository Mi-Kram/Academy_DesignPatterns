package FileManagerView.FileItemCreator;

import File.FileItemInfo;
import FileManagerView.View;
import FileManagerView.FileItemFactory.FileItemFactory;

// декоратор размера фала
public class SizeViewCreator extends FileViewDecorator {

  public SizeViewCreator() { }

  public SizeViewCreator(IFileViewCreator base) {
    super(base);
  }

  @Override
  public View create(FileItemCreator creator, FileItemInfo file) {
    // получить вьюшку (Layoyt)
    View view = base.create(creator, file);
    // получить фабрику
    FileItemFactory factory = creator.getFileItemFactory();
    // добавить во вьюшку элемент названия фала
    view.appendText(factory.createSize(file).toString());
    view.appendText("  ");
    
    return view;
  }
  
}
