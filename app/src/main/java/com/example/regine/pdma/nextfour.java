package com.example.regine.pdma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.github.pwittchen.swipe.library.Swipe;
import com.github.pwittchen.swipe.library.SwipeListener;

public class nextfour extends AppCompatActivity{

    private Swipe swipe;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.nextfour);

            swipe = new Swipe();
            swipe.addListener(new SwipeListener() {
                @Override
                public void onSwipingLeft(final MotionEvent event) {
                }

                @Override
                public void onSwipedLeft(final MotionEvent event) {

                }

                @Override
                public void onSwipingRight(MotionEvent event) {

                }

                @Override
                public void onSwipedRight(MotionEvent event) {

                    Intent intent = new Intent(nextfour.this, TodayActivity.class);
                    startActivity(intent);

                }

                @Override
                public void onSwipingUp(MotionEvent event) {

                }

                @Override
                public void onSwipedUp(MotionEvent event) {

                }

                @Override
                public void onSwipingDown(MotionEvent event) {

                }

                @Override
                public void onSwipedDown(MotionEvent event) {

                }
            });


            Button buttonMap = (Button) findViewById(R.id.buttonToday);
            buttonMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(nextfour.this, map.class);
                    startActivity(intent);
                }
            });

            Button buttonRate = (Button) findViewById(R.id.buttonRate);
            buttonRate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(nextfour.this, rate.class);
                    startActivity(intent);
                }
            });


        }

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }


    }

