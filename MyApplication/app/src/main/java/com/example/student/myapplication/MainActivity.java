package com.example.student.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int buttonPos = 0;
    private static int moveDist = 50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setX(getApplicationContext().getResources().getDisplayMetrics().widthPixels - 30);
        fab.setOnClickListener(new View.OnClickListener() {
            private int buttonPos = 0;

            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Making toast from a mailbox? sounds like a bad idea", Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), String.format("X: %f; Y: %f", view.getX(), view.getY()), Toast.LENGTH_LONG).show();
                if (buttonPos % 2 == 0) {
                    System.out.printf("%f", view.getX());
                    //view.setX(-view.getX();
                    view.setX(getApplicationContext().getResources().getDisplayMetrics().widthPixels - moveDist - view.getWidth());
                    System.out.printf("%f", view.getX());
                } else {
                    System.out.printf("%f", view.getY());
                    //view.setY(-view.getY());
                    view.setX(moveDist);
                    System.out.printf("%f", view.getY());
                }
                buttonPos ++;
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
        //TextView textBox = (TextView) findViewById(R.id.textview);
        //textBox.setText(textBox.getText() == "Hello World" ? "Christian Russell"
        //        : "Hello World"
        //);
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
