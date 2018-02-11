package com.example.android.udacityoscarsquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    /**
     * Declearing global variables
     */

    RadioButton rb1a, rb1b, rb1c, rb1d, rb2a, rb2b, rb2c, rb2d, rb3a, rb3b, rb3c, rb3d, rb4a, rb4b, rb4c, rb4d, rb5a, rb5b, rb5c, rb5d;
    int score = 0;
    EditText nameSpace;
    Button btnSubmit;
    RadioGroup rg1, rg2, rg3, rg4, rg5;


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
        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
        rg4 = findViewById(R.id.rg4);
        rg5 = findViewById(R.id.rg5);
        btnSubmit = findViewById(R.id.btnSubmit);



    }

    /**
     * Calculating the score
     */
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

        if (rb5a.isChecked()) {
            score++;
        }

        if (rb5b.isChecked()) {
            score++;
        }

        if (rb5c.isChecked()) {
            score++;
        }

        if (rb5d.isChecked()) {
            score++;
        }

        return score;

    }

    /**
     * Checks what RadioButton is clicked for question 4 and displays a Toast message accordingly
     */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rb5a:
                if (checked)
                    Toast.makeText(this, getString(R.string.toast_1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb5b:
                if (checked)
                    Toast.makeText(this, getString(R.string.toast_2), Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb5c:
                if (checked)
                    Toast.makeText(this, getString(R.string.toast_3), Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb5d:
                if (checked)
                    Toast.makeText(this, getString(R.string.toast_4), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     * Creates score message and displays it when clicked "Show Results" button
     */

    public void createScoreMessage(View view) {

        score = validate();
        TextView totalScore = findViewById(R.id.score_field);
        totalScore.setVisibility(View.VISIBLE);
        totalScore.setText(getString(R.string.score_text, score));
        if (score == 5) {
            Toast.makeText(this, getString(R.string.toast_5), Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, getString(R.string.toast_6), Toast.LENGTH_LONG).show();
        }

        btnSubmit.setVisibility(View.INVISIBLE);



    }
    /**
     * This method is called when the "Share Result" button is clicked
     */

    public void createShareMessage(View view) {

        String playerName = nameSpace.getText().toString();
        if (playerName.equals("")) {
            playerName = getString(R.string.dear_john);
        }
        String message = getString(R.string.shareMessage1) + playerName + getString(R.string.shareMessage2) + getString(R.string.score_text, score) + getString(R.string.shareMessage3);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.shareMessage4) + playerName);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }


    }
    /**
     * This method is called when the "Try Again" button is clicked.
     */

    public void  uncheckButtons(View view) {
        TextView totalScore = findViewById(R.id.score_field);
        totalScore.setVisibility(View.INVISIBLE);
        btnSubmit.setVisibility(View.VISIBLE);
        rg1.clearCheck();
        rg2.clearCheck();
        rg3.clearCheck();
        rg4.clearCheck();
        rg5.clearCheck();
        score = 0;


    }





}
