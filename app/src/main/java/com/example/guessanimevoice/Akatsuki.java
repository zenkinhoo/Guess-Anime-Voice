package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Akatsuki extends AppCompatActivity {

    ImageView playDeidara1;
    ImageView playDeidara2;
    ImageView playHidan1;
    ImageView playHidan2;
    ImageView playHidan3;
    ImageView playKakuzu1;
    ImageView playKakuzu2;
    ImageView playKakuzu3;
    ImageView playZetsu1;
    ImageView playSasori1;
    ImageView playSasori2;
    ImageView playKisame1;
    ImageView playKisame2;
    ImageView playTobi1;
    ImageView playTobi2;
    ImageView backButton;

    boolean pause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akatsuki);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playDeidara1 = findViewById(R.id.playDeidara1);
        playDeidara2 = findViewById(R.id.playDeidara2);
        playHidan1 = findViewById(R.id.playHidan1);
        playHidan2 = findViewById(R.id.playHidan2);
        playHidan3 = findViewById(R.id.playHidan3);
        playKakuzu1 = findViewById(R.id.playKakuzu1);
        playKakuzu2 = findViewById(R.id.playKakuzu2);
        playKakuzu3 = findViewById(R.id.playKakuzu3);
        playZetsu1 = findViewById(R.id.playZetsu1);
        playSasori1 = findViewById(R.id.playSasori1);
        playSasori2 = findViewById(R.id.playSasori2);
        playKisame1 = findViewById(R.id.playKisame1);
        playKisame2 = findViewById(R.id.playKisame2);
        playTobi1 = findViewById(R.id.playTobi1);
        playTobi2 = findViewById(R.id.playTobi2);
        backButton = findViewById(R.id.back);

        final MediaPlayer soundDeidara1 = MediaPlayer.create(this,R.raw.deidara1);
        final MediaPlayer soundDeidara2= MediaPlayer.create(this,R.raw.deidara2);
        final MediaPlayer soundHidan1 = MediaPlayer.create(this,R.raw.hidan);
        final MediaPlayer soundHidan2 = MediaPlayer.create(this,R.raw.hidan2);
        final MediaPlayer soundHidan3 = MediaPlayer.create(this,R.raw.hidan3);
        final MediaPlayer soundKakuzu1 = MediaPlayer.create(this,R.raw.kakuzu1);
        final MediaPlayer soundKakuzu2 = MediaPlayer.create(this,R.raw.kakuzu2);
        final MediaPlayer soundKakuzu3 = MediaPlayer.create(this,R.raw.kakuzu3);

        final MediaPlayer soundZetsu1 = MediaPlayer.create(this,R.raw.zetsu1);
        final MediaPlayer soundSasori1 = MediaPlayer.create(this,R.raw.sasori1);
        final MediaPlayer soundSasori2 = MediaPlayer.create(this,R.raw.sasori2);
        final MediaPlayer soundKisame1 = MediaPlayer.create(this,R.raw.kisame1);
        final MediaPlayer soundKisame2 = MediaPlayer.create(this,R.raw.kisame2);
        final MediaPlayer soundTobi1 = MediaPlayer.create(this,R.raw.tobi1);
        final MediaPlayer soundTobi2 = MediaPlayer.create(this, R.raw.tobi);

        playDeidara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundDeidara1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playDeidara1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playDeidara1,soundDeidara1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playDeidara1,soundDeidara1);
                    pause=false;
                }
            }
        });
        playDeidara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundDeidara2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playDeidara2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playDeidara2,soundDeidara2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playDeidara2,soundDeidara2);
                    pause=false;
                }
            }
        });
        playHidan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundHidan1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playHidan1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playHidan1,soundHidan1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playHidan1,soundHidan1);
                    pause=false;
                }
            }
        });
        playHidan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundHidan2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playHidan2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playHidan2,soundHidan2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playHidan2,soundHidan2);
                    pause=false;
                }
            }
        });
        playHidan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundHidan3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playHidan3.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playHidan3,soundHidan3);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playHidan3,soundHidan3);
                    pause=false;
                }
            }
        });
        playKakuzu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKakuzu1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKakuzu1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKakuzu1,soundKakuzu1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKakuzu1,soundKakuzu1);
                    pause=false;
                }
            }
        });
        playKakuzu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKakuzu2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKakuzu2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKakuzu2,soundKakuzu2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKakuzu2,soundKakuzu2);
                    pause=false;
                }
            }
        });
        playKakuzu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKakuzu3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKakuzu3.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKakuzu3,soundKakuzu3);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKakuzu3,soundKakuzu3);
                    pause=false;
                }
            }
        });

        playZetsu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundZetsu1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playZetsu1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playZetsu1,soundZetsu1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playZetsu1,soundZetsu1);
                    pause=false;
                }
            }
        });
        playSasori1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundSasori1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSasori1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSasori1,soundSasori1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSasori1,soundSasori1);
                    pause=false;
                }
            }
        });
        playSasori2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundSasori2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSasori2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSasori2,soundSasori2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSasori2,soundSasori2);
                    pause=false;
                }
            }
        });
        playTobi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundTobi1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTobi1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playTobi1,soundTobi1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playTobi1,soundTobi1);
                    pause=false;
                }
            }
        });
        playTobi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundTobi2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTobi2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playTobi2,soundTobi2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playTobi2,soundTobi2);
                    pause=false;
                }
            }
        });
        playKisame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKisame1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKisame1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKisame1,soundKisame1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKisame1,soundKisame1);
                    pause=false;
                }
            }
        });
        playKisame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKisame2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKisame2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKisame2,soundKisame2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKisame2,soundKisame2);
                    pause=false;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                soundDeidara1.release();
                soundDeidara2.release();
                soundHidan1.release();
                soundHidan2.release();
                soundHidan3.release();
                soundKakuzu1.release();
                soundKakuzu2.release();
                soundKakuzu3.release();
               // soundOrochimaru1.release();
                soundSasori1.release();
                soundSasori2.release();
                soundZetsu1.release();
                soundKisame1.release();
                soundKisame2.release();
                soundTobi1.release();
                soundTobi2.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });
    }
}
