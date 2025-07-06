import FileManager.FileItemViewType;
import FileManager.FileManager;
import FileManager.SaveFileManager;

/*

Разработать макет программы файловый менеджер с использованием следующих паттернов:
	- абстрактная фабрика или фабричный метод
	- наблюдатель
	- декоратор
	- прокси
	- Singleton

*/

public class App {
  public static void main(String[] args) throws Exception {

    // Создание файловых менеджеров
    FileManager fileManager1 = new SaveFileManager();
    FileManager fileManager2 = new SaveFileManager();
    FileManager fileManager3 = new SaveFileManager();
    FileManager fileManager4 = new SaveFileManager();

    // установить путь до дериктории для каждого менеджера
    fileManager1.setPath("C:/Temp/Patterns");
    fileManager2.setPath("C:/Temp/Patterns");
    fileManager3.setPath("C:/Temp/Patterns");
    fileManager4.setPath("C:/Temp/Android");

    // создать файл во втором менеджере
    fileManager2.createFile("newFile.txt");
    breakLine();

    // установить тип отображения элемента (list, grid)
    fileManager1.setType(FileItemViewType.grid);
    // установить выводимые столбцы для первого менеджера
    fileManager1.setShowValues(true, true);
    // показать содержимое текущей папки для первого менеджера
    fileManager1.printItems();

    // завершить работу менеджеров
    fileManager1.close();    
    fileManager2.close();
    fileManager3.close();
    fileManager4.close();

  }

  public static void breakLine(){
    System.out.println("\n\n");
  }

}

