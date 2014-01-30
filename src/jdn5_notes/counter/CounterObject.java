package jdn5_notes.counter;

import java.util.Date;
import java.util.Collection;

public class CounterObject
{
	private int count;
	private Date time;
	private String name;
	
	public CounterObject(String name)
	{
		super();
		this.count = 0;
		this.time = new Date();
		this.name = name;
	}
		
	public CounterObject(){	
		super();
		this.count = 0;
		this.time = new Date();
		this.name = "Counter";
	 }
	
	public String showData(){
		return name + ": " + count;
	}
	
	public int getCount(){
		return count;
	}

	
	public void setCount(int count){
		this.count = count;
	}

	
	public Date getTime(){
		return time;
	}

	
	public void setTime(Date time){
		this.time = time;
	}

	
	public String getName(){
		return name;
	}

	
	public void setName(String name){
		this.name = name;
	}
	public void increment(){
		count++;
	}
	/**
	 * @uml.property  name="counterActivity"
	 * @uml.associationEnd  multiplicity="(0 -1)" aggregation="shared" inverse="counterObject:jdn5_notes.counter.CounterActivity"
	 */
	private Collection<CounterActivity> counterActivity;

	/**
	 * Getter of the property <tt>counterActivity</tt>
	 * @return  Returns the counterActivity.
	 * @uml.property  name="counterActivity"
	 */
	public Collection<CounterActivity> getCounterActivity()
	{

		return counterActivity;
	}



	/**
	 * Setter of the property <tt>counterActivity</tt>
	 * @param counterActivity  The counterActivity to set.
	 * @uml.property  name="counterActivity"
	 */
	public void setCounterActivity(Collection<CounterActivity> counterActivity)
	{

		this.counterActivity = counterActivity;
	}
	
}
