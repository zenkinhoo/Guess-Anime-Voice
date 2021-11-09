package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Konoha extends AppCompatActivity {

    ImageView playNeji1;
    ImageView playNeji2;
    ImageView playNeji3;
    ImageView playLee1;
    ImageView playKiba1;
    ImageView playShino1;
    ImageView playIno1;
    ImageView playChoji1;
    ImageView playHinata1;
    ImageView playShikamaru1;
    ImageView playShikamaru2;
    ImageView playShikamaru3;
    ImageView playSakura1;
    ImageView playSakura2;
    ImageView playYamato1;
    ImageView playYamato2;
    ImageView playJiraiya1;
    ImageView playJiraiya2;
    ImageView playJiraiya3;
    ImageView playIbiki1;
    ImageView playAnko1;
    ImageView playSai1;
    ImageView playGai1;
    ImageView playHayate1;
    ImageView playDanzo1;
    ImageView playAsuma1;
    ImageView backButton;

    boolean pause = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konoha);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playNeji1 = findViewById(R.id.playNeji1);
        playNeji2 = findViewById(R.id.playNeji2);
        playNeji3 = findViewById(R.id.playNeji3);
        playLee1=findViewById(R.id.playLee1);
        playKiba1=findViewById(R.id.playKiba1);
        playShino1 = findViewById(R.id.playShino1);
        playIno1 = findViewById(R.id.playIno1);
        playChoji1 = findViewById(R.id.playChoji1);
        playHinata1 = findViewById(R.id.playHinata1);
        playShikamaru1 = findViewById(R.id.playShikamaru1);
        playShikamaru2 = findViewById(R.id.playShikamaru2);
        playShikamaru3 = findViewById(R.id.playShikamaru3);
        playSakura1 = findViewById(R.id.playSakura1);
        playSakura2 = findViewById(R.id.playSakura2);
        playYamato1 = findViewById(R.id.playYamato1);
        playYamato2 = findViewById(R.id.playYamato2);
        playJiraiya1 = findViewById(R.id.playJiraiya1);
        playJiraiya2 = findViewById(R.id.playJiraiya2);
        playJiraiya3 = findViewById(R.id.playJiraiya3);
        playDanzo1 = findViewById(R.id.playDanzo1);
        playAsuma1 = findViewById(R.id.playAsuma1);
        playHayate1 = findViewById(R.id.playHayate1);
        playAnko1 = findViewById(R.id.playAnko1);
        playSai1 = findViewById(R.id.playSai1);
        playGai1 = findViewById(R.id.playGai1);
        playIbiki1 = findViewById(R.id.playIbiki1);
        backButton = findViewById(R.id.back);




        final MediaPlayer soundNeji1 = MediaPlayer.create(this,R.raw.neji1);
        final MediaPlayer soundNeji2 = MediaPlayer.create(this,R.raw.neji2);
        final MediaPlayer soundNeji3 = MediaPlayer.create(this,R.raw.neji3);
        final MediaPlayer soundLee1 = MediaPlayer.create(this,R.raw.lee1);
        final MediaPlayer soundKiba1 = MediaPlayer.create(this,R.raw.kiba1);
        final MediaPlayer soundShino1 = MediaPlayer.create(this,R.raw.shino1);
        final MediaPlayer soundIno1 = MediaPlayer.create(this,R.raw.ino1);
        final MediaPlayer soundChoji1 = MediaPlayer.create(this,R.raw.choji1);
        final MediaPlayer soundHinata1 = MediaPlayer.create(this,R.raw.hinata1);
        final MediaPlayer soundShikamaru1 = MediaPlayer.create(this,R.raw.shikamaru1);
        final MediaPlayer soundShikamaru2 = MediaPlayer.create(this,R.raw.shikamaru2);
        final  MediaPlayer soundShikamaru3 = MediaPlayer.create(this,R.raw.shikamaru3);
        final MediaPlayer soundSakura1 = MediaPlayer.create(this,R.raw.sakura1);
        final MediaPlayer soundSakura2 = MediaPlayer.create(this,R.raw.sakura2);
        final MediaPlayer soundYamato1 = MediaPlayer.create(this,R.raw.yamato1);
        final MediaPlayer soundYamato2 = MediaPlayer.create(this,R.raw.yamato2);
        final MediaPlayer soundJiraiya1 = MediaPlayer.create(this,R.raw.jiraiya1);
        final MediaPlayer soundJiraiya2 = MediaPlayer.create(this,R.raw.jiraiya2);
        final MediaPlayer soundJiraiya3 = MediaPlayer.create(this,R.raw.jiraiya3);
        final MediaPlayer soundDanzo1 = MediaPlayer.create(this,R.raw.danzo1);
        final MediaPlayer soundIbiki1 = MediaPlayer.create(this,R.raw.ibiki1);
        final MediaPlayer soundHayate1 = MediaPlayer.create(this,R.raw.hayate1);
        final MediaPlayer soundAnko1 = MediaPlayer.create(this,R.raw.anko1);
        final  MediaPlayer soundSai1 = MediaPlayer.create(this,R.raw.sai1);
        final MediaPlayer soundGai1 = MediaPlayer.create(this,R.raw.gai1);
        final MediaPlayer soundAsuma1 = MediaPlayer.create(this,R.raw.asuma1);

        playNeji1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundNeji1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playNeji1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playNeji1,soundNeji1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playNeji1,soundNeji1);
                    pause=false;
                }
            }
        });
        playNeji2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundNeji2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playNeji2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playNeji2,soundNeji2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playNeji2,soundNeji2);
                    pause=false;
                }
            }
        });
        playNeji3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundNeji3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playNeji3.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playNeji3,soundNeji3);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playNeji3,soundNeji3);
                    pause=false;
                }
            }
        });
        playLee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundLee1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playLee1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playLee1,soundLee1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playLee1,soundLee1);
                    pause=false;
                }
            }
        });
        playKiba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundKiba1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playKiba1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playKiba1,soundKiba1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playKiba1,soundKiba1);
                    pause=false;
                }
            }
        });
        playShino1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundShino1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playShino1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playShino1,soundShino1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playShino1,soundShino1);
                    pause=false;
                }
            }
        });
        playHinata1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundHinata1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playHinata1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playHinata1,soundHinata1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playHinata1,soundHinata1);
                    pause=false;
                }
            }
        });
        playIno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundIno1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playIno1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playIno1,soundIno1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playIno1,soundIno1);
                    pause=false;
                }
            }
        });
        playChoji1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundChoji1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playChoji1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playChoji1,soundChoji1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playChoji1,soundChoji1);
                    pause=false;
                }
            }
        });
        playShikamaru1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundShikamaru1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playShikamaru1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playShikamaru1,soundShikamaru1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playShikamaru1,soundShikamaru1);
                    pause=false;
                }
            }
        });
        playShikamaru2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundShikamaru2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playShikamaru2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playShikamaru2,soundShikamaru2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playShikamaru2,soundShikamaru2);
                    pause=false;
                }
            }
        });
        playShikamaru3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundShikamaru3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playShikamaru3.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playShikamaru3,soundShikamaru3);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playShikamaru3,soundShikamaru3);
                    pause=false;
                }
            }
        });
        playSakura1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundSakura1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSakura1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSakura1,soundSakura1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSakura1,soundSakura1);
                    pause=false;
                }
            }
        });
        playSakura2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundSakura2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSakura2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSakura2,soundSakura2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSakura2,soundSakura2);
                    pause=false;
                }
            }
        });
        playYamato1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundYamato1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playYamato1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playYamato1,soundYamato1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playYamato1,soundYamato1);
                    pause=false;
                }
            }
        });
        playYamato2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundYamato2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playYamato2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playYamato2,soundYamato2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playYamato2,soundYamato2);
                    pause=false;
                }
            }
        });
        playJiraiya1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundJiraiya1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playJiraiya1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playJiraiya1,soundJiraiya1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playJiraiya1,soundJiraiya1);
                    pause=false;
                }
            }
        });
        playJiraiya2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundJiraiya2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playJiraiya2.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playJiraiya2,soundJiraiya2);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playJiraiya2,soundJiraiya2);
                    pause=false;
                }
            }
        });
        playJiraiya3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundJiraiya3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playJiraiya3.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playJiraiya3,soundJiraiya3);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playJiraiya3,soundJiraiya3);
                    pause=false;
                }
            }
        });
        playIbiki1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundIbiki1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playIbiki1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playIbiki1,soundIbiki1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playIbiki1,soundIbiki1);
                    pause=false;
                }
            }
        });
        playAnko1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundAnko1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playAnko1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playAnko1,soundAnko1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playAnko1,soundAnko1);
                    pause=false;
                }
            }
        });
        playAsuma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundAsuma1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playAsuma1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playAsuma1,soundAsuma1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playAsuma1,soundAsuma1);
                    pause=false;
                }
            }
        });
        playHayate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundHayate1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playHayate1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playHayate1,soundHayate1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playHayate1,soundHayate1);
                    pause=false;
                }
            }
        });
        playSai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundSai1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playSai1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playSai1,soundSai1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playSai1,soundSai1);
                    pause=false;
                }
            }
        });
        playGai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundGai1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playGai1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playGai1,soundGai1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playGai1,soundGai1);
                    pause=false;
                }
            }
        });
        playDanzo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundDanzo1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playDanzo1.setImageResource(R.drawable.play);
                        pause = false;
                    }
                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playDanzo1,soundDanzo1);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playDanzo1,soundDanzo1);
                    pause=false;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                soundNeji1.release();
                soundNeji2.release();
                soundNeji3.release();
                soundKiba1.release();
                soundLee1.release();
                soundHinata1.release();
                soundShino1.release();
                soundIno1.release();
                soundChoji1.release();
                soundShikamaru1.release();
                soundShikamaru2.release();
                soundShikamaru3.release();
                soundHinata1.release();
                soundSai1.release();
                soundSakura1.release();
                soundSakura2.release();
                soundGai1.release();
                soundYamato1.release();
                soundYamato2.release();
                soundJiraiya1.release();
                soundJiraiya2.release();
                soundJiraiya3.release();
                soundIbiki1.release();
                soundAnko1.release();
                soundAsuma1.release();
                soundDanzo1.release();
                soundHayate1.release();
                finish(); // kraj aktivnosti , povratak na prethodnu
            }
        });
    }
}
