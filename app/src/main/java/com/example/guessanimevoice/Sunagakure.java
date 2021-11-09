package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Sunagakure extends AppCompatActivity {
    ImageView playGaara1;
    ImageView playGaara2;
    ImageView playGaara3;
    ImageView playGaara4;
    ImageView playTemari1;
    ImageView playTemari2;
    ImageView playKankuro1;
    ImageView playThird;
    ImageView backButton;

    boolean pause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunagakure);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playGaara1 = findViewById(R.id.playGaara1);
        playGaara2 = findViewById(R.id.playGaara2);
        playGaara3 = findViewById(R.id.playGaara3);
        playGaara4 = findViewById(R.id.playGaara4);
        playTemari1 = findViewById(R.id.playTemari1);
        playTemari2 = findViewById(R.id.playTemari2);
        playKankuro1 = findViewById(R.id.playKankuro1);
        playThird = findViewById(R.id.playThird);
        backButton = findViewById(R.id.back);


        final MediaPlayer gaara1Sound = MediaPlayer.create(this,R.raw.gaara1);
        final MediaPlayer gaara2Sound = MediaPlayer.create(this,R.raw.gaara2);
        final MediaPlayer gaara3Sound = MediaPlayer.create(this,R.raw.gaara3);
        final MediaPlayer gaara4Sound = MediaPlayer.create(this,R.raw.gaara4);
        final MediaPlayer temari1Sound = MediaPlayer.create(this,R.raw.temari1);
        final MediaPlayer temari2Sound = MediaPlayer.create(this,R.raw.temari2);
        final MediaPlayer kankuro1Sound = MediaPlayer.create(this,R.raw.kankuro1);
        final MediaPlayer third1Sound = MediaPlayer.create(this,R.raw.third_kazekage1);

        playGaara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gaara1Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playGaara1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playGaara1,gaara1Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playGaara1,gaara1Sound);
                    pause=false;
                }

            }
        });
        playGaara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gaara2Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playGaara2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playGaara2,gaara2Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playGaara2,gaara2Sound);
                    pause=false;
                }

            }
        });
        playGaara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gaara3Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playGaara3.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playGaara3,gaara3Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playGaara3,gaara3Sound);
                    pause=false;
                }

            }
        });
        playGaara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gaara4Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playGaara4.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playGaara4,gaara4Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playGaara4,gaara4Sound);
                    pause=false;
                }

            }
        });
        playTemari1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temari1Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTemari1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playTemari1,temari1Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playTemari1,temari1Sound);
                    pause=false;
                }

            }
        });
        playTemari2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temari2Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTemari2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playTemari2,temari2Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playTemari2,temari2Sound);
                    pause=false;
                }

            }
        });
        playKankuro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kankuro1Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKankuro1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKankuro1,kankuro1Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKankuro1,kankuro1Sound);
                    pause=false;
                }

            }
        });
        playThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                third1Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playThird.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playThird,third1Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playThird,third1Sound);
                    pause=false;
                }

            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                gaara1Sound.release();
                gaara2Sound.release();
                gaara3Sound.release();
                third1Sound.release();
                gaara4Sound.release();
                temari1Sound.release();
                temari2Sound.release();
                kankuro1Sound.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });
    }
}
