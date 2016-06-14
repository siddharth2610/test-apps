package com.example.android.court;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scorea=0;
    int scoreb=0;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teama);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamb(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamb);
        scoreView.setText(String.valueOf(score));
    }
    public void aadd3(View v)
    {
        scorea+=3;
        displayForTeamA(scorea);
    }
    public void aadd2(View v)
    {
        scorea+=2;
        displayForTeamA(scorea);
    }
    public void aadd1(View v)
    {
        scorea+=1;
        displayForTeamA(scorea);
    }
    public void badd3(View v)
    {
        scoreb+=3;
        displayForTeamb(scoreb);
    }
    public void badd2(View v)
    {
        scoreb+=2;
        displayForTeamb(scoreb);
    }
    public void badd1(View v)
    {
        scoreb+=1;
        displayForTeamb(scoreb);
    }
    public void reset(View v)
    {
        scorea=0;
        scoreb=0;
        displayForTeamb(scoreb);
        displayForTeamA(scorea);




    }
}
