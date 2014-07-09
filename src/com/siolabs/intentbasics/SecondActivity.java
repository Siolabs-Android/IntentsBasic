package com.siolabs.intentbasics;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		//get the controls to show the data
		
		TextView tView1 = (TextView)findViewById(R.id.textView1);
		TextView tView2 = (TextView)findViewById(R.id.textView2);
		
		//get the intent to find the data
		Intent i = getIntent();
		
		
		//get the data from the intent and show them to the textViews
		tView1.setText(i.getExtras().getString("username"));
		tView2.setText(i.getExtras().getString("email"));
		
				
	}
}
