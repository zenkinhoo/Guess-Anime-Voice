package com.example.guessanimevoice;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Sasuke extends AppCompatActivity {

    ImageView playChidori;
    ImageView playNagashi;
    ImageView playAmaterasu;
    ImageView playTaka;
    ImageView playRinnegan;
    ImageView playShishi;
    ImageView playHousenka;
    ImageView playFireball;
    ImageView backButton;
    boolean pause= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sasuke);


        //inicijalizacija imageviewova
        playChidori=findViewById(R.id.playChidori);
        playAmaterasu=findViewById(R.id.playAmaterasu);
        playNagashi=findViewById(R.id.playNagashi);
        playTaka=findViewById(R.id.playTaka);
        playRinnegan=findViewById(R.id.playRinnegan);
        playShishi=findViewById(R.id.playShishi);
        playHousenka=findViewById(R.id.playHousenka);
        playFireball=findViewById(R.id.playFireball);
        backButton = findViewById(R.id.back);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");
        //kreiranje media playera
        final MediaPlayer chidoriSound = MediaPlayer.create(this,R.raw.sasuke_chidori);
        final MediaPlayer nagashiiSound = MediaPlayer.create(this,R.raw.chidori_nagashi);
        final MediaPlayer takaSound = MediaPlayer.create(this,R.raw.sasuke_taka);
        final MediaPlayer amaterasuSound = MediaPlayer.create(this,R.raw.sasuke_amateratsu);
        final MediaPlayer rinneganSound = MediaPlayer.create(this,R.raw.sasuke_rinnegan);
        final MediaPlayer shishiSound = MediaPlayer.create(this,R.raw.sasuke_shishi_renden);
        final MediaPlayer housenkaSound = MediaPlayer.create(this,R.raw.sasuke_housenka);
        final MediaPlayer fireballSound = MediaPlayer.create(this,R.raw.sasuke_goukakyu);


        //pustanje zvukova
        playChidori.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //kada se zvuk zavrsi ikonica se vraca na play
                chidoriSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playChidori.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    chidoriSound.start();
                    playChidori.setImageResource(R.drawable.pause); //zamena ikonica
                    playChidori.setMaxWidth(120);
                    playChidori.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    chidoriSound.pause();
                    playChidori.setImageResource(R.drawable.play);
                    pause=false;
                }


            }
        });
        playNagashi.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //kada se zvuk zavrsi ikonica se vraca na play
                nagashiiSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playNagashi.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    nagashiiSound.start();
                    playNagashi.setImageResource(R.drawable.pause); //zamena ikonica
                    playNagashi.setMaxWidth(120);
                    playNagashi.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    nagashiiSound.pause();
                    playNagashi.setImageResource(R.drawable.play);
                    pause=false;
                }


            }
        });
        playAmaterasu.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //kada se zvuk zavrsi ikonica se vraca na play
                amaterasuSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playAmaterasu.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    amaterasuSound.start();
                    playAmaterasu.setImageResource(R.drawable.pause); //zamena ikonica
                    playAmaterasu.setMaxWidth(120);
                    playAmaterasu.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    amaterasuSound.pause();
                    playAmaterasu.setImageResource(R.drawable.play);
                    pause=false;
                }


            }
        });
        playTaka.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //kada se zvuk zavrsi ikonica se vraca na play
                takaSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTaka.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    takaSound.start();
                    playTaka.setImageResource(R.drawable.pause); //zamena ikonica
                    playTaka.setMaxWidth(120);
                    playTaka.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    takaSound.pause();
                    playTaka.setImageResource(R.drawable.play);
                    pause=false;
                }


            }
        });
        playRinnegan.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //kada se zvuk zavrsi ikonica se vraca na play
                rinneganSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playRinnegan.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    rinneganSound.start();
                    playRinnegan.setImageResource(R.drawable.pause); //zamena ikonica
                    playRinnegan.setMaxWidth(120);
                    playRinnegan.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    rinneganSound.pause();
                    playRinnegan.setImageResource(R.drawable.play);
                    pause=false;
                }


            }
        });

        playShishi.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //kada se zvuk zavrsi ikonica se vraca na play
                shishiSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playShishi.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    shishiSound.start();
                    playShishi.setImageResource(R.drawable.pause); //zamena ikonica
                    playShishi.setMaxWidth(120);
                    playShishi.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    shishiSound.pause();
                    playShishi.setImageResource(R.drawable.play);
                    pause=false;
                }


            }
        });
        playHousenka.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //kada se zvuk zavrsi ikonica se vraca na play
                housenkaSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playHousenka.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    housenkaSound.start();
                    playHousenka.setImageResource(R.drawable.pause); //zamena ikonica
                    playHousenka.setMaxWidth(120);
                    playHousenka.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    housenkaSound.pause();
                    playHousenka.setImageResource(R.drawable.play);
                    pause=false;
                }


            }
        });
        playFireball.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //kada se zvuk zavrsi ikonica se vraca na play
                fireballSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playFireball.setImageResource(R.drawable.play);
                        pause=false;
                    }
                });

                if(!pause) //nije dozvoljena pauza pa moze play
                {
                    fireballSound.start();
                    playFireball.setImageResource(R.drawable.pause); //zamena ikonica
                    playFireball.setMaxWidth(120);
                    playFireball.setMaxHeight(120);
                    pause=true;
                }
                else if(pause) //pauziranje
                {
                    fireballSound.pause();
                    playFireball.setImageResource(R.drawable.play);
                    pause=false;
                }


            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                nagashiiSound.release();
                chidoriSound.release();
                amaterasuSound.release();
                takaSound.release();
                rinneganSound.release();
                fireballSound.release();
                housenkaSound.release();
                shishiSound.release();
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
