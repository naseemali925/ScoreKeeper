package ali.naseem.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView teamA,teamB;
    private Button pointer3A,pointer3B,pointer2A,pointer2B,declareWinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamA=findViewById(R.id.teamA);
        teamB=findViewById(R.id.teamB);
        pointer3A=findViewById(R.id.pointerA3);
        pointer3B=findViewById(R.id.pointerB3);
        pointer2A=findViewById(R.id.pointerA2);
        pointer2B=findViewById(R.id.pointerB2);
        declareWinner=findViewById(R.id.declareWinner);
        pointer3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamA.setText(String.valueOf(Integer.parseInt(teamA.getText().toString())+3));
            }
        });

        pointer3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamB.setText(String.valueOf(Integer.parseInt(teamB.getText().toString())+3));
            }
        });

        pointer2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamA.setText(String.valueOf(Integer.parseInt(teamA.getText().toString())+2));
            }
        });

        pointer2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamB.setText(String.valueOf(Integer.parseInt(teamB.getText().toString())+2));
            }
        });
        declareWinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scoreA=Integer.parseInt(teamA.getText().toString());
                int scoreB=Integer.parseInt(teamB.getText().toString());
                if(scoreA>scoreB){
                    Toast.makeText(MainActivity.this, "Team A Wins", Toast.LENGTH_SHORT).show();
                }else if(scoreB>scoreA){
                    Toast.makeText(MainActivity.this, "Team B Wins", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Match Draw", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
