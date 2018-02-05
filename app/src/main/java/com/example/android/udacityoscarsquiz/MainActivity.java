package com.example.android.udacityoscarsquiz;

import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb1a, rb1b, rb1c, rb1d, rb2a, rb2b, rb2c, rb2d, rb3a, rb3b, rb3c, rb3d, rb4a, rb4b, rb4c, rb4d;
    int score = 0;
    EditText nameSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        RadioButton rb1a  =  findViewById(R.id.rb1a);
        RadioButton rb1b  =  findViewById(R.id.rb1b);
        RadioButton rb1c  =  findViewById(R.id.rb1c);
        RadioButton rb1d  =  findViewById(R.id.rb1d);
        RadioButton rb2a  =  findViewById(R.id.rb2a);
        RadioButton rb2b  =  findViewById(R.id.rb2b);
        RadioButton rb2c  =  findViewById(R.id.rb2c);
        RadioButton rb2d  =  findViewById(R.id.rb2d);
        RadioButton rb3a  =  findViewById(R.id.rb3a);
        RadioButton rb3b  =  findViewById(R.id.rb3b);
        RadioButton rb3c  =  findViewById(R.id.rb3c);
        RadioButton rb3d  =  findViewById(R.id.rb3d);
        RadioButton rb4a  =  findViewById(R.id.rb4a);
        RadioButton rb4b  =  findViewById(R.id.rb4b);
        RadioButton rb4c  =  findViewById(R.id.rb4c);
        RadioButton rb4d  =  findViewById(R.id.rb4d);
        final Typeface font = Typeface.createFromAsset(getResources().getAssets(), "courierprime.ttf");
        rb1a.setTypeface(font);
        rb1b.setTypeface(font);
        rb1c.setTypeface(font);
        rb1d.setTypeface(font);
        rb2a.setTypeface(font);
        rb2b.setTypeface(font);
        rb2c.setTypeface(font);
        rb2d.setTypeface(font);
        rb3a.setTypeface(font);
        rb3b.setTypeface(font);
        rb3c.setTypeface(font);
        rb3d.setTypeface(font);
        rb4a.setTypeface(font);
        rb4b.setTypeface(font);
        rb4c.setTypeface(font);
        rb4d.setTypeface(font);
        nameSpace = findViewById(R.id.name_space);



    }

    private int validate() {
        if (rb1c.isChecked()) {
            score++;
        }
        if (rb2a.isChecked()) {
            score++;
        }

        if (rb2b.isChecked()) {
            score++;
        }

        if (rb2c.isChecked()) {
            score++;
        }

        if (rb2d.isChecked()) {
            score++;
        }


        if (rb3b.isChecked()) {
            score++;
        }

        if (rb4a.isChecked()) {
            score++;
        }

//        Log.v("Main Activity", "Score is: " + score);
        return score;


    }
    public void createScoreMessage(View view) {

        score = validate();
        String playerName = nameSpace.getText().toString();
        if (playerName.equals("")) {
            playerName = getString(R.string.dear_john);
        }
        String message = playerName + "\nYour score is: " + score;
        TextView totalScore = findViewById(R.id.score_field);

//        totalScore.setText(getString(R.string.score_text));
        totalScore.setText(message);

    }






}
//java.lang.RuntimeException: Font asset not found courierprime.ttf
//RadioButton rb  = (RadioButton) findViewById(R.id.rb1a);
//    Typeface font = Typeface.createFromAsset(getAssets(), "font/courierprime.ttf");
//        rb.setTypeface(font);