package com.example.guessanimevoice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameNarutoNormal extends AppCompatActivity {

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


        final MediaPlayer soundAnko = MediaPlayer.create(this,R.raw.chibaku_tensei);
        solutions.add(0,"Nagato");
        sounds.add(0,soundAnko);
        final MediaPlayer soundFugaku = MediaPlayer.create(this,R.raw.chidori_nagashi);
        solutions.add(1,"Sasuke");
        sounds.add(1,soundFugaku);
        final MediaPlayer soundKakuzu = MediaPlayer.create(this,R.raw.choji1);
        solutions.add(2,"Choji");
        sounds.add(2,soundKakuzu);
        final MediaPlayer soundKankuro = MediaPlayer.create(this,R.raw.deidara1);
        solutions.add(3,"Deidara");
        sounds.add(3,soundKankuro);
        final MediaPlayer soundAo = MediaPlayer.create(this,R.raw.deidara2);
        solutions.add(4,"Deidara");
        sounds.add(4,soundAo);
        final MediaPlayer soundDanzo = MediaPlayer.create(this,R.raw.danzo1);
        solutions.add(5,"Danzo");
        sounds.add(5,soundDanzo);
        final MediaPlayer soundDarui= MediaPlayer.create(this,R.raw.darui1);
        solutions.add(6,"Darui");
        sounds.add(6,soundDarui);
        final MediaPlayer soundGengetsu = MediaPlayer.create(this,R.raw.gaara3);
        solutions.add(7,"Gaara");
        sounds.add(7,soundGengetsu);
        final MediaPlayer soundHayate = MediaPlayer.create(this,R.raw.gaara4);
        solutions.add(8,"Gaara");
        sounds.add(8,soundHayate);
        final MediaPlayer soundIzuna = MediaPlayer.create(this,R.raw.gai1);
        solutions.add(9,"Gai");
        sounds.add(9,soundIzuna);
        final MediaPlayer soundKakuzu1 = MediaPlayer.create(this,R.raw.gedo_rinne_tensei);
        solutions.add(10,"Nagato");
        sounds.add(10,soundKakuzu1);
        final MediaPlayer soundKakuzu2 = MediaPlayer.create(this,R.raw.gouka_mekkyaku);
        solutions.add(11,"Madara");
        sounds.add(11,soundKakuzu2);
        final MediaPlayer soundKitsuchi = MediaPlayer.create(this,R.raw.hashirama1);
        solutions.add(12,"Hashirama");
        sounds.add(12,soundKitsuchi);
        final MediaPlayer soundKurotsuchi = MediaPlayer.create(this,R.raw.hashirama2);
        solutions.add(13,"Hashirama");
        sounds.add(13,soundKankuro);
        final MediaPlayer soundMei= MediaPlayer.create(this,R.raw.hidan2);
        solutions.add(14,"Hidan");
        sounds.add(14,soundMei);
        final MediaPlayer soundOmoi = MediaPlayer.create(this,R.raw.hidan3);
        solutions.add(15,"Hidan");
        sounds.add(15,soundOmoi);
        final MediaPlayer soundSakon= MediaPlayer.create(this,R.raw.hinata1);
        solutions.add(16,"Hinata");
        sounds.add(16,soundSakon);
        final MediaPlayer soundSasori1 = MediaPlayer.create(this,R.raw.ino1);
        solutions.add(17,"Ino");
        sounds.add(17,soundSasori1);
        final MediaPlayer soundSasori2 = MediaPlayer.create(this,R.raw.itachi_foolishlittlebrother);
        solutions.add(18,"Itachi");
        sounds.add(18,soundSasori2);
        final MediaPlayer soundShee = MediaPlayer.create(this,R.raw.itachi_mangekyou);
        solutions.add(19,"Itachi");
        sounds.add(19,soundShee);
        final MediaPlayer soundShino = MediaPlayer.create(this,R.raw.tsukuyomi1);
        solutions.add(20,"Itachi");
        sounds.add(20,soundShino);
        final MediaPlayer soundShisui1 = MediaPlayer.create(this,R.raw.jiraiya1);
        solutions.add(21,"Jiraiya");
        sounds.add(21,soundShisui1);
        final MediaPlayer soundShisui2 = MediaPlayer.create(this,R.raw.jiraiya3);
        solutions.add(22,"Jiraiya");
        sounds.add(22,soundShisui2);
        final MediaPlayer soundTemari2= MediaPlayer.create(this,R.raw.temari2);
        solutions.add(23,"Temari");
        sounds.add(23,soundTemari2);
        final MediaPlayer soundThird = MediaPlayer.create(this,R.raw.kabuto1);
        solutions.add(24,"Kabuto");
        sounds.add(24,soundThird);
        final MediaPlayer soundTobirama2 = MediaPlayer.create(this,R.raw.kakashi_katon);
        solutions.add(25,"Kakashi");
        sounds.add(25,soundTobirama2);
        final MediaPlayer soundTobirama1 = MediaPlayer.create(this,R.raw.kiba1);
        solutions.add(26,"Kiba");
        sounds.add(26,soundTobirama1);
        final MediaPlayer soundTsunade= MediaPlayer.create(this,R.raw.kisame2);
        solutions.add(27,"Kisame");
        sounds.add(27,soundTsunade);
        final MediaPlayer soundYagura= MediaPlayer.create(this,R.raw.kisame1);
        solutions.add(28,"Kisame");
        sounds.add(28,soundYagura);
        final MediaPlayer soundZabuza= MediaPlayer.create(this,R.raw.kuchiyose_pakun);
        solutions.add(29,"Kakashi");
        sounds.add(29,soundZabuza);
        final MediaPlayer soundZetsu= MediaPlayer.create(this,R.raw.lee1);
        solutions.add(30,"Lee");
        sounds.add(30,soundZetsu);
        final MediaPlayer soundOnoki= MediaPlayer.create(this,R.raw.limbo);
        solutions.add(31,"Madara");
        sounds.add(31,soundOnoki);
        final MediaPlayer soundMinato= MediaPlayer.create(this,R.raw.madara_deepforest);
        solutions.add(32,"Madara");
        sounds.add(32,soundMinato);
        final MediaPlayer soundSarutobi= MediaPlayer.create(this,R.raw.minato2);
        solutions.add(33,"Minato");
        sounds.add(33,soundSarutobi);
        final MediaPlayer soundHidan= MediaPlayer.create(this,R.raw.minato1);
        solutions.add(34,"Minato");
        sounds.add(34,soundHidan);
        final MediaPlayer soundKisame= MediaPlayer.create(this,R.raw.mugen);
        solutions.add(35,"Obito");
        sounds.add(35,soundKisame);
        final MediaPlayer soundHaku= MediaPlayer.create(this,R.raw.mud_wall);
        solutions.add(36,"Kakashi");
        sounds.add(36,soundHaku);
        final MediaPlayer soundAsuma= MediaPlayer.create(this,R.raw.neji2);
        solutions.add(37,"Neji");
        sounds.add(37,soundAsuma);
        final MediaPlayer soundObito= MediaPlayer.create(this,R.raw.obito_katon1);
        solutions.add(38,"Obito");
        sounds.add(38,soundObito);
        final MediaPlayer soundObito1= MediaPlayer.create(this,R.raw.obito_kyuubi);
        solutions.add(39,"Obito");
        sounds.add(39,soundObito1);
        final MediaPlayer soundKabuto= MediaPlayer.create(this,R.raw.onoki1);
        solutions.add(40,"Onoki");
        sounds.add(40,soundKabuto);
        final MediaPlayer soundKakashi= MediaPlayer.create(this,R.raw.onoki2);
        solutions.add(41,"Onoki");
        sounds.add(41,soundKakashi);
        final MediaPlayer soundOrochimaru = MediaPlayer.create(this,R.raw.orochimaru2);
        solutions.add(42,"Orochimaru");
        sounds.add(42,soundOrochimaru);
        final MediaPlayer soundPain = MediaPlayer.create(this,R.raw.pain_kuchiyose);
        solutions.add(43,"Pain");
        sounds.add(43,soundPain);
        final MediaPlayer soundRaikage= MediaPlayer.create(this,R.raw.raikage1);
        solutions.add(44,"A");
        sounds.add(44,soundRaikage);
        final MediaPlayer soundSai = MediaPlayer.create(this,R.raw.sai1);
        solutions.add(45,"Sai");
        sounds.add(45,soundSai);
        final MediaPlayer soundSakura1 = MediaPlayer.create(this,R.raw.sakura1);
        solutions.add(46,"Sakura");
        sounds.add(46,soundSakura1);
        final MediaPlayer soundSakura2 = MediaPlayer.create(this,R.raw.sakura2);
        solutions.add(47,"Sakura");
        sounds.add(47,soundSakura1);
        final MediaPlayer soundSarutobi1= MediaPlayer.create(this,R.raw.sarutobi1);
        solutions.add(48,"Hiruzen");
        sounds.add(48,soundSarutobi1);
        final MediaPlayer soundSarutobi2= MediaPlayer.create(this,R.raw.sarutobi2);
        solutions.add(49,"Hiruzen");
        sounds.add(49,soundSarutobi2);
        final MediaPlayer soundSasori11 = MediaPlayer.create(this,R.raw.sasori1);
        solutions.add(50,"Sasori");
        sounds.add(50,soundSasori11);
        final MediaPlayer soundSasori22 = MediaPlayer.create(this,R.raw.sasori2);
        solutions.add(51,"Sasori");
        sounds.add(51,soundSasori22);
        final MediaPlayer soundSasuke1 = MediaPlayer.create(this,R.raw.sasuke_shishi_renden);
        solutions.add(52,"Sasuke");
        sounds.add(52,soundSasuke1);
        final MediaPlayer soundMadara1 = MediaPlayer.create(this,R.raw.second_one);
        solutions.add(53,"Madara");
        sounds.add(53,soundMadara1);
        final MediaPlayer soundShikamaru1= MediaPlayer.create(this,R.raw.shikamaru1);
        solutions.add(54,"Shikamaru");
        sounds.add(54,soundShikamaru1);
        final MediaPlayer soundShikamaru2= MediaPlayer.create(this,R.raw.shikamaru2);
        solutions.add(55,"Shikamaru");
        sounds.add(55,soundShikamaru2);
        final MediaPlayer soundShikamaru3= MediaPlayer.create(this,R.raw.shikamaru3);
        solutions.add(56,"Shikamaru");
        sounds.add(56,soundShikamaru3);
        final MediaPlayer soundShino1 = MediaPlayer.create(this,R.raw.shino1);
        solutions.add(57,"Shino");
        sounds.add(57,soundShino1);
        final MediaPlayer soundShisui3= MediaPlayer.create(this,R.raw.shisui1);
        solutions.add(58,"Shisui");
        sounds.add(58,soundShisui3);
        final MediaPlayer soundShisui4= MediaPlayer.create(this,R.raw.shisui2);
        solutions.add(58,"Shisui");
        sounds.add(58,soundShisui4);
        final MediaPlayer soundSuiryu = MediaPlayer.create(this,R.raw.suiton_siriudan);
        solutions.add(59,"Kakashi");
        sounds.add(59,soundSuiryu);
        final MediaPlayer soundTemari= MediaPlayer.create(this,R.raw.temari1);
        solutions.add(60,"Hinata");
        sounds.add(60,soundTemari);
        final MediaPlayer soundTobi = MediaPlayer.create(this,R.raw.tobi);
        solutions.add(61,"Tobi");
        sounds.add(61,soundTobi);
        final MediaPlayer soundTobi1 = MediaPlayer.create(this,R.raw.tobi1);
        solutions.add(62,"Tobi");
        sounds.add(62,soundTobi1);
        final MediaPlayer soundTobirama = MediaPlayer.create(this,R.raw.tobirama1);
        solutions.add(63,"Tobirama");
        sounds.add(63,soundTobirama);
        final MediaPlayer soundTobirama3 = MediaPlayer.create(this,R.raw.tobirama3);
        solutions.add(64,"Tobirama");
        sounds.add(64,soundTobirama3);
        final MediaPlayer soundTsunade1 = MediaPlayer.create(this,R.raw.tsunade1);
        solutions.add(65,"Tsunade");
        sounds.add(65,soundTsunade1);
        final MediaPlayer soundYamato = MediaPlayer.create(this,R.raw.yamato1);
        solutions.add(66,"Yamato");
        sounds.add(66,soundYamato);
        final MediaPlayer soundYamato1 = MediaPlayer.create(this,R.raw.yamato2);
        solutions.add(67,"Yamato");
        sounds.add(67,soundYamato1);
        final MediaPlayer soundNaruto = MediaPlayer.create(this,R.raw.sexy);
        solutions.add(68,"Naruto");
        sounds.add(68,soundNaruto);
        final MediaPlayer soundNaruto1 = MediaPlayer.create(this,R.raw.kuchiyose);
        solutions.add(69,"Naruto");
        sounds.add(69,soundNaruto1);

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
                    Toast.makeText(GameNarutoNormal.this, "You must fill that field!", Toast.LENGTH_SHORT).show();
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
        AlertDialog.Builder builder = new AlertDialog.Builder(GameNarutoNormal.this);
        builder.setView(view);
        builder.setCancelable(false);
        AlertDialog dialog=builder.create();
        dialog.show();
        return dialog;
    }
}
