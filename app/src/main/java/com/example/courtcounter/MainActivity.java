package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase score by 3 and displays it for team A
     *
     * @param view
     */
    public void threePointTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase score by 2 and displays it for team A
     *
     * @param view
     */
    public void twoPointTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase score by 1 and displays it for team A
     *
     * @param view
     */
    public void onePointTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase score by 3 and displays it for team B
     *
     * @param view
     */
    public void threePointTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase score by 2 and displays it for team B
     *
     * @param view
     */
    public void twoPointTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Increase score by 1 and displays it for team B
     *
     * @param view
     */
    public void onePointTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets score to 0
     *
     * @param view
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Display value of score for team A
     *
     * @param score value after increasing
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display value of score for team B
     *
     * @param score value after increasing
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}