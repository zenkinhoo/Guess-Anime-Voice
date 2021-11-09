package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class GameNarutoHard extends AppCompatActivity {

    ImageView Playgame;
    TextView Solution;
    TextView CorWro;
    TextView txtQuestions;
    TextView txtScore;
    EditText enterSolution;
    Button btnSubmit;
    Button btnNext;


    ArrayList<String> solutions; //lista tacnih odgovora
    ArrayList<MediaPlayer> sounds; //lista zvukova
    MediaPlayer randSound;


     int score = 0;
     int curr=0; //prati trenutno pitanje
    boolean pause = false;

    AlertDialog scoreDialog;
    AlertDialog exitDialog;
    Button btnYes;
    Button btnNo;
    Button backToMain;
    TextView exitText;
    TextView finishScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_naruto_hard);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Playgame = findViewById(R.id.imgPlaygame);
        Solution = findViewById(R.id.textSolution);
        enterSolution = findViewById(R.id.enterSolution);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnNext = findViewById(R.id.btnNext);
        CorWro = findViewById(R.id.textCorWro);
        txtScore = findViewById(R.id.txtScore);
        txtQuestions = findViewById(R.id.txtQuestions);

        String scoreString = String.format("Question:%d/5",curr+1);
        txtQuestions.setText(scoreString);
        txtScore.setText("Score:0/5");

        solutions = new ArrayList<String>();
        sounds = new ArrayList<MediaPlayer>();

        final MediaPlayer soundCorrect = MediaPlayer.create(this,R.raw.correct);
        final MediaPlayer soundWrong = MediaPlayer.create(this,R.raw.wrong);


        final MediaPlayer soundAnko = MediaPlayer.create(this,R.raw.anko1);
        solutions.add(0,"Anko");
        sounds.add(0,soundAnko);
        final MediaPlayer soundFugaku = MediaPlayer.create(this,R.raw.fugaku1);
        solutions.add(1,"Fugaku");
        sounds.add(1,soundFugaku);
        final MediaPlayer soundKakuzu = MediaPlayer.create(this,R.raw.kakuzu1);
        solutions.add(2,"Kakuzu");
        sounds.add(2,soundKakuzu);
        final MediaPlayer soundKankuro = MediaPlayer.create(this,R.raw.kankuro1);
        solutions.add(3,"Kankuro");
        sounds.add(3,soundKankuro);
        final MediaPlayer soundAo = MediaPlayer.create(this,R.raw.ao1);
        solutions.add(4,"Ao");
        sounds.add(4,soundAo);
        final MediaPlayer soundDanzo = MediaPlayer.create(this,R.raw.danzo1);
        solutions.add(5,"Danzo");
        sounds.add(5,soundDanzo);
        final MediaPlayer soundDarui= MediaPlayer.create(this,R.raw.darui1);
        solutions.add(6,"Darui");
        sounds.add(6,soundDarui);
        final MediaPlayer soundGengetsu = MediaPlayer.create(this,R.raw.gengetsu);
        solutions.add(7,"Gengetsu");
        sounds.add(7,soundGengetsu);
        final MediaPlayer soundHayate = MediaPlayer.create(this,R.raw.hayate1);
        solutions.add(8,"Hayate");
        sounds.add(8,soundHayate);
        final MediaPlayer soundIzuna = MediaPlayer.create(this,R.raw.izuna1);
        solutions.add(9,"Izuna");
        sounds.add(9,soundIzuna);
        final MediaPlayer soundKakuzu1 = MediaPlayer.create(this,R.raw.kakuzu1);
        solutions.add(10,"Kakuzu");
        sounds.add(10,soundKakuzu1);
        final MediaPlayer soundKakuzu2 = MediaPlayer.create(this,R.raw.kakuzu2);
        solutions.add(11,"Kakuzu");
        sounds.add(11,soundKakuzu2);
        final MediaPlayer soundKitsuchi = MediaPlayer.create(this,R.raw.kitsuchi1);
        solutions.add(12,"Kitsuchi");
        sounds.add(12,soundKitsuchi);
        final MediaPlayer soundKurotsuchi = MediaPlayer.create(this,R.raw.kurotsutchi1);
        solutions.add(13,"Kurotsuchi");
        sounds.add(13,soundKankuro);
        final MediaPlayer soundMei= MediaPlayer.create(this,R.raw.mei1);
        solutions.add(14,"Mei");
        sounds.add(14,soundMei);
        final MediaPlayer soundOmoi = MediaPlayer.create(this,R.raw.omoi1);
        solutions.add(15,"Omoi");
        sounds.add(15,soundOmoi);
        final MediaPlayer soundSakon= MediaPlayer.create(this,R.raw.sakon1);
        solutions.add(16,"Sakon");
        sounds.add(16,soundSakon);
        final MediaPlayer soundSasori1 = MediaPlayer.create(this,R.raw.sasori1);
        solutions.add(17,"Sasori");
        sounds.add(17,soundSasori1);
        final MediaPlayer soundSasori2 = MediaPlayer.create(this,R.raw.sasori2);
        solutions.add(18,"Sasori");
        sounds.add(18,soundSasori2);
        final MediaPlayer soundShee = MediaPlayer.create(this,R.raw.shee1);
        solutions.add(19,"Shee");
        sounds.add(19,soundShee);
        final MediaPlayer soundShino = MediaPlayer.create(this,R.raw.shino1);
        solutions.add(20,"Shino");
        sounds.add(20,soundShino);
        final MediaPlayer soundShisui1 = MediaPlayer.create(this,R.raw.shisui1);
        solutions.add(21,"Shisui");
        sounds.add(21,soundShisui1);
        final MediaPlayer soundShisui2 = MediaPlayer.create(this,R.raw.shisui2);
        solutions.add(22,"Shisui");
        sounds.add(22,soundShisui2);
        final MediaPlayer soundTemari2= MediaPlayer.create(this,R.raw.temari2);
        solutions.add(23,"Temari");
        sounds.add(23,soundTemari2);
        final MediaPlayer soundThird = MediaPlayer.create(this,R.raw.third_kazekage1);
        solutions.add(24,"Minoru");
        sounds.add(24,soundThird);
        final MediaPlayer soundTobirama2 = MediaPlayer.create(this,R.raw.tobirama2);
        solutions.add(25,"Tobirama");
        sounds.add(25,soundTobirama2);
        final MediaPlayer soundTobirama1 = MediaPlayer.create(this,R.raw.tobirama1);
        solutions.add(26,"Tobirama");
        sounds.add(26,soundTobirama1);
        final MediaPlayer soundTsunade= MediaPlayer.create(this,R.raw.tsunade1);
        solutions.add(27,"Tsunade");
        sounds.add(27,soundTsunade);
        final MediaPlayer soundYagura= MediaPlayer.create(this,R.raw.yagura1);
        solutions.add(28,"Yagura");
        sounds.add(28,soundYagura);
        final MediaPlayer soundZabuza= MediaPlayer.create(this,R.raw.zabuza1);
        solutions.add(29,"Zabuza");
        sounds.add(29,soundZabuza);
        final MediaPlayer soundZetsu= MediaPlayer.create(this,R.raw.zetsu1);
        solutions.add(30,"Zetsu");
        sounds.add(30,soundZetsu);
        final MediaPlayer soundOnoki= MediaPlayer.create(this,R.raw.jinton2);
        solutions.add(31,"Onoki");
        sounds.add(31,soundOnoki);
        final MediaPlayer soundMinato= MediaPlayer.create(this,R.raw.minato2);
        solutions.add(32,"Minato");
        sounds.add(32,soundMinato);
        final MediaPlayer soundSarutobi= MediaPlayer.create(this,R.raw.sarutobi2);
        solutions.add(33,"Hiruzen");
        sounds.add(33,soundSarutobi);
        final MediaPlayer soundHidan= MediaPlayer.create(this,R.raw.hidan);
        solutions.add(34,"Hidan");
        sounds.add(34,soundHidan);
        final MediaPlayer soundKisame= MediaPlayer.create(this,R.raw.kisame2);
        solutions.add(35,"Kisame");
        sounds.add(35,soundKisame);
        final MediaPlayer soundHaku= MediaPlayer.create(this,R.raw.haku1);
        solutions.add(36,"Haku");
        sounds.add(36,soundHaku);
        final MediaPlayer soundAsuma= MediaPlayer.create(this,R.raw.asuma1);
        solutions.add(37,"Asuma");
        sounds.add(37,soundAsuma);
        final MediaPlayer soundObito= MediaPlayer.create(this,R.raw.obito_katon2);
        solutions.add(38,"Obito");
        sounds.add(38,soundObito);
        final MediaPlayer soundObito1= MediaPlayer.create(this,R.raw.six_crimson);
        solutions.add(39,"Obito");
        sounds.add(39,soundObito1);
        final MediaPlayer soundKabuto= MediaPlayer.create(this,R.raw.kabuto2);
        solutions.add(40,"Kabuto");
        sounds.add(40,soundKabuto);
        final MediaPlayer soundKakashi= MediaPlayer.create(this,R.raw.kakashi_katon);
        solutions.add(41,"Kakashi");
        sounds.add(41,soundKakashi);



        final List<MediaPlayer> randSounds = getSounds(); // lista gotovih random zvukova
         //randSounds = getSounds();

             //  pusti = false;
           //ovo se desava klikom na dugme koje pusta zvuk za pogadjanje

               Playgame.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                       randSound=randSounds.get(curr);
                       randSound.seekTo(0);
                       randSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                           @Override
                           public void onCompletion(MediaPlayer mp) {
                               Playgame.setImageResource(R.drawable.play);
                               pause=false;

                           }
                       });
                       if(!pause)
                       {

                                   randSound.start();
                                   Playgame.setImageResource(R.drawable.pause);
                                   pause=true;



                       }
                       else if(pause)
                       {
                           randSound.pause();
                           Playgame.setImageResource(R.drawable.play);
                           pause=false;
                       }
                       // randSound.release();
                   }
               });
               btnSubmit.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       if(!enterSolution.getText().toString().equals("")) {
                           int index = sounds.indexOf(randSounds.get(curr));
                           if (enterSolution.getText().toString().equals(solutions.get(index))) {
                               CorWro.setText("Correct");
                               CorWro.setTextColor(Color.GREEN);
                               score++;
                               soundCorrect.start();
                           } else {
                               CorWro.setText("Wrong");
                               CorWro.setTextColor(Color.RED);
                               soundWrong.start();
                           }
                           Solution.setText(solutions.get(index));
                           enterSolution.setText("");
                           enterSolution.setEnabled(false);
                           btnSubmit.setEnabled(false);
                           btnNext.setEnabled(true);
                           randSounds.get(curr).stop();
                           randSounds.get(curr).release();
                           Playgame.setImageResource(R.drawable.play);
                           Playgame.setEnabled(false);
                       }
                       else
                       {
                           Toast.makeText(GameNarutoHard.this, "You must fill that field!", Toast.LENGTH_SHORT).show();
                       }
                   }

               });
               btnNext.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                   //    randSounds.get(curr).release();
                   //    randSounds.remove(curr);
                       curr++;
                       CorWro.setText("");
                       Solution.setText("");
                       enterSolution.setEnabled(true);
                       btnSubmit.setEnabled(true);
                       btnNext.setEnabled(false);
                       Playgame.setEnabled(true);
                       String scoreString = String.format("Question:%d/5",curr+1);
                       txtQuestions.setText(scoreString);
                       txtScore.setText(String.format("Score:%d/5",score));
                      // enterSolution.setText("");
                       if(curr==4)
                       {
                           btnNext.setText("Finish");
                       }
                       if(curr>=5) //kada dodje do kraja pitanja
                       {
                           soundCorrect.release();
                           soundWrong.release();

                           View viewBack = getLayoutInflater().inflate(R.layout.score,null);
                           backToMain=(Button) viewBack.findViewById(R.id.btnBacktomanu);
                           finishScore = (TextView) viewBack.findViewById(R.id.finishScore);
                           scoreDialog = buildDialog(viewBack);

                           Display display =((WindowManager)getSystemService(MainActivity.WINDOW_SERVICE)).getDefaultDisplay();
                           int width = display.getWidth();
                           int height=display.getHeight();
                           scoreDialog.getWindow().setLayout((8*width)/9,(1*height)/4);
                           finishScore.setText(String.format("Your score is %d",score));
                           backToMain.setOnClickListener(new View.OnClickListener() {
                               @Override
                               public void onClick(View v) {
                                   finish();
                               }
                           });

                       }
                   }
               });

    }
    public List<MediaPlayer> getSounds()
    {
        List<MediaPlayer> ret = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            Random r = new Random();
            final MediaPlayer randSound = sounds.get(r.nextInt(sounds.size()));
            if(!ret.contains(randSound))
            {
                ret.add(randSound);
            }
            else
            {
                i--;
            }
        }
       return ret;
      //  final int index = sounds.indexOf(randSound);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        View viewBack = getLayoutInflater().inflate(R.layout.quit,null);
        btnYes=(Button) viewBack.findViewById(R.id.btnBacktomanu);
        btnNo=(Button) viewBack.findViewById(R.id.btnNo);
        exitText=(TextView)viewBack.findViewById(R.id.exitText);
        exitDialog = buildDialog(viewBack);
        exitText.setText("Are you sure you want to quit game mode ?");

        Display display1 =((WindowManager)getSystemService(MainActivity.WINDOW_SERVICE)).getDefaultDisplay();
        int width1 = display1.getWidth();
        int height1 =display1.getHeight();
        exitDialog.getWindow().setLayout((8*width1)/9,(2*height1)/7);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            //    System.exit(0);
            }
        });
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitDialog.dismiss();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
    public AlertDialog buildDialog(View view) //metoda za kreiranje dialoga
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(GameNarutoHard.this);
        builder.setView(view);
        builder.setCancelable(false);
        AlertDialog dialog=builder.create();
        dialog.show();
        return dialog;
    }

}
