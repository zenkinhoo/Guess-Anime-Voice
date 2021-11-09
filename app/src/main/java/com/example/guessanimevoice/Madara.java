package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Madara extends AppCompatActivity {

    ImageView playMekkyaku;
    ImageView playLimbo;
    ImageView playMesshitsu;
    ImageView playMokuton;
    ImageView playAsh;
    ImageView playSecond;
    ImageView playSenpo;
    ImageView playChibaku;
    ImageView backButton;

    boolean pause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madara);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playMekkyaku = findViewById(R.id.playMekkyaku);
        playMesshitsu = findViewById(R.id.playMesshitsu);
        playAsh = findViewById(R.id.playAsh);
        playLimbo = findViewById(R.id.playLimbo);
        playMokuton = findViewById(R.id.playMadaraMokuton);
        playSecond = findViewById(R.id.playSecond);
        playSenpo = findViewById(R.id.playSenpo);
        playChibaku = findViewById(R.id.playMadaraChibaku);
        backButton = findViewById(R.id.back);

        final MediaPlayer soundMekkyaku = MediaPlayer.create(this,R.raw.gouka_mekkyaku);
        final MediaPlayer soundMesshitsu = MediaPlayer.create(this,R.raw.madara_katon);
        final MediaPlayer soundAsh = MediaPlayer.create(this,R.raw.madara_ash);
        final MediaPlayer soundLimbo = MediaPlayer.create(this,R.raw.limbo);
        final MediaPlayer soundMokuton = MediaPlayer.create(this,R.raw.madara_deepforest);
        final MediaPlayer soundChibaku = MediaPlayer.create(this,R.raw.madara_chibaku);
        final MediaPlayer soundSecond = MediaPlayer.create(this,R.raw.second_one);
        final MediaPlayer soundSenpo = MediaPlayer.create(this,R.raw.madara_senpo);

        playMekkyaku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMekkyaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playMekkyaku.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playMekkyaku,soundMekkyaku);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playMekkyaku,soundMekkyaku);
                    pause=false;
                }
            }
        });
        playMesshitsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMesshitsu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playMesshitsu.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playMesshitsu,soundMesshitsu);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playMesshitsu,soundMesshitsu);
                    pause=false;
                }
            }
        });
        playAsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundAsh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playAsh.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playAsh,soundAsh);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playAsh,soundAsh);
                    pause=false;
                }
            }
        });
        playMokuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMokuton.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playMokuton.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playMokuton,soundMokuton);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playMokuton,soundMokuton);
                    pause=false;
                }
            }
        });
        playLimbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundLimbo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playLimbo.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playLimbo,soundLimbo);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playLimbo,soundLimbo);
                    pause=false;
                }
            }
        });
        playSenpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundSenpo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSenpo.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSenpo,soundSenpo);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSenpo,soundSenpo);
                    pause=false;
                }
            }
        });
        playSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundSecond.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSecond.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSecond,soundSecond);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSecond,soundSecond);
                    pause=false;
                }
            }
        });
        playChibaku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundChibaku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playChibaku.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playChibaku,soundChibaku);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playChibaku,soundChibaku);
                    pause=false;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
               soundMekkyaku.release();
               soundMesshitsu.release();
               soundAsh.release();
               soundLimbo.release();
               soundChibaku.release();
               soundSenpo.release();
               soundSecond.release();
               soundMokuton.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });
    }
}
