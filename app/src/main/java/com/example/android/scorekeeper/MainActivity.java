package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int teamBScoreId = R.id.team_b_score;
    int teamAScoreId = R.id.team_a_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addEvenStrengthGoals(View view) {
        switch (view.getId()) {
            case R.id.add_a_even_goals:
                scoreTeamA = scoreTeamA + 1;
                displayScore(scoreTeamA, teamAScoreId);
                break;
            case R.id.add_b_even_goals:
                scoreTeamB = scoreTeamB + 1;
                displayScore(scoreTeamB, teamBScoreId);
                break;
            default:
                Log.e("addEvenStrengthGoals", "Cannot find button");
        }
    }

    public void addPowerPlayGoal(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScore(scoreTeamA, teamAScoreId);
    }

    public void addShortHandedGoal(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScore(scoreTeamA, teamAScoreId);
    }

    public void displayScore(int score, int sourceId) {
        TextView scoreView = (TextView) findViewById(sourceId);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScore(scoreTeamA, teamAScoreId);
        displayScore(scoreTeamB, teamBScoreId);
    }
}
