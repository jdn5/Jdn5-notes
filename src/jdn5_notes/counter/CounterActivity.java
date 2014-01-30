package jdn5_notes.counter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

import com.google.gson.Gson;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.Collection;


// Main application
public class CounterActivity extends Activity
{

	private Button createcounter;
	private EditText namebox;
	private ArrayList<CounterObject> list;
	private ListView counters;
	private ArrayAdapter<String> adapter;
	private ArrayList<String> objects;
	Gson gson;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_counter);
		// Initialize button for counter creation
		createcounter = (Button)findViewById(R.id.createcounter);
		// Set namebox for naming counters
		namebox = (EditText) findViewById(R.id.namebox);
		counters = (ListView) findViewById(R.id.listView);
		
	}

	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		objects = new ArrayList<String>();
		adapter = new ArrayAdapter<String>(this,
				R.layout.activity_counter, objects);
		counters.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.counter, menu);
		return true;
	}
	
	public void newCounter(View view){ // Function used for New counter button
		String name = namebox.getText().toString();
		CounterObject c = new CounterObject(name);
		list.add(c);
		objects.add(c.showData());
		adapter.notifyDataSetChanged();
	}

	/** 
	 * @uml.property name="counterObject"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="counterActivity:jdn5_notes.counter.CounterObject"
	 */
	private Collection<CounterObject> counterObject;

	/** 
	 * Getter of the property <tt>counterObject</tt>
	 * @return  Returns the counterObject.
	 * @uml.property  name="counterObject"
	 */
	public Collection<CounterObject> getCounterObject()
	
	
	
	
	{
		return counterObject;
	}

	/** 
	 * Setter of the property <tt>counterObject</tt>
	 * @param counterObject  The counterObject to set.
	 * @uml.property  name="counterObject"
	 */
	public void setCounterObject(Collection<CounterObject> counterObject)
	
	
	
	{
	
		this.counterObject = counterObject;
	}

	/** 
	 * @uml.property name="counterObject1"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="counterActivity1:jdn5_notes.counter.CounterObject"
	 */
	private Collection<CounterObject> counterObject1;

	/** 
	 * Getter of the property <tt>counterObject1</tt>
	 * @return  Returns the counterObject1.
	 * @uml.property  name="counterObject1"
	 */
	public Collection<CounterObject> getCounterObject1()
	
	
	{
		return counterObject1;
	}

	/** 
	 * Setter of the property <tt>counterObject1</tt>
	 * @param counterObject1  The counterObject1 to set.
	 * @uml.property  name="counterObject1"
	 */
	public void setCounterObject1(Collection<CounterObject> counterObject1)
	
	
	{
		this.counterObject1 = counterObject1;
	}

}