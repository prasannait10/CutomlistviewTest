package com.example.gamerz.cutomlistviewtest;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    //int data=10;
    ListView list;
    String[] username ={
            "Kumar",
            "Raj",
            "Gopal",
            "Franco",
            "Prasanna",
            "Arunkumar",
            "Velmurugan",
            "Chimbu"
    };
    String[] prof_name ={
            "@Kumar",
            "@Raj",
            "@Gopal",
            "@Franco",
            "@Prasanna",
            "@Arunkumar",
            "@Velmurugan",
            "@Chimbu"
    };
    Integer[] profileid={
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomListAdapter adapter=new CustomListAdapter(this, username, profileid,prof_name);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        //list.setAdapter(adapte)
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        //hii
        return super.onOptionsItemSelected(item);
    }
}
