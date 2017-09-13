package com.example.liu.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button aButton,bButton,cButton,dButton,eButton,fButton,gButton,highaButton,highbButton,highcButton,bbButton,csButton,dsButton,fsButton,gsButton,highbbButton,highcsButton,highdButton,highdsButton,higheButton,highfButton,highfsButton,highgButton,highgsButton,tsButton;
    private MediaPlayer aNote,bNote,cNote,dNote,eNote,fNote,gNote,highaNote,highbNote,highcNote,bbNote,csNote,dsNote,fsNOte,gsNote,highbbNote,highcsNote,highdNote,highdsNote,higheNote,highfNote,highfsNote,highgNote,highgsNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        createMediaPlayer();
        setListeners();
    }
    //hello
    private void setListeners() {
        aButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        highaButton.setOnClickListener(this);
        highbButton.setOnClickListener(this);
        highcButton.setOnClickListener(this);
        higheButton.setOnClickListener(this);
        highfsButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
    }

    private void createMediaPlayer() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        highaNote = MediaPlayer.create(this, R.raw.scalehigha);
        highbNote = MediaPlayer.create(this, R.raw.scalehighb);
        highcNote = MediaPlayer.create(this, R.raw.scalehighc);
        higheNote = MediaPlayer.create(this, R.raw.scalehighe);
        highfsNote = MediaPlayer.create(this, R.raw.scalehighfs);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_A);
        bButton = (Button) findViewById(R.id.button_B);
        cButton = (Button) findViewById(R.id.button_C);
        dButton = (Button) findViewById(R.id.button_D);
        eButton = (Button) findViewById(R.id.button_E);
        fButton = (Button) findViewById(R.id.button_F);
        gButton = (Button) findViewById(R.id.button_G);
        highaButton = (Button) findViewById(R.id.button_HA);
        highbButton = (Button) findViewById(R.id.button_HB);
        highcButton = (Button) findViewById(R.id.button_HC);
        tsButton = (Button) findViewById(R.id.button_TS);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button_A:
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_B:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_C:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_D:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_E:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_F:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_G:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_HA:
                highaNote.seekTo(0);
                highaNote.start();
                break;
            case R.id.button_HB:
                highbNote.seekTo(0);
                highbNote.start();
                break;
            case R.id.button_HC:
                highcNote.seekTo(0);
                highcNote.start();
                break;
            case R.id.button_TS:
                aNote.seekTo(0);
                aNote.start();
                aNote.seekTo(0);
                aNote.start();
                higheNote.seekTo(0);
                higheNote.start();
                higheNote.seekTo(0);
                higheNote.start();
                highfsNote.seekTo(0);
                highfsNote.start();
                highfsNote.seekTo(0);
                highfsNote.start();
                higheNote.seekTo(0);
                higheNote.start();
                dNote.seekTo(0);
                dNote.start();
                dNote.seekTo(0);
                dNote.start();
                csNote.seekTo(0);
                csNote.start();
                bNote.seekTo(0);
                bNote.start();
                bNote.seekTo(0);
                bNote.start();
                aNote.seekTo(0);
                aNote.start();
                break;
        }
    }
}
