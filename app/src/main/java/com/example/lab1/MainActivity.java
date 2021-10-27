package com.example.lab1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SoundPool.OnLoadCompleteListener{


    private Button Night, Evening, Day, Morning, Prince, Planet, Rose, Volcano, Breakfast;
    private ImageView imgDay, imgMorning, imgNight, imgEvening;
    private ConstraintLayout layoutMorning;
    private ConstraintLayout layoutDay;
    private ConstraintLayout layoutEvening;
    private ConstraintLayout layoutNight;
    private int Time = 1;
    private SoundPool mSoundPool;
    private int mClapSound;

    @SuppressWarnings("deprecation")
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
        layoutDay = (ConstraintLayout) findViewById(R.id.layoutDay);
        layoutEvening = (ConstraintLayout) findViewById(R.id.layoutEvening);
        layoutNight = (ConstraintLayout) findViewById(R.id.layoutNight);

        Prince = findViewById(R.id.Prince);
        Planet = findViewById(R.id.Planet);
        Rose = findViewById(R.id.Rose);
        Volcano = findViewById(R.id.Volcano);
        Breakfast = findViewById(R.id.Breakfast);

        mSoundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        mSoundPool.setOnLoadCompleteListener(this);

        mClapSound = mSoundPool.load(this, R.raw.knock, 1);

        Morning.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.VISIBLE);
                layoutDay.setVisibility(View.INVISIBLE);
                layoutEvening.setVisibility(View.INVISIBLE);
                layoutNight.setVisibility(View.INVISIBLE);

                Time = 1;

                mSoundPool.play(mClapSound, 1,1,0,0,1);

//                NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//                String id = "my_channel_01";


                CharSequence name = getString(R.string.channel_name);
                String description = getString(R.string.channel_description);
                int importance = NotificationManager.IMPORTANCE_LOW;
//                NotificationChannel mChannel = new NotificationChannel(id, name,importance);
//                mChannel.setDescription(description);

//                mNotificationManager.createNotificationChannel(mChannel);
//
//                mNotificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
//
//
//                String CHANNEL_ID = "my_channel_01";
//                Notification notification = new Notification.Builder(MainActivity.this)
//                        .setContentTitle("Утро")
//                        .setContentText("Привести в порядок свою планету")
//                        .setSmallIcon(R.drawable.clean)
//                        .setChannelId(CHANNEL_ID)
//                        .build();
//                mNotificationManager.notify(1, notification);
            }
        });

        Day.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.INVISIBLE);
                layoutDay.setVisibility(View.VISIBLE);
                layoutEvening.setVisibility(View.INVISIBLE);
                layoutNight.setVisibility(View.INVISIBLE);

                Time = 2;

                mSoundPool.play(mClapSound, 1,1,0,0,1);

                //NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                String id = "my_channel_01";
                CharSequence name = getString(R.string.channel_name);
                String description = getString(R.string.channel_description);
                int importance = NotificationManager.IMPORTANCE_LOW;
                //NotificationChannel mChannel = new NotificationChannel(id, name,importance);
                //mChannel.setDescription(description);

                //mNotificationManager.createNotificationChannel(mChannel);

                //mNotificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);


                String CHANNEL_ID = "my_channel_01";
                //Notification notification = new Notification.Builder(MainActivity.this)
                        //.setContentTitle("День")
                        //.setContentText("Полить розу")
                        //.setSmallIcon(R.drawable.rose)
                        //.setChannelId(CHANNEL_ID)
                        //.build();
                //mNotificationManager.notify(2, notification);
            }
        });

        Evening.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.INVISIBLE);
                layoutDay.setVisibility(View.INVISIBLE);
                layoutEvening.setVisibility(View.VISIBLE);
                layoutNight.setVisibility(View.INVISIBLE);

                Time = 3;

                mSoundPool.play(mClapSound, 1,1,0,0,1);

                //NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                String id = "my_channel_01";
                CharSequence name = getString(R.string.channel_name);
                String description = getString(R.string.channel_description);
                int importance = NotificationManager.IMPORTANCE_LOW;
                //NotificationChannel mChannel = new NotificationChannel(id, name,importance);
                //mChannel.setDescription(description);

                //mNotificationManager.createNotificationChannel(mChannel);

                //mNotificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);


                String CHANNEL_ID = "my_channel_01";
                //Notification notification = new Notification.Builder(MainActivity.this)
//                        .setContentTitle("Вечер")
//                        .setContentText("Укрыть розу ширмой")
//                        .setSmallIcon(R.drawable.cover)
//                        .setChannelId(CHANNEL_ID)
//                        .build();
                //mNotificationManager.notify(3, notification);
            }
        });

        Night.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                layoutMorning.setVisibility(View.INVISIBLE);
                layoutDay.setVisibility(View.INVISIBLE);
                layoutEvening.setVisibility(View.INVISIBLE);
                layoutNight.setVisibility(View.VISIBLE);

                Time = 4;

                mSoundPool.play(mClapSound, 1,1,0,0,1);

//                NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                String id = "my_channel_01";
                CharSequence name = getString(R.string.channel_name);
                String description = getString(R.string.channel_description);
                int importance = NotificationManager.IMPORTANCE_LOW;
//                NotificationChannel mChannel = new NotificationChannel(id, name,importance);
//                mChannel.setDescription(description);
//
//                mNotificationManager.createNotificationChannel(mChannel);
//
//                mNotificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
//
//
//                String CHANNEL_ID = "my_channel_01";
//                Notification notification = new Notification.Builder(MainActivity.this)
//                        .setContentTitle("Ночь")
//                        .setContentText("Любоваться закатом")
//                        .setSmallIcon(R.drawable.sun)
//                        .setChannelId(CHANNEL_ID)
//                        .build();
//                mNotificationManager.notify(4, notification);
            }
        });

        Prince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mClapSound, 1,1,0,0,1);
                if (Time == 1){
                    Toast.makeText(MainActivity.this, "Маленький принц", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Маленький принц со своей розой", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
        Planet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mClapSound, 1,1,0,0,1);
                Toast.makeText(MainActivity.this, "Астероид Б-612. Планета на которой живет Маленький принц", Toast.LENGTH_SHORT).show();
            }
        });

        Rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mClapSound, 1,1,0,0,1);
                if (Time == 1){
                    Toast.makeText(MainActivity.this, "Роза. Ее нужно поливать, а на ночь укрывать ширмой и колпаком", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Ростки баобабов. Их нужно убирать каждое утро", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mClapSound, 1,1,0,0,1);
                if (Time == 1){
                    Toast.makeText(MainActivity.this, "Действующий вулкан. На нем удобно разогревать завтрак", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Потухший вулкан. О нем тоже нужно заботиться", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Volcano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mClapSound, 1,1,0,0,1);
                if (Time == 1){
                    Toast.makeText(MainActivity.this, "Потухший вулкан. О нем тоже нужно заботиться", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Действующий вулкан. На нем удобно разогревать завтрак", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onLoadComplete(SoundPool soundPool, int sampled, int status){

    }
}