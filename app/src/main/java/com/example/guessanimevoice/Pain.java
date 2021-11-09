package com.example.guessanimevoice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Pain extends AppCompatActivity {

    ImageView playShinra;
    ImageView playBansho;
    ImageView playChibaku;
    ImageView playItami;
    ImageView playRinneTensei;
    ImageView playPainKuchiyose;
    ImageView backButton;

    boolean pause = false;
    //boolean test=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playBansho = findViewById(R.id.playBansho);
        playChibaku = findViewById(R.id.playChibaku);
        playItami = findViewById(R.id.playItami);
        playRinneTensei = findViewById(R.id.playRinneTensei);
        playPainKuchiyose = findViewById(R.id.playPainKuchiyose);
        playShinra = findViewById(R.id.playShinra);
        backButton = findViewById(R.id.back);

        final MediaPlayer banshoSound = MediaPlayer.create(this,R.raw.bansho);
        final MediaPlayer shinraSound = MediaPlayer.create(this,R.raw.shinra_tensei);
        final MediaPlayer chibakuSound = MediaPlayer.create(this,R.raw.chibaku_tensei);
        final MediaPlayer itamiSound = MediaPlayer.create(this,R.raw.know_pain);
        final MediaPlayer painKuchiyoseSound = MediaPlayer.create(this,R.raw.pain_kuchiyose);
        final MediaPlayer rinneTenseiSound = MediaPlayer.create(this,R.raw.gedo_rinne_tensei);

        playBansho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                banshoSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playBansho.setImageResource(R.drawable.play);
                        pause = false;

                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playBansho,banshoSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playBansho,banshoSound);
                    pause=false;
                }

            }
        });
        playShinra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shinraSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playShinra.setImageResource(R.drawable.play);
                        pause = false;

                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playShinra,shinraSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playShinra,shinraSound);
                    pause=false;
                }
            }
        });
        playChibaku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chibakuSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playChibaku.setImageResource(R.drawable.play);
                        pause = false;

                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playChibaku,chibakuSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playChibaku,chibakuSound);
                    pause=false;
                }
            }
        });
        playItami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itamiSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playItami.setImageResource(R.drawable.play);
                        pause = false;

                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playItami,itamiSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playItami,itamiSound);
                    pause=false;
                }
            }
        });
        playPainKuchiyose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                painKuchiyoseSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playPainKuchiyose.setImageResource(R.drawable.play);
                        pause = false;

                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playPainKuchiyose,painKuchiyoseSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playPainKuchiyose,painKuchiyoseSound);
                    pause=false;
                }
            }
        });
        playRinneTensei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rinneTenseiSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playRinneTensei.setImageResource(R.drawable.play);
                        pause = false;

                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playRinneTensei,rinneTenseiSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playRinneTensei,rinneTenseiSound);
                    pause=false;
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
               shinraSound.release();
               banshoSound.release();
               rinneTenseiSound.release();
               painKuchiyoseSound.release();
               itamiSound.release();
               chibakuSound.release();
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
