package com.example.regine.pdma;

import android.content.Intent;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface;

public class rate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        Button buttonToday = (Button) findViewById(R.id.buttonToday);
        buttonToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (rate.this,TodayActivity.class);
                startActivity(intent);
            }
        });

        Button buttonMap = (Button) findViewById(R.id.buttonMap);
        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (rate.this,map.class);
                startActivity(intent);
            }
        });



        Button facebook = (Button) findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(rate.this).create();
                alertDialog.setTitle("Thank You for your feedback");
                alertDialog.setMessage("You have shared this to your wall \n" +
                        "Please continue to support us!  \n" );

                alertDialog.setButton("Dismiss Message", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialog.show();
            }
        });

        Button twitter = (Button) findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(rate.this).create();
                alertDialog.setTitle("Thank You for your feedback");
                alertDialog.setMessage("You have tweeted this to your wall \n" +
                        "Please continue to support us!  \n" );

                alertDialog.setButton("Dismiss Message", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialog.show();
            }
        });

    }
}
