package BuilderPattern;

public class MusicPlayer {
  protected Music music = null; 

  public void play(Music music) {
    if(music == null) return;
    
    this.music = music;
    System.out.println("Play music:");
    System.out.println(String.format("Title: %s", music.title));
    System.out.println(String.format("Type: %s", music.type));
    System.out.println(String.format("Author: %s", music.author));
    System.out.println(String.format("Description: %s", music.description));
    System.out.println(String.format("Path: %s\n", music.path));
  }

  public void load(IMusicBuilder builder, int path){
    // read title from file
    String title = RandomData.getTitle(path);
    // read author from file
    String author = RandomData.getAuthor(path);
    // read type from file
    String type = RandomData.getType(path);
    // read description from file
    String description = RandomData.getDescription(path);

    // read bytes and etc...

    builder
    .setTitle(title)
    .setAuthor(author)
    .setType(type)
    .setDescription(description)
    .setPath(String.valueOf(path));
  }
}

class RandomData {
  private static final String[] titles = new String[]{
    "But Is It User Friendly?",
    "Emotional Security: A New Algorithm",
    "Fifty Years in Buckingham Palace Kitchens",
    "Is Anger the Enemy?",
    "Life Without Fear",
    "Net Etiquette",
    "Secrets of Silicon Valley",
    "Sushi, Anyone?",
    "Straight Talk About Computers",
    "Silicon Valley Gastronomic Treats"
  };

  private static final String[] authors = new String[]{
    "Abraham Bennet",
    "Reginald Blotchet-Halls",
    "Cheryl Carson",
    "Michel DeFrance",
    "Innes del Castillo",
    "Ann Dull",
    "Marjorie Green",
    "Morningstar Greene",
    "Burt Gringlesby"
  };

  private static final String[] types = new String[]{
    "business",
    "mod_cook",
    "popular_comp",
    "psychology",
    "trad_cook",
    "UNDECIDED"
  };

  private static final String[] descriptions = new String[]{
    "Helpful hints on how to use your electronic resources to the best advantage.",
    "Favorite recipes for quick, easy, and elegant meals.",
    "Traditional French gourmet recipes adapted for modern microwave cooking.",
    "A survey of software for the naive user, focusing on the 'friendliness' of each.",
    "Muckraking reporting on the world's largest computer hardware and software manufacturers.",
    "A must-read for computer conferencing.",
    "Detailed instructions on how to make authentic Japanese sushi in your spare time."
  };

  public static String getTitle(int rand){
    return titles[rand % titles.length];
  }

  public static String getAuthor(int rand){
    return authors[rand % authors.length];
  }

  public static String getType(int rand){
    return types[rand % types.length];
  }

  public static String getDescription(int rand){
    return descriptions[rand % descriptions.length];
  }

}
