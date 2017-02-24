import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class HashCode
{
	public static void main(String[] args) throws Exception
	{
		Scanner fileScanner = new Scanner(new File("me_at_the_zoo.in"));
		int i;
		i = fileScanner.nextInt();
		System.out.println(i);
		fileScanner.nextLine();

		List<Integer> videos = new ArrayList<Integer>();

		for (int j = 0; j<i; j++)
		{
			videos.add(fileScanner.nextInt());
		}

		Collections.sort(videos);
		for (int j = 0; j<i; j++)
		{
			System.out.print(videos.get(j) + " ");
		}
		









	}
}