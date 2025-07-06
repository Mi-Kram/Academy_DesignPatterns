package FileManagerView.FileItemCreator;

import File.FileItemInfo;
import FileManagerView.View;
import FileManagerView.FileItemFactory.FileItemFactory;

// декоратор даты
public class DateViewCreator extends FileViewDecorator {

  public DateViewCreator() { }

  public DateViewCreator(IFileViewCreator base) {
    super(base);
  }

  @Override
  public View create(FileItemCreator creator, FileItemInfo file) {
    // получить вьюшку (Layoyt)
    View view = base.create(creator, file);
    // получить фабрику
    FileItemFactory factory = creator.getFileItemFactory();
    // добавить во вьюшку элемент даты
    view.appendText(factory.createDate(file).toString());
    view.appendText("  ");

    return view;
  }
  
}
