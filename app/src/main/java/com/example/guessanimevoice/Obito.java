package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Obito extends AppCompatActivity {

    ImageView playFireball;
    ImageView playRanbu;
    ImageView playSix;
    ImageView playKuchiyose;
    ImageView playMugen;
    ImageView backButton;

    boolean pause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obito);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playFireball = findViewById(R.id.playObitoFireball);
        playRanbu = findViewById(R.id.playRanbu);
        playSix = findViewById(R.id.playSix);
        playKuchiyose = findViewById(R.id.playObitoKuchiyose);
        playMugen = findViewById(R.id.playMugen);
        backButton = findViewById(R.id.back);

        final MediaPlayer soundFireball = MediaPlayer.create(this,R.raw.obito_katon2);
        final MediaPlayer soundRanbu = MediaPlayer.create(this,R.raw.obito_katon1);
        final MediaPlayer soundSix = MediaPlayer.create(this,R.raw.six_crimson);
        final MediaPlayer soundMugen = MediaPlayer.create(this,R.raw.mugen);
        final MediaPlayer soundKuchiyose = MediaPlayer.create(this,R.raw.obito_kyuubi);

        playFireball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundFireball.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playFireball.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playFireball,soundFireball);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playFireball,soundFireball);
                    pause=false;
                }
            }
        });
        playRanbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundRanbu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playRanbu.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playRanbu,soundRanbu);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playRanbu,soundRanbu);
                    pause=false;
                }
            }
        });
        playSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundSix.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSix.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSix,soundSix);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSix,soundSix);
                    pause=false;
                }
            }
        });
        playKuchiyose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKuchiyose.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKuchiyose.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKuchiyose,soundKuchiyose);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKuchiyose,soundKuchiyose);
                    pause=false;
                }
            }
        });
        playMugen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMugen.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playMugen.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playMugen,soundMugen);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playMugen,soundMugen);
                    pause=false;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                soundMugen.release();
                soundSix.release();
                soundFireball.release();
                soundRanbu.release();
                soundKuchiyose.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });



    }
}
