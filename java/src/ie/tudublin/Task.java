package ie.tudublin;

import processing.data.TableRow;

public class Task {

        private String task;
        private int start;
        private int end;

    public Task (String task, int start, int end)
    {
        this.task = task;
        this.start = start;
        this.end = end;
    }

    public String getTask() {
        return task;
    }
    
    
    public Task(TableRow tr)
    {
        this(tr.getString("task"), tr.getInt("start"), tr.getInt("end"));

    }

    public String toString()
    {
        return this.task + ", " + this.start +", " + this.end;
    }

}