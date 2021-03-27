package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String message;

    /** +3 points for Team A
     */
    public void points3ForTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /** +2 points for Team A
     */
    public void points2ForTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /** +1 points for Team A
     */
    public void points1ForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /** +3 points for Team B
     */
    public void points3ForTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /** +2 points for Team B
     */
    public void points2ForTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /** +1 points for Team B
     */
    public void points1ForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**Comparing score
     */
    public void winner(View view){
        if(scoreTeamA > scoreTeamB){
            message = "Winner is Team A with score : "+scoreTeamA;
            displayWinner(message);
        }
        else if(scoreTeamB > scoreTeamA){
            message = "Winner is Team B with score : "+scoreTeamB;
            displayWinner(message);
        }
        else{
            message = "Match Tied with both team scores : "+scoreTeamA;
            displayWinner(message);
        }
    }
    /** Makes score 0
     */
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        message = "Winner is !";
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayWinner(message);
    }
    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays Winner Team
     */
    private void displayWinner(String message){
        TextView compareTextView = (TextView) findViewById(R.id.winner_text_view);
        compareTextView.setText(message);
    }
}