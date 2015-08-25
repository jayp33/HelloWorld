package com.example.jph.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        return super.onOptionsItemSelected(item);
    }

    public void button1(View view) {
        final TextView textView = (TextView) findViewById(R.id.textView2);
        int no = (int)(Math.random()*100);
        textView.setText(Integer.toString(no));
    }

    public void button2(View view) {
        TextView textView = (TextView) findViewById(R.id.textView2);
        int no = Integer.parseInt(textView.getText().toString());
        TextView textView2 = (TextView) findViewById(R.id.textView3);
        textView2.setText(Integer.toString(no/2));
    }
}
