public class Cache
{
  private int size;
  private int idNb;
  private int maxSize;
  List<Video> videos = new ArrayList<Video>();
  public Cache(int nb, int maxSizeInput)
  {
    idNb = nb;
    size = maxSizeInput;
    maxSize = maxSizeInput;
  }
  public int getAvailableSize()
  {
    return size;
  }

  public void addVideo(Video video)
  {
    videos.add(video);
    size -= video.size;
  }

  public int getID()
  {
    return idNb;
  }

  public boolean isCacheFull()
  {
    if (size > 0)
      return false;
    else
      return true;
  }

  public boolean isNotEmpty()
  {
    if (size < maxSize)
      return true;
    else
      return false;
  }
}