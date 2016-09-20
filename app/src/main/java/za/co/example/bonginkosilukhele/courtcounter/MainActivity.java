package za.co.example.bonginkosilukhele.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int home_score=0;
    int away_score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void add3Home(View view){
            home_score+=3;
            displayHomeScore(home_score);
    }
        public void add3Away(View view){
            away_score+=3;
            displayAwayScore(away_score);}

        public void add2Home(View view){
            home_score+=2;
            displayHomeScore(home_score);
        }
        public void add2Away(View view){
            away_score+=2;
            displayAwayScore(away_score);}

        public void add1Home(View view){
            home_score+=1;
            displayHomeScore(home_score);
        }
        public void add1Away(View view){
            away_score+=1;
            displayAwayScore(away_score);}

        public void displayHomeScore (int viw){
            TextView score = (TextView) findViewById(R.id.home_score_txtvw);
            score.setText(String.valueOf(viw));
        }

        public void displayAwayScore (int viw){
            TextView score = (TextView) findViewById(R.id.away_score_txtvw);
            score.setText(String.valueOf(viw));
            }
    public void resetScore(View view){

        displayHomeScore(0);
        displayAwayScore(0);
    }
}
