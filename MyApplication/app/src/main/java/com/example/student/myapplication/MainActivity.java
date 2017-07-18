package com.example.student.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textBox = (TextView) findViewById(R.id.textview);
                textBox.setText(textBox.getText() == "Hello World" ? "Christian Russell"
                    : "Hello World"
                );
                Toast.makeText(getApplicationContext(), "Christian Says:\nBurned Bread == Best Toast", Toast.LENGTH_LONG).show();
            }
        });
        Button fab2 = (Button)this.findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textBox = (TextView) findViewById(R.id.textview);
                textBox.setText(textBox.getText() == "Hello World" ? "Christian Russell"
                        : "Hello World"
                );
                Toast.makeText(getApplicationContext(), "Christian Says:\nBurned Bread == Best Toast", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        TextView textBox = (TextView) findViewById(R.id.textview);
        textBox.setText(textBox.getText() == "Hello World" ? "Christian Russell"
                : "Hello World"
        );
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
}
