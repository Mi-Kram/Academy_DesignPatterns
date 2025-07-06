package BuilderPattern;

public interface IMusicBuilder {
  IMusicBuilder setTitle(String title);
  IMusicBuilder setPath(String path);
  IMusicBuilder setType(String type);
  IMusicBuilder setAuthor(String author);
  IMusicBuilder setDescription(String description);

  Music build();
}
