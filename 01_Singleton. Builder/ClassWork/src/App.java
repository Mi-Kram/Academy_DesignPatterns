import java.util.Random;

import BuilderPattern.*;

public class App {
  private static final Random rand;
  static {
    rand = new Random();
  }

  public static void main(String[] args) throws Exception {

    // Singleton singleton1 = Singleton.Instance();
    // Singleton singleton2 = Singleton.Instance();
    // if(singleton1 == singleton2) System.out.println("Same objects!");


    // На языке Java написать пример реализации паттерна 
    // Builder для программы "Музыкальный проигрыватель"
    MusicPlayer musicPlayer = new MusicPlayer();
    DefaultMusicBuilder musicBuilder = new DefaultMusicBuilder();
    Music music;

    musicPlayer.load(musicBuilder, getPathToFile());
    music = musicBuilder.build();
    musicPlayer.play(music);

    musicPlayer.load(musicBuilder, getPathToFile());
    music = musicBuilder.build();
    musicPlayer.play(music);

    musicPlayer.load(musicBuilder, getPathToFile());
    music = musicBuilder.build();
    musicPlayer.play(music);


    CustomMusicBuilder customMusicBuilder = new CustomMusicBuilder();
    musicPlayer.load(customMusicBuilder, getPathToFile());
    music = customMusicBuilder.build();
    musicPlayer.play(music);



    music = musicBuilder
      .setTitle("Title 123")
      .setPath("Path")
      .setAuthor("Author")
      .setType("Type")
      .setDescription("Description")
      .build();

    musicPlayer.play(music);


  }

  public static int getPathToFile(){
    return rand.nextInt(100);
  }
}


