import java.util.*;
public class Story
{
	static String as_a;
	static String i_Want_to;
	static String so_that;
	static int priority, point;
	List<Task> Tasks = new ArrayList<Task>();
	public Story(String as_a, String i_Want_to, String so_that, int priority, int point)
	{
		Story.as_a=as_a;
		Story.i_Want_to=i_Want_to;
		Story.so_that=so_that;
		Story.priority=priority;
		Story.point=point;
	}
	public void setTask(String string, int i)
	{
		Task newTask= new Task();
		newTask.name=string;
		newTask.duration=i;
		Tasks.add(newTask);
	}
}