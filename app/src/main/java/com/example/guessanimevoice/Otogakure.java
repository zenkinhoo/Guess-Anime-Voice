package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Otogakure extends AppCompatActivity {

    ImageView playOrochimaru1;
    ImageView playOrochimaru2;
    ImageView playKabuto1;
    ImageView playKabuto2;
    ImageView playSakon1;
    ImageView backButton;

    boolean pause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otogakure);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playOrochimaru1 = findViewById(R.id.playOrochimaru1);
        playOrochimaru2 = findViewById(R.id.playOrochimaru2);
        playKabuto1 = findViewById(R.id.playKabuto1);
        playKabuto2 = findViewById(R.id.playKabuto2);
        playSakon1 = findViewById(R.id.playSakon1);
        backButton = findViewById(R.id.back);

        final MediaPlayer soundOrochimaru1= MediaPlayer.create(this,R.raw.orochimaru1);
        final MediaPlayer soundOrochimaru2= MediaPlayer.create(this,R.raw.orochimaru2);
        final MediaPlayer soundKabuto1= MediaPlayer.create(this,R.raw.kabuto1);
        final MediaPlayer soundKabuto2= MediaPlayer.create(this,R.raw.kabuto2);
        final MediaPlayer soundSakon1= MediaPlayer.create(this,R.raw.sakon1);

        playOrochimaru1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundOrochimaru1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playOrochimaru1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playOrochimaru1,soundOrochimaru1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playOrochimaru1,soundOrochimaru1);
                    pause=false;
                }
            }
        });
        playOrochimaru2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundOrochimaru2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playOrochimaru2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playOrochimaru2,soundOrochimaru2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playOrochimaru2,soundOrochimaru2);
                    pause=false;
                }
            }
        });
        playKabuto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKabuto1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKabuto1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKabuto1,soundKabuto1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKabuto1,soundKabuto1);
                    pause=false;
                }
            }
        });
        playKabuto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKabuto2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKabuto2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKabuto2,soundKabuto2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKabuto2,soundKabuto2);
                    pause=false;
                }
            }
        });
        playSakon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundSakon1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSakon1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSakon1,soundSakon1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSakon1,soundSakon1);
                    pause=false;
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
               soundOrochimaru1.release();
               soundOrochimaru2.release();
               soundKabuto1.release();
               soundKabuto2.release();
               soundSakon1.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });

    }
}
