package com.example.lab1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


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
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.VISIBLE);
                imgDay.setVisibility(View.INVISIBLE);
                imgEvening.setVisibility(View.INVISIBLE);
                imgNight.setVisibility(View.INVISIBLE);

                NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                String id = "my_channel_01";


                CharSequence name = getString(R.string.channel_name);
                String description = getString(R.string.channel_description);
                int importance = NotificationManager.IMPORTANCE_LOW;
                NotificationChannel mChannel = new NotificationChannel(id, name,importance);
                mChannel.setDescription(description);

                mNotificationManager.createNotificationChannel(mChannel);

                mNotificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);


                String CHANNEL_ID = "my_channel_01";
                Notification notification = new Notification.Builder(MainActivity.this)
                        .setContentTitle("")
                        .setContentText("")
                        .setSmallIcon(R.drawable.clean)
                        .setChannelId(CHANNEL_ID)
                        .build();
                mNotificationManager.notify(1, notification);


//                Resources res = MainActivity.this.getResources();
//                NotificationCompat.Builder mBuilder =
//                        (NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.this)
//                                .setSmallIcon(R.drawable.clean)
//                                .setContentTitle("Колоколец")
//                                .setContentText("Колоколец звонит")
//                                .setAutoCancel(true)
//                                .setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.clean))
//                                .setPriority(NotificationCompat.PRIORITY_HIGH)
//                                .setChannelId(CHANNEL_ID)
//                        ;
//
//                Intent resultIntent = new Intent(MainActivity.this, MainActivity.class);
//
//                android.app.TaskStackBuilder stackBuilder = TaskStackBuilder.create(MainActivity.this);
//                stackBuilder.addParentStack(MainActivity.class);
//                stackBuilder.addNextIntent(resultIntent);

//                PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
//                mBuilder.setContentIntent(resultPendingIntent);
            }
        });

        Day.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.INVISIBLE);
                imgDay.setVisibility(View.VISIBLE);
                imgEvening.setVisibility(View.INVISIBLE);
                imgNight.setVisibility(View.INVISIBLE);

                NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                String id = "my_channel_01";
                CharSequence name = getString(R.string.channel_name);
                String description = getString(R.string.channel_description);
                int importance = NotificationManager.IMPORTANCE_LOW;
                NotificationChannel mChannel = new NotificationChannel(id, name,importance);
                mChannel.setDescription(description);

                mNotificationManager.createNotificationChannel(mChannel);

                mNotificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);


                String CHANNEL_ID = "my_channel_01";
                Notification notification = new Notification.Builder(MainActivity.this)
                        .setContentTitle("")
                        .setContentText("")
                        .setSmallIcon(R.drawable.clean)
                        .setChannelId(CHANNEL_ID)
                        .build();
                mNotificationManager.notify(1, notification);
            }
        });

        Evening.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.INVISIBLE);
                imgDay.setVisibility(View.INVISIBLE);
                imgEvening.setVisibility(View.VISIBLE);
                imgNight.setVisibility(View.INVISIBLE);

                NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                String id = "my_channel_01";
                CharSequence name = getString(R.string.channel_name);
                String description = getString(R.string.channel_description);
                int importance = NotificationManager.IMPORTANCE_LOW;
                NotificationChannel mChannel = new NotificationChannel(id, name,importance);
                mChannel.setDescription(description);

                mNotificationManager.createNotificationChannel(mChannel);

                mNotificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);


                String CHANNEL_ID = "my_channel_01";
                Notification notification = new Notification.Builder(MainActivity.this)
                        .setContentTitle("")
                        .setContentText("")
                        .setSmallIcon(R.drawable.clean)
                        .setChannelId(CHANNEL_ID)
                        .build();
                mNotificationManager.notify(1, notification);
            }
        });

        Night.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.INVISIBLE);
                imgDay.setVisibility(View.INVISIBLE);
                imgEvening.setVisibility(View.INVISIBLE);
                imgNight.setVisibility(View.VISIBLE);

                NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                String id = "my_channel_01";
                CharSequence name = getString(R.string.channel_name);
                String description = getString(R.string.channel_description);
                int importance = NotificationManager.IMPORTANCE_LOW;
                NotificationChannel mChannel = new NotificationChannel(id, name,importance);
                mChannel.setDescription(description);

                mNotificationManager.createNotificationChannel(mChannel);

                mNotificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);


                String CHANNEL_ID = "my_channel_01";
                Notification notification = new Notification.Builder(MainActivity.this)
                        .setContentTitle("")
                        .setContentText("")
                        .setSmallIcon(R.drawable.clean)
                        .setChannelId(CHANNEL_ID)
                        .build();
                mNotificationManager.notify(1, notification);
            }
        });
    }

}