import java.util.*;
public class Sprint
{
	List<Story> sprintStories= new ArrayList<Story>();
	static int duration;
	public static void setSprint(int duration)
	{
		Sprint.duration=duration;
	}
	public void addStory(Story newStory)
	{
		sprintStories.add((Story) newStory);
	}
}