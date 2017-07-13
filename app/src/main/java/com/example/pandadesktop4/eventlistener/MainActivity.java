package com.example.pandadesktop4.eventlistener;

import android.app.Activity;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
//import android.view.View;
//import android.view.View;
//import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity {
    Button b1;
    private ProgressDialog progress;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

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
                //Toast.makeText(MainActivity.this, "Good Afternoon", Toast.LENGTH_SHORT).show();
                addnotification();
            }


        });
    }

    private void addnotification() {
        android.support.v4.app.NotificationCompat.Builder builder = new NotificationCompat.Builder(this).setSmallIcon(R.drawable.n).setContentTitle("Notification Example").setContentText("This is a test notification");

        Intent i = new Intent(this, MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);


        NotificationManager m = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        m.notify(0, builder.build());


    }

    // b2.setOnClickListener(new View.OnClickListener() {
    //   @Override
    // public void onClick(View view) {
    //   TextView txt = (TextView) findViewById(R.id.textView);
    //
}

