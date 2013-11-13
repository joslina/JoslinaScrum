import java.util.*;
public class Story
{
	String as_a, i_Want_to, so_that;
	int priority, point;
	List<String> Tasks = new ArrayList<String>();
	public Story(String as_a, String i_Want_to, String so_that, int priority, int point)
	{
		this.as_a=as_a;
		this.i_Want_to=i_Want_to;
		this.so_that=so_that;
		this.priority=priority;
		this.point=point;
	}
	public void setTask(String task)
	{
		Tasks.add(task);
	}
}