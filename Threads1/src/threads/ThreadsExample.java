package threads;

import java.util.Random;

public class ThreadsExample implements Runnable
{
	private String name;
	private int time;
	Random r = new Random();
	
	public ThreadsExample(String x) 
	{
		name = x;
		time = r.nextInt(1000);
	}
	
	public void run() 
	{
		try 
		{
			System.out.printf("%s is sleeping for %d milliseconds\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		} 
		catch (Exception e) {} 
	}
	
	
}
