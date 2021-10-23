package com.example.my_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private TextView playerOneScore,playerTwoScore,playerStatus;
    private Button [] buttons=new Button[9];
    private Button resetGame;
    private int playerOneScoreCount,playerTwoScoreCount,roundCount;
    boolean activePlayer;
    //p1 =>1
    //p2=>2
    //empty =>2
    int [] gameState={2,2,2,2,2,2,2,2,2,};
    int [][] winningPositions=
            {
                    {0,1,2},{3,4,5},{6,7,8} ,//rows
                    {0,3,6},{1,4,7},{2,5,8}, //columns
                    {0,4,8},{2,4,6}
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerOneScore=(TextView) findViewById(R.id.playerOneScore);
        playerTwoScore=(TextView) findViewById(R.id.playerTwoScore);
        playerStatus=(TextView) findViewById(R.id.playerStatus);

        resetGame=(Button) findViewById(R.id.resetGame);


        for(int i=0;i< buttons.length;i++)
        {
            String buttonId="btn_"+i;

            int resourceId=getResources().getIdentifier(buttonId,  "id",getPackageName());
            buttons[i]=(Button)findViewById(resourceId);
            buttons[i].setOnClickListener(this);
        }
        roundCount=0;
        playerOneScoreCount=0;
        playerTwoScoreCount=0;
        activePlayer=true;
    }

    @Override
    public void onClick(View v) {
        if(!((Button)v).getText().toString().equals(""))
        {
            return;
        }


    }
}