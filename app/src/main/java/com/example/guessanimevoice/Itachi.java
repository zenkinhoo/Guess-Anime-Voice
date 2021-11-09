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

public class Itachi extends AppCompatActivity {

    ImageView playItachiAmaterasu;
    ImageView playItachiKaton;
    ImageView playUruse;
    ImageView playUrame;
    ImageView playMangekyou;
    ImageView backButton;
    ImageView playTsukuyomi1;
    ImageView playTsukuyomi2;
    boolean pause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itachi);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");

        playItachiAmaterasu=findViewById(R.id.playItachiAmaterasu);
        playItachiKaton = findViewById(R.id.playItachiKaton);
        playUrame = findViewById(R.id.playUrame);
        playUruse = findViewById(R.id.playUruse);
        playMangekyou = findViewById(R.id.playMangekyou);
        playTsukuyomi1 = findViewById(R.id.playTsukuyomi1);
        playTsukuyomi2 = findViewById(R.id.playTsukuyomi2);
        backButton = findViewById(R.id.back);

        final MediaPlayer itachiAmaterasuSound = MediaPlayer.create(this,R.raw.itachi_amaterasu);
        final MediaPlayer itachiKatonSound = MediaPlayer.create(this,R.raw.itachi_gokkakyu);
        final MediaPlayer uruseSound = MediaPlayer.create(this,R.raw.itachi_uruse);
        final MediaPlayer urameSound = MediaPlayer.create(this,R.raw.itachi_foolishlittlebrother);
        final MediaPlayer mangekyouSound = MediaPlayer.create(this,R.raw.itachi_mangekyou);
        final MediaPlayer tsukuyomi1Sound = MediaPlayer.create(this,R.raw.tsukuyomi1);
        final MediaPlayer tsukuyomi2Sound = MediaPlayer.create(this,R.raw.tsukuyomi2);

        playItachiAmaterasu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itachiAmaterasuSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playItachiAmaterasu.setImageResource(R.drawable.play);
                        pause=false;
                    }

                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playItachiAmaterasu,itachiAmaterasuSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playItachiAmaterasu,itachiAmaterasuSound);
                    pause=false;
                }
            }
        });
        playItachiKaton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itachiKatonSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playItachiKaton.setImageResource(R.drawable.play);
                        pause=false;
                    }

                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playItachiKaton,itachiKatonSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playItachiKaton,itachiKatonSound);
                    pause=false;
                }
            }
        });
        playUrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urameSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playUrame.setImageResource(R.drawable.play);
                        pause=false;
                    }

                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playUrame,urameSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playUrame,urameSound);
                    pause=false;
                }
            }
        });
        playMangekyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mangekyouSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playMangekyou.setImageResource(R.drawable.play);
                        pause=false;
                    }

                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playMangekyou,mangekyouSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playMangekyou,mangekyouSound);
                    pause=false;
                }
            }
        });
        playUruse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uruseSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playUruse.setImageResource(R.drawable.play);
                        pause=false;
                    }

                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playUruse,uruseSound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playUruse,uruseSound);
                    pause=false;
                }
            }
        });
        playTsukuyomi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tsukuyomi1Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTsukuyomi1.setImageResource(R.drawable.play);
                        pause=false;
                    }

                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playTsukuyomi1,tsukuyomi1Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playTsukuyomi1,tsukuyomi1Sound);
                    pause=false;
                }
            }
        });
        playTsukuyomi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tsukuyomi2Sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        playTsukuyomi2.setImageResource(R.drawable.play);
                        pause=false;
                    }

                });
                if(!pause)
                {
                    MainActivity.getInstance().managePlay(playTsukuyomi2,tsukuyomi2Sound);
                    pause=true;
                }
                else if(pause)
                {
                    MainActivity.getInstance().managePause(playTsukuyomi2,tsukuyomi2Sound);
                    pause=false;
                }
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //oslobadjanje media playera
                urameSound.release();
                uruseSound.release();
                itachiAmaterasuSound.release();
                itachiKatonSound.release();
                tsukuyomi1Sound.release();
                tsukuyomi2Sound.release();
                mangekyouSound.release();
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
