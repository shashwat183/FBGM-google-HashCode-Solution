import java.util.ArrayList;
import java.util.List;
public class Video
{
	List<EndPoint> endPoints = new ArrayList<EndPoint>();
  List<Integer> requestsInEndPoint = new ArrayList<Integer>();
  public final int size;
  public final int index;
  public int totalRequests;
  public Video(int indexOfVideo, int requiredSize, int totalRequests)
  {
  	size = requiredSize;
  	index = indexOfVideo;
  }

  public void addEndPoint(EndPoint endPoint)
  {
  	endPoints.add(endPoint);
  }
  public void addRequestInEndPoint(int newRequests)
  {
  	requestsInEndPoint.add(newRequests);
  }

  public int getSize()
  {
  	return size;
  }

  public EndPoint getMostRequestedEndPoint()
  {
  	EndPoint tempEndPoint;
  	int tempValue;
  	  for (int index = 0; index < endPoints.size();index++)
  		{
  			if (requestsInEndPoint.get(index)<requestsInEndPoint.get(index+1))
  			{
  				tempValue = requestsInEndPoint.get(index);
  				requestsInEndPoint.set(index, requestsInEndPoint.get(index+1));
  				requestsInEndPoint.set(index+1,tempValue);

  				tempEndPoint = endPoints.get(index);
  				endPoints.set(index, endPoints.get(index+1));
  				endPoints.set(index+1,tempEndPoint);
  			}
  		}
  		return endPoints.get(0);
  }

  public int noOfRequests(int index)
  {
  	return requestsInEndPoint.get(index);
  }

  public EndPoint getEndPoint(int index)
  {
  	return endPoints.get(index);
  }
}