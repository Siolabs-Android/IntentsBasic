package com.siolabs.intentbasics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends Activity {
	
	EditText eText1;
	EditText eText2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		eText1 = (EditText) findViewById(R.id.editText1);
		eText2 = (EditText) findViewById(R.id.editText2);
	}
	
	public void BtnClicked(View view){
		
		
		//get the data from the editTexts
		
		String uName = eText1.getText().toString();
		String email = eText2.getText().toString();
		
		//create a new intent
		Intent i = new Intent(getApplicationContext(), SecondActivity.class);
		
		//insert the data to pass to second activity
		i.putExtra("username", uName);
		i.putExtra("email", email);
		
		
		//start the new activity with this intent
		startActivity(i);
		
	}
}
