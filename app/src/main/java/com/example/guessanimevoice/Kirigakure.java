package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Kirigakure extends AppCompatActivity {

    ImageView playGengetsu1;
    ImageView playYagura1;
    ImageView playMei1;
    ImageView playZabuza1;
    ImageView playHaku1;
    ImageView playAo1;
    ImageView backButton;

    boolean pause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kirigakure);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playGengetsu1 = findViewById(R.id.playGengetsu1);
        playYagura1 = findViewById(R.id.playYagura1);
        playMei1 = findViewById(R.id.playMei1);
        playZabuza1 = findViewById(R.id.playZabuza1);
        playHaku1 = findViewById(R.id.playHaku1);
        playAo1 = findViewById(R.id.playAo1);
        backButton = findViewById(R.id.back);

        final MediaPlayer soundGengetsu1 = MediaPlayer.create(this,R.raw.gengetsu);
        final MediaPlayer soundYagura1 = MediaPlayer.create(this,R.raw.yagura1);
        final MediaPlayer soundMei1 = MediaPlayer.create(this,R.raw.mei1);
        final MediaPlayer soundZabuza1 = MediaPlayer.create(this,R.raw.zabuza1);
        final MediaPlayer soundHaku1 = MediaPlayer.create(this,R.raw.haku1);
        final MediaPlayer soundAo1 = MediaPlayer.create(this,R.raw.ao1);

        playGengetsu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundGengetsu1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playGengetsu1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playGengetsu1,soundGengetsu1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playGengetsu1,soundGengetsu1);
                    pause=false;
                }
            }
        });
        playYagura1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundYagura1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playYagura1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playYagura1,soundYagura1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playYagura1,soundYagura1);
                    pause=false;
                }
            }
        });
        playMei1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMei1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playMei1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playMei1,soundMei1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playMei1,soundMei1);
                    pause=false;
                }
            }
        });
        playZabuza1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundZabuza1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playZabuza1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playZabuza1,soundZabuza1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playZabuza1,soundZabuza1);
                    pause=false;
                }
            }
        });
        playHaku1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundHaku1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playHaku1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playHaku1,soundHaku1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playHaku1,soundHaku1);
                    pause=false;
                }
            }
        });
        playAo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundAo1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playAo1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playAo1,soundAo1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playAo1,soundAo1);
                    pause=false;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                soundAo1.release();
                soundZabuza1.release();
                soundMei1.release();
                soundYagura1.release();
                soundGengetsu1.release();
                soundHaku1.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });
    }
}
