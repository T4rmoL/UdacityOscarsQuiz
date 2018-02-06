package com.example.android.udacityoscarsquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1a, rb1b, rb1c, rb1d, rb2a, rb2b, rb2c, rb2d, rb3a, rb3b, rb3c, rb3d, rb4a, rb4b, rb4c, rb4d, rb5a, rb5b, rb5c, rb5d;
    int score = 0;
    Button btnSubmit, btnShare, btnTryAgain;
    EditText nameSpace;
    RadioGroup rg5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
         rb1a  =  findViewById(R.id.rb1a);
         rb1b  =  findViewById(R.id.rb1b);
         rb1c  =  findViewById(R.id.rb1c);
         rb1d  =  findViewById(R.id.rb1d);
         rb2a  =  findViewById(R.id.rb2a);
         rb2b  =  findViewById(R.id.rb2b);
         rb2c  =  findViewById(R.id.rb2c);
         rb2d  =  findViewById(R.id.rb2d);
         rb3a  =  findViewById(R.id.rb3a);
         rb3b  =  findViewById(R.id.rb3b);
         rb3c  =  findViewById(R.id.rb3c);
         rb3d  =  findViewById(R.id.rb3d);
         rb4a  =  findViewById(R.id.rb4a);
         rb4b  =  findViewById(R.id.rb4b);
         rb4c  =  findViewById(R.id.rb4c);
         rb4d  =  findViewById(R.id.rb4d);
        rb5a  =  findViewById(R.id.rb5a);
        rb5b  =  findViewById(R.id.rb5b);
        rb5c  =  findViewById(R.id.rb5c);
        rb5d  =  findViewById(R.id.rb5d);
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
        rb5a.setTypeface(font);
        rb5b.setTypeface(font);
        rb5c.setTypeface(font);
        rb5d.setTypeface(font);
        nameSpace = findViewById(R.id.name_space);
        rg5 = findViewById(R.id.rg5);



    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rb5a:
                if (checked)
                    Toast.makeText(this, "Tell me a person who doesn´t \nlike Meryl Streep", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rb5b:
                if (checked)
                    Toast.makeText(this, "He is The Man!!", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rb5c:
                if (checked)
                    Toast.makeText(this, "Really!? Animation figure!?", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rb5d:
                if (checked)
                    Toast.makeText(this, "Really!? Animation figure!?", Toast.LENGTH_SHORT).show();
                    break;
        }
    }

    private int validate() {
        if (rb1c.isChecked()) {
            score++;
        }

        if (rb2b.isChecked()) {
            score++;
        }

        if (rb3a.isChecked()) {
            score++;
        }

        if (rb4a.isChecked()) {
            score++;
        }

        if (rb4b.isChecked()) {
            score++;
        }

        if (rb4c.isChecked()) {
            score++;
        }

        if (rb4d.isChecked()) {
            score++;
        }

        Log.v("Main Activity", "Score is: " + score);
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
        totalScore.setText(message);
        totalScore.setText(getString(R.string.score_text, score));
//        if (score > 5) {
//            btnSubmit.setEnabled(false);
//        }


    }




}
//java.lang.RuntimeException: Font asset not found courierprime.ttf
//RadioButton rb  = (RadioButton) findViewById(R.id.rb1a);
//    Typeface font = Typeface.createFromAsset(getAssets(), "font/courierprime.ttf");
//        rb.setTypeface(font);