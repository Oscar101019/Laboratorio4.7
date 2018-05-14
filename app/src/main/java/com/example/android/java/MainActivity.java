package com.example.android.java;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.*;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private RelativeLayout canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
        canvas = (RelativeLayout) findViewById(R.id.animationCanvas);
    }

    public void onButtonClick(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = -(screenHeight - imageView.getHeight());

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, "translationY", 0f, targetY)
                .setDuration(1000);
        animator.setInterpolator(new BounceInterpolator());
        animator.start();


    }

    public void onButtonClick2(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getHeight();

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(
                imageView, "alpha", 0, targetY)
                .setDuration(3000);
        animator2.setInterpolator(new DecelerateInterpolator());
        animator2.start();

    }

    public void onButtonClick3(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getHeight();

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(
                imageView, "alpha", 0, targetY)
                .setDuration(3000);
        animator2.setInterpolator(new CycleInterpolator(2));
        animator2.start();

    }



}