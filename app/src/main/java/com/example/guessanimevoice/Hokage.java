package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Hokage extends AppCompatActivity {

    ImageView playHashirama1;
    ImageView playHashirama2;
    ImageView playSarutobi1;
    ImageView playSarutobi2;
    ImageView playMinato1;
    ImageView playMinato2;
    ImageView playTobirama1;
    ImageView playTobirama2;
    ImageView playTobirama3;
    ImageView playTsunade1;
    ImageView backButton;

    boolean pause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hokage);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playHashirama1 = findViewById(R.id.playHashirama1);
        playHashirama2 = findViewById(R.id.playHashirama2);
        playSarutobi1 = findViewById(R.id.playSarutobi1);
        playSarutobi2 = findViewById(R.id.playSarutobi2);
        playMinato1 = findViewById(R.id.playMinato1);
        playMinato2 = findViewById(R.id.playMinato2);

        playTobirama1 = findViewById(R.id.playTobirama1);
        playTobirama2 = findViewById(R.id.playTobirama2);
        playTobirama3 = findViewById(R.id.playTobirama3);
        playTsunade1 = findViewById(R.id.playTsunade1);
        backButton = findViewById(R.id.back);

        final MediaPlayer hashirama1Sound = MediaPlayer.create(this,R.raw.hashirama1);
        final MediaPlayer hashirama2Sound = MediaPlayer.create(this,R.raw.hashirama2);
        final MediaPlayer sarutobi1Sound = MediaPlayer.create(this,R.raw.sarutobi1);
        final MediaPlayer sarutobi2Sound = MediaPlayer.create(this,R.raw.sarutobi2);
        final MediaPlayer minato1Sound = MediaPlayer.create(this,R.raw.minato1);
        final MediaPlayer minato2Sound = MediaPlayer.create(this,R.raw.minato2);
        final MediaPlayer tobirama1Sound = MediaPlayer.create(this,R.raw.tobirama1);
        final MediaPlayer tobirama2Sound = MediaPlayer.create(this,R.raw.tobirama2);
        final MediaPlayer tobirama3Sound = MediaPlayer.create(this,R.raw.tobirama3);
        final MediaPlayer tsunade1Sound = MediaPlayer.create(this,R.raw.tsunade1);

        playHashirama1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hashirama1Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playHashirama1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playHashirama1,hashirama1Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playHashirama1,hashirama1Sound);
                    pause=false;
                }
            }
        });
        playHashirama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hashirama2Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playHashirama2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playHashirama2,hashirama2Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playHashirama2,hashirama2Sound);
                    pause=false;
                }
            }
        });
        playSarutobi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sarutobi1Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSarutobi1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSarutobi1,sarutobi1Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSarutobi1,sarutobi1Sound);
                    pause=false;
                }
            }
        });
        playSarutobi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sarutobi2Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSarutobi2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSarutobi2,sarutobi2Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSarutobi2,sarutobi2Sound);
                    pause=false;
                }
            }
        });
        playMinato1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minato1Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playMinato1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playMinato1,minato1Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playMinato1,minato1Sound);
                    pause=false;
                }
            }
        });
        playMinato2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minato2Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playMinato2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playMinato2,minato2Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playMinato2,minato2Sound);
                    pause=false;
                }
            }
        });
        playTobirama1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tobirama1Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTobirama1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playTobirama1,tobirama1Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playTobirama1,tobirama1Sound);
                    pause=false;
                }
            }
        });
        playTobirama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tobirama2Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTobirama2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playTobirama2,tobirama2Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playTobirama2,tobirama2Sound);
                    pause=false;
                }
            }
        });
        playTobirama3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tobirama3Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTobirama3.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playTobirama3,tobirama3Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playTobirama3,tobirama3Sound);
                    pause=false;
                }
            }
        });
        playTsunade1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tsunade1Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTsunade1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playTsunade1,tsunade1Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playTsunade1,tsunade1Sound);
                    pause=false;
                }
            }
        });


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                hashirama1Sound.release();
                hashirama2Sound.release();
                tsunade1Sound.release();
                tobirama1Sound.release();
                tobirama2Sound.release();
                tobirama3Sound.release();
                minato2Sound.release();
                minato1Sound.release();
                sarutobi1Sound.release();
                sarutobi2Sound.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });
    }
}
