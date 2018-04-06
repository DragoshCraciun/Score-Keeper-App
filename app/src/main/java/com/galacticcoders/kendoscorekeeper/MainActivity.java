package com.galacticcoders.kendoscorekeeper;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.galacticcoders.kendoscorekeeper.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    float akaScore = 0;
    float shiroScore = 0;

    boolean changeColor = false;

    private static final String AKA_SCORE_KEY = "aka_score_key";
    private static final String SHIRO_SCORE_KEY = "shiro_score_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            akaScore = savedInstanceState.getFloat(AKA_SCORE_KEY);
            shiroScore = savedInstanceState.getFloat(SHIRO_SCORE_KEY);
            displayForAka((int) akaScore);
            displayForShiro((int) shiroScore);

        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putFloat(AKA_SCORE_KEY, akaScore);
        outState.putFloat(SHIRO_SCORE_KEY, shiroScore);
    }

    public void resetScore(View v) {
        akaScore = 0;
        shiroScore = 0;
        displayForAka((int) akaScore);
        displayForShiro((int) shiroScore);
        changeColor = true;

        Button btnAkaMen = (Button) findViewById(R.id.akaMen);
        btnAkaMen.setTextColor(Color.BLACK);
        Button btnAkaKote = (Button) findViewById(R.id.akaKote);
        btnAkaKote.setTextColor(Color.BLACK);
        Button btnAkaDo = (Button) findViewById(R.id.akaDo);
        btnAkaDo.setTextColor(Color.BLACK);
        Button btnAkaTsuki = (Button) findViewById(R.id.akaTsuki);
        btnAkaTsuki.setTextColor(Color.BLACK);
        Button btnAkaHansoku = (Button) findViewById(R.id.akaHansoku);
        btnAkaHansoku.setTextColor(Color.BLACK);
        Button btnShiroMen = (Button) findViewById(R.id.shiroMen);
        btnShiroMen.setTextColor(Color.BLACK);
        Button btnShiroKote = (Button) findViewById(R.id.shiroKote);
        btnShiroKote.setTextColor(Color.BLACK);
        Button btnShiroDo = (Button) findViewById(R.id.shiroDo);
        btnShiroDo.setTextColor(Color.BLACK);
        Button btnShiroTsuki = (Button) findViewById(R.id.shiroTsuki);
        btnShiroTsuki.setTextColor(Color.BLACK);
        Button btnShiroHansoku = (Button) findViewById(R.id.shiroHansoku);
        btnShiroHansoku.setTextColor(Color.BLACK);
    }

    /**
     * Aka Score.
     */

    public void addOneForAka(View v) {

        if (shiroScore == 2) {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();

        } else if (akaScore < 2) {
            akaScore = akaScore + 1;
            ((Button) v).setTextColor(Color.RED);
            displayForAka((int) akaScore);

            if (akaScore == 2) {
                Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
        }
    }

    public void addHalfForAka(View v) {

        if (shiroScore == 2) {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();

        } else if (akaScore < 2) {
            akaScore = akaScore + 0.5f;
            ((Button) v).setTextColor(Color.RED);
            displayForAka((int) akaScore);

            if (akaScore == 2) {
                Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Shiro Score.
     */
    public void addOneForShiro(View v) {

        if (akaScore == 2) {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();

        } else if (shiroScore < 2) {
            shiroScore = shiroScore + 1;
            ((Button) v).setTextColor(Color.RED);
            displayForShiro((int) shiroScore);

            if (shiroScore == 2) {
                Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
        }
    }

    public void addHalfForShiro(View v) {

        if (akaScore == 2) {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();

        } else if (shiroScore < 2) {
            shiroScore = shiroScore + 0.5f;
            ((Button) v).setTextColor(Color.RED);
            displayForShiro((int) shiroScore);

            if (shiroScore == 2) {
                Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Displays the given score for Aka.
     */
    public void displayForAka(int score) {
        TextView scoreView = (TextView) findViewById(R.id.aka_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Shiro.
     */
    public void displayForShiro(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shiro_score);
        scoreView.setText(String.valueOf(score));
    }
}
