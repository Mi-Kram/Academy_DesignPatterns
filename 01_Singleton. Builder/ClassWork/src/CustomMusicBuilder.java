import BuilderPattern.IMusicBuilder;
import BuilderPattern.Music;

/**
 * Custom builder позволяет обрабатывать вводимые данные
 */
public class CustomMusicBuilder implements IMusicBuilder {
  protected Music music;

  public CustomMusicBuilder() {
    music = new Music();
  }

  public IMusicBuilder clear(){
    music = new Music();
    return this;
  }

  @Override
  public IMusicBuilder setAuthor(String author) {
    music.author = author + " \"custom\"";
    return this;
  }

  @Override
  public IMusicBuilder setPath(String path) {
    music.path = path + " \"custom\"";
    return this;
  }

  @Override
  public IMusicBuilder setTitle(String title) {
    music.title = title + " \"custom\"";
    return this;
  }

  @Override
  public IMusicBuilder setType(String type) {
    music.type = type + " \"custom\"";
    return this;
  }

  @Override
  public IMusicBuilder setDescription(String description) {
    music.description = description + " \"custom\"";
    return this;
  }

  @Override
  public Music build() {
    Music result = music;
    clear();
    return result;
  }

}
