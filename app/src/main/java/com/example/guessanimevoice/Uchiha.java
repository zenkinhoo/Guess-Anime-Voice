package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Uchiha extends AppCompatActivity {

    ImageView playShisui1;
    ImageView playShisui2;
    ImageView playIzuna1;
    ImageView playFugaku1;
    ImageView backButton;

    boolean pause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uchiha);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playShisui1 = findViewById(R.id.playShisui1);
        playShisui2 = findViewById(R.id.playShisui2);
        playIzuna1 = findViewById(R.id.playIzuna1);
        playFugaku1 = findViewById(R.id.playFugaku1);
        backButton = findViewById(R.id.back);


        final MediaPlayer soundShisui1 = MediaPlayer.create(this,R.raw.shisui1);
        final MediaPlayer soundShisui2 = MediaPlayer.create(this,R.raw.shisui2);
        final MediaPlayer soundIzuna1 = MediaPlayer.create(this,R.raw.izuna1);
        final MediaPlayer soundFugaku1 = MediaPlayer.create(this,R.raw.fugaku1);

        playShisui1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundShisui1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playShisui1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playShisui1,soundShisui1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playShisui1,soundShisui1);
                    pause=false;
                }
            }
        });
        playShisui2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundShisui2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playShisui2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playShisui2,soundShisui2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playShisui2,soundShisui2);
                    pause=false;
                }
            }
        });
        playIzuna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundIzuna1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playIzuna1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playIzuna1,soundIzuna1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playIzuna1,soundIzuna1);
                    pause=false;
                }
            }
        });
        playFugaku1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundFugaku1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playFugaku1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playFugaku1,soundFugaku1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playFugaku1,soundFugaku1);
                    pause=false;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                soundFugaku1.release();
                soundShisui1.release();
                soundShisui2.release();
                soundIzuna1.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });
    }
}
