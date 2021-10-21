package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final int notificationMorning = 1;
    public static final int notificationDay = 2;
    public static final int notificationEvening = 3;
    public static final int notificationNight = 4;

    private Button Night, Evening, Day, Morning;
    private ImageView imgDay, imgMorning, imgNight, imgEvening;
    private ConstraintLayout layoutMorning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Morning = (Button) findViewById(R.id.Morning);
        Day = (Button) findViewById(R.id.Day);
        Evening = (Button) findViewById(R.id.Evening);
        Night = (Button) findViewById(R.id.Night);
        imgDay = (ImageView) findViewById(R.id.imgDay);
        imgMorning = (ImageView) findViewById(R.id.imgMorning);
        imgNight = (ImageView) findViewById(R.id.imgNight);
        imgEvening = (ImageView) findViewById(R.id.imgEvening);
        layoutMorning = (ConstraintLayout) findViewById(R.id.layoutMorning);

        Morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.VISIBLE);
                imgDay.setVisibility(View.INVISIBLE);
                imgEvening.setVisibility(View.INVISIBLE);
                imgNight.setVisibility(View.INVISIBLE);

                NotificationCompat.Builder mBuilder =
                        (NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.this)
                            .setSmallIcon(R.drawable.clean)
                            .setContentTitle("День")
                            .setContentText("Полить розу")
                            .setAutoCancel(true)
                            .setDefaults(NotificationCompat.DEFAULT_ALL)
                            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC);
                Intent resultIntent = new Intent(MainActivity.this, MainActivity.class);
                TaskStackBuilder stackBuilder = TaskStackBuilder.create(MainActivity.this);
                stackBuilder.addParentStack(MainActivity.this);
            }
        });

        Day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.INVISIBLE);
                imgDay.setVisibility(View.VISIBLE);
                imgEvening.setVisibility(View.INVISIBLE);
                imgNight.setVisibility(View.INVISIBLE);
            }
        });

        Evening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.INVISIBLE);
                imgDay.setVisibility(View.INVISIBLE);
                imgEvening.setVisibility(View.VISIBLE);
                imgNight.setVisibility(View.INVISIBLE);
            }
        });

        Night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.INVISIBLE);
                imgDay.setVisibility(View.INVISIBLE);
                imgEvening.setVisibility(View.INVISIBLE);
                imgNight.setVisibility(View.VISIBLE);
            }
        });
    }

}