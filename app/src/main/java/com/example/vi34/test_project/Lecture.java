package com.example.vi34.test_project;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Lecture extends ListActivity {

    ListView listView;
    ArrayAdapter<String> adapter;
    MyAdapter<String> myAdapter;
    ArrayList<String> list = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);

        //ListAdapter adapter = new ListAdapter(this,R.layout.layout2, new String[] {"a","b"});
        //adapter

        //listView = (ListView) findViewById(R.id.listView);
        //adapter = new ArrayAdapter<String>(this, R.layout.my_list); //, new String[] {"a", "b"});
        list.add("1");
        list.add("2");
        myAdapter = new MyAdapter<String>(list);
        setListAdapter(myAdapter);


        //listView.setAdapter(adapter);
    }


    public static int sum(int a, int b){
        return a + b;
    }


    public void addClicked(View view) {
        EditText editText = (EditText) findViewById(R.id.edit);
       // adapter.add(editText.getText().toString());
        list.add(editText.getText().toString());
        myAdapter.notifyDataSetChanged();
        Toast.makeText(this,editText.getText(),0).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lecture, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
