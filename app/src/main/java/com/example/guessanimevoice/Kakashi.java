package com.example.guessanimevoice;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Kakashi extends AppCompatActivity {

    ImageView playKamui;
    ImageView playKakashiKaton;
    ImageView playPakun;
    ImageView playDoton;
    ImageView playSuiton;
    ImageView backButton;

    boolean pause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakashi);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");


         playKamui=findViewById(R.id.playKamui);
         playKakashiKaton=findViewById(R.id.playKakashiKaton);
        playPakun = findViewById(R.id.playPakun);
         playDoton = findViewById(R.id.playMudwall);
        playSuiton = findViewById(R.id.playWaterdragon);
        backButton = findViewById(R.id.back);

        final MediaPlayer kamuiSound = MediaPlayer.create(this,R.raw.kamui);
        final MediaPlayer kakashiKatonSound = MediaPlayer.create(this,R.raw.kakashi_katon);
        final MediaPlayer pakunSound = MediaPlayer.create(this,R.raw.kuchiyose_pakun);
        final MediaPlayer dotonSound = MediaPlayer.create(this,R.raw.mud_wall);
        final MediaPlayer suitonSound = MediaPlayer.create(this,R.raw.suiton_siriudan);


        playKamui.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                kamuiSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKamui.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKamui,kamuiSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKamui,kamuiSound);
                    pause=false;
                }
            }
        });
        playKakashiKaton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                kakashiKatonSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKakashiKaton.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKakashiKaton,kakashiKatonSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKakashiKaton,kakashiKatonSound);
                    pause=false;
                }
            }
        });
        playDoton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                dotonSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playDoton.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playDoton,dotonSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playDoton,dotonSound);
                    pause=false;
                }
            }
        });
        playSuiton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                suitonSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSuiton.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSuiton,suitonSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSuiton,suitonSound);
                    pause=false;
                }
            }
        });
        playPakun.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                pakunSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playPakun.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playPakun,pakunSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playPakun,pakunSound);
                    pause=false;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                kamuiSound.release();
                pakunSound.release();
                kakashiKatonSound.release();
                dotonSound.release();
                suitonSound.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.action_search:
                //logika
                break;
            case R.id.action_quit:

                //System.exit(0);
                break;
            case R.id.action_settings:
                //logika
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }

        return super.onOptionsItemSelected(item);
    }


}
