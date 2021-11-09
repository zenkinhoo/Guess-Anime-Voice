package com.example.guessanimevoice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {

    private static WeakReference<MainActivity> instance;

    //inicijalizacija slika za training mode
    ImageView imgNaruto;
    ImageView imgSasuke;
    ImageView imgKakashi;
    ImageView imgItachi;
    ImageView imgPain;
    ImageView imgSunagakure;
    ImageView imgHokage;
    ImageView imgAkatsuki;
    ImageView imgKonoha;
    ImageView imgMadara;
    ImageView imgObito;
    ImageView imgUchiha;
    ImageView imgKumogakure;
    ImageView imgKirigakure;
    ImageView imgIwagakure;
    ImageView imgOtogakure;

    //podesavanje ulaska u game settings
    AlertDialog gameSettings;
    Button btnPlay;
    Button btnCancel;
    RadioButton radioNaruto;
    RadioButton radioNormal;
    RadioButton radioHard;
    RadioButton radioClassic;
    RadioButton radioElimination;

    //podesavanje quit dialoga
    AlertDialog dialogQuit;
    Button btnYes;
    Button btnNo;


    AlertDialog dialogBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance = new WeakReference<>(this);

        //postavljanje naslova menija
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Anime Voice Guesser");


       imgNaruto = findViewById(R.id.imgNaruto);
        imgSasuke = findViewById(R.id.imgSasuke);
       imgKakashi = findViewById(R.id.imgKakashi);
        imgItachi = findViewById(R.id.imgItachi);
        imgPain = findViewById(R.id.imgPain);
        imgSunagakure = findViewById(R.id.imgSunagakure);
        imgHokage = findViewById(R.id.imgHokages);
       imgAkatsuki = findViewById(R.id.imgAkatsuki);
        imgKonoha = findViewById(R.id.imgKonoha);
        imgMadara = findViewById(R.id.imgMadara);
        imgObito = findViewById(R.id.imgObito);
        imgUchiha = findViewById(R.id.imgUchiha);
        imgKumogakure = findViewById(R.id.imgKumogakure);
        imgKirigakure = findViewById(R.id.imgKirigakure);
        imgIwagakure = findViewById(R.id.imgIwagakure);
        imgOtogakure = findViewById(R.id.imgOtogakure);


      imgNaruto.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Naruto.class));

            }
        });
        imgSasuke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Sasuke.class));
            }
        });
        imgKakashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Kakashi.class));
            }
        });
        imgItachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Itachi.class));
            }
        });
        imgPain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Pain.class));
            }
        });
        imgSunagakure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Sunagakure.class));
            }
        });
        imgHokage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Hokage.class));
            }
        });
        imgAkatsuki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Akatsuki.class));
            }
        });
        imgKonoha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Konoha.class));
            }
        });
        imgMadara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Madara.class));
            }
        });
        imgObito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Obito.class));
            }
        });
        imgUchiha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Uchiha.class));
            }
        });
        imgKumogakure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Kumogakure.class));
            }
        });
        imgKirigakure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Kirigakure.class));
            }
        });
        imgIwagakure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Iwagakure.class));
            }
        });
        imgOtogakure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Otogakure.class));
            }
        });

    }

    public static MainActivity getInstance()
    {
        return instance.get();
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
                View viewQuit = getLayoutInflater().inflate(R.layout.quit,null);
                btnYes=(Button) viewQuit.findViewById(R.id.btnBacktomanu);
                btnNo=(Button) viewQuit.findViewById(R.id.btnNo);

                dialogQuit=buildDialog(viewQuit);

                Display display1 =((WindowManager)getSystemService(MainActivity.WINDOW_SERVICE)).getDefaultDisplay();
                int width1 = display1.getWidth();
                int height1 =display1.getHeight();
                dialogQuit.getWindow().setLayout((8*width1)/9,(2*height1)/7);//podesavanje velicine dialoga u odnosu na velicinu ekrana

                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        System.exit(0);
                    }
                });
                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogQuit.dismiss();
                    }
                });




                break;
            case R.id.action_settings:
              //  startActivity(new Intent(MainActivity.this,GameNarutoHard.class));
                break;
            case R.id.action_game: //klikom na dugme u meniju
               // AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                View view = getLayoutInflater().inflate(R.layout.gamesettings,null);
                //game settings inicijalizacija
                btnCancel = (Button) view.findViewById(R.id.btnCancel);
                btnPlay = (Button)view.findViewById(R.id.btnPlaybutton);
                radioClassic = (RadioButton) view.findViewById(R.id.radioClassic);
                radioElimination = (RadioButton)view.findViewById(R.id.radioElimination);
                radioHard = (RadioButton)view.findViewById(R.id.radioHard);
                radioNormal = (RadioButton)view.findViewById(R.id.radioNormal);
                radioNaruto = (RadioButton)view.findViewById(R.id.radioNaruto);

                gameSettings = buildDialog(view);

                Display display =((WindowManager)getSystemService(MainActivity.WINDOW_SERVICE)).getDefaultDisplay();
                int width = display.getWidth();
                int height=display.getHeight();

                gameSettings.getWindow().setLayout((11*width)/12,(5*height)/9); //podesavanje velicine dialoga u odnosu na velicinu ekrana

               btnPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(radioNaruto.isChecked() && radioHard.isChecked() && radioClassic.isChecked())
                        {
                            startActivity(new Intent(MainActivity.this,GameNarutoHard.class));
                            gameSettings.dismiss();
                        }
                        else if(radioNaruto.isChecked() && radioHard.isChecked() && radioElimination.isChecked())
                        {
                            startActivity(new Intent(MainActivity.this,EliminationNarutoHard.class));
                            gameSettings.dismiss();
                        }
                        else if(radioNaruto.isChecked() && radioNormal.isChecked() && radioClassic.isChecked())
                        {
                            startActivity(new Intent(MainActivity.this,GameNarutoNormal.class));
                            gameSettings.dismiss();
                        }
                        else if(radioNaruto.isChecked() && radioNormal.isChecked() && radioElimination.isChecked())
                        {
                            startActivity(new Intent(MainActivity.this,EliminationNarutoNormal.class));
                            gameSettings.dismiss();
                        }
                    }
                });
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gameSettings.dismiss();
                    }
                });

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
       // super.onBackPressed();
        View viewBack = getLayoutInflater().inflate(R.layout.quit,null);
        btnYes=(Button) viewBack.findViewById(R.id.btnBacktomanu);
        btnNo=(Button) viewBack.findViewById(R.id.btnNo);
        dialogBack = buildDialog(viewBack);


        Display display1 =((WindowManager)getSystemService(MainActivity.WINDOW_SERVICE)).getDefaultDisplay();
        int width1 = display1.getWidth();
        int height1 =display1.getHeight();
        dialogBack.getWindow().setLayout((8*width1)/9,(2*height1)/7);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
               System.exit(0);
            }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBack.dismiss();
            }
        });


    }

    public void managePlay (ImageView img, MediaPlayer sound)
    {
            sound.start();
            img.setImageResource(R.drawable.pause);
            img.setMaxHeight(120);
            img.setMaxWidth(120);
    }
    public void managePause(ImageView img , MediaPlayer sound)
    {
        sound.pause();
        img.setImageResource(R.drawable.play);
    }

    public AlertDialog buildDialog(View view) //metoda za kreiranje dialoga
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setView(view);
        builder.setCancelable(false);
        AlertDialog dialog=builder.create();
        dialog.show();
        return dialog;
    }



}
