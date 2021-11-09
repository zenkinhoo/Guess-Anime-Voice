package com.example.guessanimevoice;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.widget.SliderPanel;

public class Naruto extends AppCompatActivity {

    ImageView playKageBunshin;
    ImageView playRasengan;
    ImageView playKuchiyose;
    ImageView playRasenshuriken;
    ImageView playSexy;
    ImageView backButton;
    ImageView playVisak;
    boolean pause = false;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naruto);



        //postavljanje naslova menija
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        // inicijalizacija imageviewova
        playKageBunshin = findViewById(R.id.playKageBunshin);
        playRasengan = findViewById(R.id.playRasengan);
        playKuchiyose = findViewById(R.id.playKuchiyose);
        playRasenshuriken = findViewById(R.id.playRasenshuriken);
        playSexy = findViewById(R.id.playSexy);
        playVisak = findViewById(R.id.playVisak);
        backButton = findViewById(R.id.back);

        playVisak.setVisibility(View.INVISIBLE);

        //kreiramo zvuk
        final MediaPlayer kageBunshinSound = MediaPlayer.create(this,R.raw.naruto_shadow_clones);
        final MediaPlayer rasenganSound = MediaPlayer.create(this,R.raw.rasengan);
        final MediaPlayer kuchiyoseSound = MediaPlayer.create(this,R.raw.kuchiyose);
        final MediaPlayer rasenshurikenSound = MediaPlayer.create(this,R.raw.rasen_shuriken);
        final MediaPlayer sexySound = MediaPlayer.create(this,R.raw.sexy);

        //pustamo zvukove klikovima na dugme
        playKageBunshin.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //kada se zvuk zavrsi ikonica se vraca na play
                kageBunshinSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKageBunshin.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    kageBunshinSound.start();
                    playKageBunshin.setImageResource(R.drawable.pause); //zamena ikonica
                    playKageBunshin.setMaxWidth(120);
                    playKageBunshin.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    kageBunshinSound.pause();
                    playKageBunshin.setImageResource(R.drawable.play);
                    pause=false;
                }


            }
        });
        playRasengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //kada se zvuk zavrsi ikonica se vraca na play
                rasenganSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playRasengan.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    rasenganSound.start();
                    playRasengan.setImageResource(R.drawable.pause); //zamena ikonica
                    playRasengan.setMaxWidth(120);
                    playRasengan.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    rasenganSound.pause();
                    playRasengan.setImageResource(R.drawable.play);
                    pause=false;
                }
            }
        });
        playKuchiyose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               kuchiyoseSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKuchiyose.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    kuchiyoseSound.start();
                    playKuchiyose.setImageResource(R.drawable.pause); //zamena ikonica
                    playKuchiyose.setMaxWidth(120);
                    playKuchiyose.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    kuchiyoseSound.pause();
                    playKuchiyose.setImageResource(R.drawable.play);
                    pause=false;
                }
            }
        });
        playRasenshuriken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rasenshurikenSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playRasenshuriken.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    rasenshurikenSound.start();
                    playRasenshuriken.setImageResource(R.drawable.pause); //zamena ikonica
                    playRasenshuriken.setMaxWidth(120);
                    playRasenshuriken.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    rasenshurikenSound.pause();
                    playRasenshuriken.setImageResource(R.drawable.play);
                    pause=false;
                }
            }
        });
        playSexy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sexySound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSexy.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    sexySound.start();
                    playSexy.setImageResource(R.drawable.pause); //zamena ikonica
                    playSexy.setMaxWidth(120);
                    playSexy.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    sexySound.pause();
                    playSexy.setImageResource(R.drawable.play);
                    pause=false;
                }
            }
            });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                kageBunshinSound.release();
                rasenganSound.release();
                kuchiyoseSound.release();
                sexySound.release();
                rasenshurikenSound.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });
    }



    //metode za upravljanje menijem
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
