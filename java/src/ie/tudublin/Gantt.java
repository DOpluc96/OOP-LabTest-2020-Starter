package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Gantt extends PApplet
{	
	public ArrayList<Task> task = new ArrayList<Task>();


	float border;
	float left;
	float h;



	public void settings()
	{
		size(800, 600);

		border = width * 0.1f;
		left = width * 0.05f;
		h = height * 0.05f;
		
	}

	public void loadTasks()
	{
		Table table = loadTable("tasks.csv", "header");
			for(TableRow tr:table.rows())
			{
				Task t = new Task(tr);
				task.add(t);
			}
	}

	public void printTasks()
	{
		for(Task t:task)
		{
			System.out.println(t);
		}
	}

	public void displayTasks()

	{
		for(int i = 0 ; i< task.size() ; i++){

		Task t = task.get(i);

		float y = map(i,0, task.size(), border, height - border);

		fill(255);
		textAlign(LEFT, CENTER);
		text(t.getTask(), left + 10, y + (h/2));
		}

	}

	
	public void mousePressed()
	{
		println("Mouse pressed");	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
	}
	
	public void setup() 
	{
		loadTasks();
		printTasks();
	}
	
	public void draw()
	{			
		background(0);
		displayTasks();
	}
}
