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

/**
 * This app is a score keeper counter.
 */

public class MainActivity extends AppCompatActivity {

    //float variable for score keeping.
    float akaScore = 0;
    float shiroScore = 0;

    //integer variables for changing text color.
    int changeColorAkaMen = 0;
    int changeColorAkaKote = 0;
    int changeColorAkaDo = 0;
    int changeColorAkaTsuki = 0;
    int changeColorAkaHansoku = 0;
    int changeColorShiroMen = 0;
    int changeColorShiroKote = 0;
    int changeColorShiroDo = 0;
    int changeColorShiroTsuki = 0;
    int changeColorShiroHansoku = 0;

    //strings for storing variables.
    private static final String AKA_SCORE_KEY = "aka_score_key";
    private static final String SHIRO_SCORE_KEY = "shiro_score_key";
    private static final String CHANGE_COLOR_KEY_AKA_MEN = "change_color_key_aka_men";
    private static final String CHANGE_COLOR_KEY_AKA_KOTE = "change_color_key_aka_kote";
    private static final String CHANGE_COLOR_KEY_AKA_DO = "change_color_key_aka_do";
    private static final String CHANGE_COLOR_KEY_AKA_TSUKI = "change_color_key_aka_tsuki";
    private static final String CHANGE_COLOR_KEY_AKA_HANSOKU = "change_color_key_aka_hansoku";
    private static final String CHANGE_COLOR_KEY_SHIRO_MEN = "change_color_key_shiro_men";
    private static final String CHANGE_COLOR_KEY_SHIRO_KOTE = "change_color_key_shiro_kote";
    private static final String CHANGE_COLOR_KEY_SHIRO_DO = "change_color_key_shiro_do";
    private static final String CHANGE_COLOR_KEY_SHIRO_TSUKI = "change_color_key_shiro_tsuki";
    private static final String CHANGE_COLOR_KEY_SHIRO_HANSOKU = "change_color_key_shiro_hansoku";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {

            //define the variables from the strings.
            akaScore = savedInstanceState.getFloat(AKA_SCORE_KEY);
            shiroScore = savedInstanceState.getFloat(SHIRO_SCORE_KEY);
            changeColorAkaMen = savedInstanceState.getInt(CHANGE_COLOR_KEY_AKA_MEN);
            changeColorAkaKote = savedInstanceState.getInt(CHANGE_COLOR_KEY_AKA_KOTE);
            changeColorAkaDo = savedInstanceState.getInt(CHANGE_COLOR_KEY_AKA_DO);
            changeColorAkaTsuki = savedInstanceState.getInt(CHANGE_COLOR_KEY_AKA_TSUKI);
            changeColorAkaHansoku = savedInstanceState.getInt(CHANGE_COLOR_KEY_AKA_HANSOKU);
            changeColorShiroMen = savedInstanceState.getInt(CHANGE_COLOR_KEY_SHIRO_MEN);
            changeColorShiroKote = savedInstanceState.getInt(CHANGE_COLOR_KEY_SHIRO_KOTE);
            changeColorShiroDo = savedInstanceState.getInt(CHANGE_COLOR_KEY_SHIRO_DO);
            changeColorShiroTsuki = savedInstanceState.getInt(CHANGE_COLOR_KEY_SHIRO_TSUKI);
            changeColorShiroHansoku = savedInstanceState.getInt(CHANGE_COLOR_KEY_SHIRO_HANSOKU);

            //display score onCreate.
            displayForAka((int) akaScore);
            displayForShiro((int) shiroScore);

            /**
             * Check which integer is 1 and set the text color to red.
             */

            switch (changeColorAkaMen) {
                case 1:
                    Button ippon = findViewById(R.id.akaMen);
                    ippon.setTextColor(Color.RED);
            }

            switch (changeColorAkaKote) {
                case 1:
                    Button ippon = findViewById(R.id.akaKote);
                    ippon.setTextColor(Color.RED);
            }

            switch (changeColorAkaDo) {
                case 1:
                    Button ippon = findViewById(R.id.akaDo);
                    ippon.setTextColor(Color.RED);
            }

            switch (changeColorAkaTsuki) {
                case 1:
                    Button ippon = findViewById(R.id.akaTsuki);
                    ippon.setTextColor(Color.RED);
            }

            switch (changeColorAkaHansoku) {
                case 1:
                    Button ippon = findViewById(R.id.akaHansoku);
                    ippon.setTextColor(Color.RED);
            }

            switch (changeColorShiroMen) {
                case 1:
                    Button ippon = findViewById(R.id.shiroMen);
                    ippon.setTextColor(Color.RED);
            }

            switch (changeColorShiroKote) {
                case 1:
                    Button ippon = findViewById(R.id.shiroKote);
                    ippon.setTextColor(Color.RED);
            }

            switch (changeColorShiroDo) {
                case 1:
                    Button ippon = findViewById(R.id.shiroDo);
                    ippon.setTextColor(Color.RED);
            }

            switch (changeColorShiroTsuki) {
                case 1:
                    Button ippon = findViewById(R.id.shiroDo);
                    ippon.setTextColor(Color.RED);
            }

            switch (changeColorShiroHansoku) {
                case 1:
                    Button ippon = findViewById(R.id.shiroHansoku);
                    ippon.setTextColor(Color.RED);
            }

        }
    }

    /**
     * This method is called before the app is destroyed in order to save the
     * variable into strings.
     *
     * @param outState saves the variable into string
     */

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putFloat(AKA_SCORE_KEY, akaScore);
        outState.putFloat(SHIRO_SCORE_KEY, shiroScore);
        outState.putInt(CHANGE_COLOR_KEY_AKA_MEN, changeColorAkaMen);
        outState.putInt(CHANGE_COLOR_KEY_AKA_KOTE, changeColorAkaKote);
        outState.putInt(CHANGE_COLOR_KEY_AKA_DO, changeColorAkaDo);
        outState.putInt(CHANGE_COLOR_KEY_AKA_TSUKI, changeColorAkaTsuki);
        outState.putInt(CHANGE_COLOR_KEY_AKA_HANSOKU, changeColorAkaHansoku);
        outState.putInt(CHANGE_COLOR_KEY_SHIRO_MEN, changeColorShiroMen);
        outState.putInt(CHANGE_COLOR_KEY_SHIRO_KOTE, changeColorShiroKote);
        outState.putInt(CHANGE_COLOR_KEY_SHIRO_DO, changeColorShiroDo);
        outState.putInt(CHANGE_COLOR_KEY_SHIRO_TSUKI, changeColorShiroTsuki);
        outState.putInt(CHANGE_COLOR_KEY_SHIRO_HANSOKU, changeColorShiroHansoku);

    }

    /**
     * This method is called when the reset button is pressed.
     *
     * @param v
     */

    public void resetScore(View v) {

        //set score to 0 and then display it.
        akaScore = 0;
        shiroScore = 0;
        displayForAka((int) akaScore);
        displayForShiro((int) shiroScore);

        //set all integers to zero.
        changeColorAkaMen = 0;
        changeColorAkaKote = 0;
        changeColorAkaDo = 0;
        changeColorAkaTsuki = 0;
        changeColorAkaHansoku = 0;
        changeColorShiroMen = 0;
        changeColorShiroKote = 0;
        changeColorShiroDo = 0;
        changeColorShiroTsuki = 0;
        changeColorShiroHansoku = 0;

        //change all text color to black
        Button btnAkaMen = findViewById(R.id.akaMen);
        btnAkaMen.setTextColor(Color.BLACK);
        Button btnAkaKote = findViewById(R.id.akaKote);
        btnAkaKote.setTextColor(Color.BLACK);
        Button btnAkaDo = findViewById(R.id.akaDo);
        btnAkaDo.setTextColor(Color.BLACK);
        Button btnAkaTsuki = findViewById(R.id.akaTsuki);
        btnAkaTsuki.setTextColor(Color.BLACK);
        Button btnAkaHansoku = findViewById(R.id.akaHansoku);
        btnAkaHansoku.setTextColor(Color.BLACK);
        Button btnShiroMen = findViewById(R.id.shiroMen);
        btnShiroMen.setTextColor(Color.BLACK);
        Button btnShiroKote = findViewById(R.id.shiroKote);
        btnShiroKote.setTextColor(Color.BLACK);
        Button btnShiroDo = findViewById(R.id.shiroDo);
        btnShiroDo.setTextColor(Color.BLACK);
        Button btnShiroTsuki = findViewById(R.id.shiroTsuki);
        btnShiroTsuki.setTextColor(Color.BLACK);
        Button btnShiroHansoku = findViewById(R.id.shiroHansoku);
        btnShiroHansoku.setTextColor(Color.BLACK);
    }

    /**
     * Aka Score.
     */

    /**
     * This method is called when the Men button for Aka is pressed
     */

    public void addOneForAkaMen(View v) {

        if (shiroScore == 2) {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();

        } else if (akaScore < 2) {
            akaScore = akaScore + 1;
            changeColorAkaMen = 1;
            ((Button) v).setTextColor(Color.RED);
            displayForAka((int) akaScore);

            if (akaScore >= 2) {
                Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the Kote button for Aka is pressed
     */

    public void addOneForAkaKote(View v) {

        if (shiroScore == 2) {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();

        } else if (akaScore < 2) {
            akaScore = akaScore + 1;
            changeColorAkaKote = 1;
            ((Button) v).setTextColor(Color.RED);
            displayForAka((int) akaScore);

            if (akaScore >= 2) {
                Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the Do button for Aka is pressed
     */

    public void addOneForAkaDo(View v) {

        if (shiroScore == 2) {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();

        } else if (akaScore < 2) {
            akaScore = akaScore + 1;
            changeColorAkaDo = 1;
            ((Button) v).setTextColor(Color.RED);
            displayForAka((int) akaScore);

            if (akaScore >= 2) {
                Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the Tsuki button for Aka is pressed
     */

    public void addOneForAkaTsuki(View v) {

        if (shiroScore == 2) {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();

        } else if (akaScore < 2) {
            akaScore = akaScore + 1;
            changeColorAkaTsuki = 1;
            ((Button) v).setTextColor(Color.RED);
            displayForAka((int) akaScore);

            if (akaScore >= 2) {
                Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the Hansoku button of Aka is pressed
     */

    public void addHalfForAka(View v) {

        if (shiroScore == 2) {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();

        } else if (akaScore < 2) {
            akaScore = akaScore + 0.5f;
            changeColorAkaHansoku = 1;
            ((Button) v).setTextColor(Color.RED);
            displayForAka((int) akaScore);

            if (akaScore >= 2) {
                Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Shiro Score.
     */

    /**
     * This method is called when the Men button for Shiro is pressed
     */

    public void addOneForShiroMen(View v) {

        if (akaScore == 2) {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();

        } else if (shiroScore < 2) {
            shiroScore = shiroScore + 1;
            changeColorShiroMen = 1;
            ((Button) v).setTextColor(Color.RED);
            displayForShiro((int) shiroScore);

            if (shiroScore >= 2) {
                Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the Kote button for Shiro is pressed
     */

    public void addOneForShiroKote(View v) {

        if (akaScore == 2) {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();

        } else if (shiroScore < 2) {
            shiroScore = shiroScore + 1;
            changeColorShiroKote = 1;
            ((Button) v).setTextColor(Color.RED);
            displayForShiro((int) shiroScore);

            if (shiroScore >= 2) {
                Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the Do button for Shiro is pressed
     */

    public void addOneForShiroDo(View v) {

        if (akaScore == 2) {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();

        } else if (shiroScore < 2) {
            shiroScore = shiroScore + 1;
            changeColorShiroDo = 1;
            ((Button) v).setTextColor(Color.RED);
            displayForShiro((int) shiroScore);

            if (shiroScore >= 2) {
                Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the Tsuki button for Shiro is pressed
     */

    public void addOneForShiroTsuki(View v) {

        if (akaScore == 2) {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();

        } else if (shiroScore < 2) {
            shiroScore = shiroScore + 1;
            changeColorShiroTsuki = 1;
            ((Button) v).setTextColor(Color.RED);
            displayForShiro((int) shiroScore);

            if (shiroScore >= 2) {
                Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "SHIRO Won!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is called when the Hansoku button of Shiro is pressed
     */

    public void addHalfForShiro(View v) {

        if (akaScore == 2) {
            Toast.makeText(this, "AKA Won!", Toast.LENGTH_SHORT).show();

        } else if (shiroScore < 2) {
            shiroScore = shiroScore + 0.5f;
            changeColorShiroHansoku = 1;
            ((Button) v).setTextColor(Color.RED);
            displayForShiro((int) shiroScore);

            if (shiroScore >= 2) {
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
