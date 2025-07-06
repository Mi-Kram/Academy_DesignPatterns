package BuilderPattern;

public class DefaultMusicBuilder implements IMusicBuilder {
  protected Music music;

  public DefaultMusicBuilder() {
    music = new Music();
  }

  public IMusicBuilder clear(){
    music = new Music();
    return this;
  }

  @Override
  public IMusicBuilder setAuthor(String author) {
    music.author = author;
    return this;
  }

  @Override
  public IMusicBuilder setPath(String path) {
    music.path = path;
    return this;
  }

  @Override
  public IMusicBuilder setTitle(String title) {
    music.title = title;
    return this;
  }

  @Override
  public IMusicBuilder setType(String type) {
    music.type = type;
    return this;
  }

  @Override
  public IMusicBuilder setDescription(String description) {
    music.description = description;
    return this;
  }

  @Override
  public Music build() {
    Music result = music;
    clear();
    return result;
  }

}
