package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int ppgTeamA = 0;
    int shgTeamA = 0;
    int teamAScoreId = R.id.team_a_score;
    int teamAPpgId = R.id.team_a_pp_goals;
    int teamAShgId = R.id.team_a_sh_goals;

    int scoreTeamB = 0;
    int ppgTeamB = 0;
    int shgTeamB = 0;
    int teamBScoreId = R.id.team_b_score;
    int teamBPpgId = R.id.team_b_pp_goals;
    int teamBShgId = R.id.team_b_sh_goals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addEvenStrengthGoals(View view) {
        switch (view.getId()) {
            case R.id.add_a_even_goal:
                scoreTeamA = scoreTeamA + 1;
                displayScore(scoreTeamA, teamAScoreId);
                break;
            case R.id.add_b_even_goal:
                scoreTeamB = scoreTeamB + 1;
                displayScore(scoreTeamB, teamBScoreId);
                break;
            default:
                Log.e("addEvenStrengthGoals", "Cannot find button");
        }
    }

    public void addPowerPlayGoal(View view) {
        switch (view.getId()) {
            case R.id.add_a_pp_goal:
                scoreTeamA = scoreTeamA + 1;
                ppgTeamA = ppgTeamA + 1;
                Log.i("goals", "" + scoreTeamA);
                displayScore(scoreTeamA, teamAScoreId);
                displayPowerPlayGoals(ppgTeamA, teamAPpgId);
                break;
            case R.id.add_b_pp_goal:
                scoreTeamB = scoreTeamB + 1;
                ppgTeamB = ppgTeamB + 1;
                displayScore(scoreTeamB, teamBScoreId);
                displayPowerPlayGoals(ppgTeamB, teamBPpgId);
                break;
            default:
                Log.e("addPowerPlayGoals", "Cannot find button");
        }
    }

    public void addShortHandedGoal(View view) {
        switch (view.getId()) {
            case R.id.add_a_sh_goal:
                scoreTeamA = scoreTeamA + 1;
                shgTeamA = shgTeamA + 1;
                displayScore(scoreTeamA, teamAScoreId);
                displayPowerPlayGoals(shgTeamA, teamAShgId);
                break;
            case R.id.add_b_sh_goal:
                scoreTeamB = scoreTeamB + 1;
                shgTeamB = shgTeamB + 1;
                displayScore(scoreTeamB, teamBScoreId);
                displayPowerPlayGoals(shgTeamB, teamBShgId);
                break;
            default:
                Log.e("addPowerPlayGoals", "Cannot find button");
        }
    }

    public void displayScore(int score, int sourceId) {
        TextView scoreView = (TextView) findViewById(sourceId);
        scoreView.setText(String.valueOf(score));

    }

    public void displayPowerPlayGoals(int ppg, int sourceId) {
        TextView scoreView = (TextView) findViewById(sourceId);
        scoreView.setText(String.valueOf(ppg));
    }

    public void displayShortHandedGoals(int shg, int sourceId) {
        TextView scoreView = (TextView) findViewById(sourceId);
        scoreView.setText(String.valueOf(shg));
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        ppgTeamA = 0;
        ppgTeamB = 0;
        shgTeamA = 0;
        shgTeamB = 0;
        displayScore(scoreTeamA, teamAScoreId);
        displayPowerPlayGoals(ppgTeamA, teamAPpgId);
        displayShortHandedGoals(shgTeamA, teamAShgId);
        displayScore(scoreTeamB, teamBScoreId);
        displayPowerPlayGoals(ppgTeamB, teamBPpgId);
        displayShortHandedGoals(shgTeamB, teamBShgId);
    }
}
