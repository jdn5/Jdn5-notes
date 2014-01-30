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

public class CounterActivity extends Activity
{

	Button createcounter;
	EditText namebox;
	ArrayList<CounterObject> list;
	private ListView counters;
	private ArrayAdapter<CounterObject> adapter;
	Gson gson;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_counter);
		createcounter = (Button)findViewById(R.id.createcounter);
		namebox = (EditText) findViewById(R.id.namebox);
		counters = (ListView) findViewById(R.id.listView);
		
	}

	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		list = new ArrayList<CounterObject>();
		adapter = new ArrayAdapter<CounterObject>(this,
				R.layout.activity_counter, list);
		counters.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.counter, menu);
		return true;
	}
	
	public void newCounter(View view){
		String name = namebox.getText().toString();
		CounterObject c = new CounterObject(name);
		list.add(c);
		//adapter.notifyDataSetChanged();
	}

	/**
	 * @uml.property  name="counterObject"
	 * @uml.associationEnd  inverse="counterActivity:jdn5_notes.counter.CounterObject"
	 */
	private CounterObject counterObject;

	/**
	 * Getter of the property <tt>counterObject</tt>
	 * @return  Returns the counterObject.
	 * @uml.property  name="counterObject"
	 */
	public CounterObject getCounterObject()
	{

		return counterObject;
	}

	/**
	 * Setter of the property <tt>counterObject</tt>
	 * @param counterObject  The counterObject to set.
	 * @uml.property  name="counterObject"
	 */
	public void setCounterObject(CounterObject counterObject)
	{

		this.counterObject = counterObject;
	}

}