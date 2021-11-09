package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Iwagakure extends AppCompatActivity {

    ImageView playOnoki1;
    ImageView playOnoki2;
    ImageView playOnoki3;
    ImageView playJinton;
    ImageView playKitsuchi1;
    ImageView playKurotsuchi1;
    ImageView backButton;

    boolean pause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iwagakure);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playOnoki1 = findViewById(R.id.playOnoki1);
        playOnoki2 = findViewById(R.id.playOnoki2);
        playOnoki3 = findViewById(R.id.playOnoki3);
        playJinton = findViewById(R.id.playJinton);
        playKurotsuchi1 = findViewById(R.id.playKurotsuchi);
        playKitsuchi1 = findViewById(R.id.playKitsuchi);
        backButton = findViewById(R.id.back);

        final MediaPlayer soundOnoki1 = MediaPlayer.create(this,R.raw.onoki1);
        final MediaPlayer soundOnoki2 = MediaPlayer.create(this,R.raw.onoki2);
        final MediaPlayer soundOnoki3 = MediaPlayer.create(this,R.raw.jinton2);
        final MediaPlayer soundJinton = MediaPlayer.create(this,R.raw.jinton1);
        final MediaPlayer soundKurotsuchi1 = MediaPlayer.create(this,R.raw.kurotsutchi1);
        final MediaPlayer soundKitsuchi = MediaPlayer.create(this,R.raw.kitsuchi1);

        playOnoki1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundOnoki1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playOnoki1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playOnoki1,soundOnoki1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playOnoki1,soundOnoki1);
                    pause=false;
                }
            }
        });
        playOnoki2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundOnoki2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playOnoki2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playOnoki2,soundOnoki2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playOnoki2,soundOnoki2);
                    pause=false;
                }
            }
        });
        playOnoki3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundOnoki3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playOnoki3.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playOnoki3,soundOnoki3);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playOnoki3,soundOnoki3);
                    pause=false;
                }
            }
        });
        playKurotsuchi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKurotsuchi1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKurotsuchi1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKurotsuchi1,soundKurotsuchi1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKurotsuchi1,soundKurotsuchi1);
                    pause=false;
                }
            }
        });
        playKitsuchi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKitsuchi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKitsuchi1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKitsuchi1,soundKitsuchi);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKitsuchi1,soundKitsuchi);
                    pause=false;
                }
            }
        });
        playJinton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundJinton.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playJinton.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playJinton,soundJinton);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playJinton,soundJinton);
                    pause=false;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                soundOnoki1.release();
                soundOnoki2.release();
                soundOnoki3.release();
                soundJinton.release();
                soundKitsuchi.release();
                soundKurotsuchi1.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });

    }
}
