package com.example.pandadesktop4.eventlistener;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    private ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button) findViewById(R.id.button);
       // b2 = (Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           //     TextView txt = (TextView) findViewById(R.id.textView);
         //       txt.setTextSize(25);
                Toast.makeText(MainActivity.this, "Good Afternoon", Toast.LENGTH_SHORT).show();
            }
        });


       // b2.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {
             //   TextView txt = (TextView) findViewById(R.id.textView);
          //
    }
}
