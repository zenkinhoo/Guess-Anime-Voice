package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Kumogakure extends AppCompatActivity {

    ImageView playRaikage1;
    ImageView playBee1;
    ImageView playDarui1;
    ImageView playShee1;
    ImageView playOmoi1;
    ImageView playDouble;
    ImageView backButton;

    boolean pause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumogakure);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playRaikage1 = findViewById(R.id.playA1);
        playBee1 = findViewById(R.id.playBee1);
        playDarui1 = findViewById(R.id.playDarui1);
        playShee1 = findViewById(R.id.playShee1);
        playOmoi1 = findViewById(R.id.playOmoi1);
        playDouble = findViewById(R.id.playDouble);
        backButton = findViewById(R.id.back);

        final MediaPlayer soundRaikage1 = MediaPlayer.create(this,R.raw.raikage1);
        final MediaPlayer soundBee1 = MediaPlayer.create(this,R.raw.bee1);
        final MediaPlayer soundDarui1 = MediaPlayer.create(this,R.raw.darui1);
        final MediaPlayer soundShee1 = MediaPlayer.create(this,R.raw.shee1);
        final MediaPlayer soundOmoi1 = MediaPlayer.create(this,R.raw.omoi1);
        final MediaPlayer soundDouble = MediaPlayer.create(this,R.raw.double_lariat);

        playRaikage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundRaikage1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playRaikage1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playRaikage1,soundRaikage1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playRaikage1,soundRaikage1);
                    pause=false;
                }
            }
        });
        playBee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundBee1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playBee1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playBee1,soundBee1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playBee1,soundBee1);
                    pause=false;
                }
            }
        });
        playDarui1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundDarui1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playDarui1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playDarui1,soundDarui1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playDarui1,soundDarui1);
                    pause=false;
                }
            }
        });
        playShee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundShee1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playShee1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playShee1,soundShee1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playShee1,soundShee1);
                    pause=false;
                }
            }
        });
        playOmoi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundOmoi1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playOmoi1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playOmoi1,soundOmoi1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playOmoi1,soundOmoi1);
                    pause=false;
                }
            }
        });
        playDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundDouble.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playDouble.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playDouble,soundDouble);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playDouble,soundDouble);
                    pause=false;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                soundDarui1.release();
                soundShee1.release();
                soundRaikage1.release();
                soundBee1.release();
                soundOmoi1.release();
                soundDouble.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });


    }
}
