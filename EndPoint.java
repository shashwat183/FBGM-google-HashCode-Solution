import java.util.ArrayList;
import java.util.List;

public class EndPoint
{
  List<Cache> caches = new ArrayList<Cache>();
  List<Integer> latency = new ArrayList<Integer>();
  private int datacenter;
  private int nbOfCaches;

  public EndPoint(int dcL, int nbOfC)
  {
    datacenter = dcL;
    nbOfCaches = nbOfC;
  }

  public void addCache(Cache cache, int thisLatency)
  {
    caches.add(cache);
    latency.add(thisLatency);
  }

  public Cache getClosestCache()
  {
    int start = 0;
    for (int i = 0; i < latency.size(); i++)
    {
      if (latency.get(i) > latency.get(i+1))
      {
        int tempL = latency.get(i);
        latency.set(i+1, latency.get(i));
        latency.set(i, tempL);
        Cache tempC = caches.get(i);
        caches.set(i+1, caches.get(i));
        caches.set(i, tempC);
      }
    }
    while (caches.get(start).isCacheFull() || start < caches.size())
      start++;
    if (start > caches.size() - 1)
      return null;
    else
      return caches.get(start);
  }
}