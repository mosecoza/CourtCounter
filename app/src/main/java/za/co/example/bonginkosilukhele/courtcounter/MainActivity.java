package za.co.example.bonginkosilukhele.courtcounter;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    int home_score=0;
    int away_score=0;
    private static final String FORMAT = "%02d:%02d:%02d";
    TextView text1;
    int seconds , minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=(TextView)findViewById(R.id.tv_timer);
        new CountDownTimer(1234000, 300) {
            @Override
            public void onTick(long millisUntilFinished) {
                text1.setText(""+String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));

            }

            @Override
            public void onFinish() {
                text1.setText("done!");
            } // adjust the milli seconds here
        }.start();
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
