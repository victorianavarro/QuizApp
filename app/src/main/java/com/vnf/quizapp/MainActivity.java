package com.vnf.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] viewsIds = new int[]{R.id.question1, R.id.question2, R.id.question3, R.id.question4, R.id.question5, R.id.question6, R.id.question7, R.id.question8, R.id.question9, R.id.question10, R.id.question11};
    int[] buttonsIds = new int[]{R.id.beforeButton, R.id.nextButton};
    int questionId = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAllInvisible();
        setFirstQuestion();
    }

    public void before(View view) {
        if (questionId > 0) {
            // Make current view invisible
            setCurrentViewInvisible(questionId);
            // Make previous view visible
            questionId = questionId - 1;
            setViewVisible(questionId);
        }
    }


    public void next(View view) {
        if (questionId < 9) {
            //Make current view invisible
            setCurrentViewInvisible(questionId);
            questionId = questionId + 1;
            //Make next view visible
            setViewVisible(questionId);
        } else {
            setAllInvisible();
            hideButtons();
            displayMessage(score);

        }
    }

    private void displayMessage(int totalScore){

        TextView quantityTextView = (TextView) findViewById(R.id.scoreText);
        quantityTextView.setText("There are no more questions. Your total score is: " + totalScore + " of 10!");

        findViewById(viewsIds[viewsIds.length - 1]).setVisibility(View.VISIBLE);
        //Toast.makeText(MainActivity.this,
                //"There are no more questions. Your score is" + score, Toast.LENGTH_LONG).show();

    }

    private void setCurrentViewInvisible(int viewId) {
        findViewById(viewsIds[viewId]).setVisibility(View.INVISIBLE);
    }

    private void setViewVisible(int viewId) {
        findViewById(viewsIds[viewId]).setVisibility(View.VISIBLE);
    }

    private void setAllInvisible() {
        for (int i = 0; i < viewsIds.length; i++) {
            findViewById(viewsIds[i]).setVisibility(View.INVISIBLE);
        }
    }

    private void hideButtons() {
        for (int i = 0; i < buttonsIds.length; i++) {
            findViewById(buttonsIds[i]).setVisibility(View.INVISIBLE);
        }
    }

    private void setFirstQuestion() {
        findViewById(viewsIds[0]).setVisibility(View.VISIBLE);
    }


    public void verifyQuestionOneAnswers(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        String right = "Correct!";
        String wrong = "Sorry. The right answer is 2x2x2x2.";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerAQuestion1:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerBQuestion1:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerCQuestion1:
                if (checked) {
                    Toast.makeText(MainActivity.this,
                            right, Toast.LENGTH_LONG).show();
                    score = score + 1;
                }
                break;
            case R.id.answerDQuestion1:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
        }

    }

    public void verifyQuestionTwoAnswers(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        String right = "Correct!";
        String wrong = "Sorry. The right answer is (6,3).";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerAQuestion2:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerBQuestion2:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerCQuestion2:
                if (checked) {
                    Toast.makeText(MainActivity.this,
                            right, Toast.LENGTH_LONG).show();
                    score = score + 1;
                }
                break;
            case R.id.answerDQuestion2:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void verifyQuestionThreeAnswers(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        String right = "Correct!";
        String wrong = "Sorry. The right answer is 98.614.";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerAQuestion3:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerBQuestion3:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerCQuestion3:
                if (checked) {
                    Toast.makeText(MainActivity.this,
                            right, Toast.LENGTH_LONG).show();
                    score = score + 1;
                }
                break;
            case R.id.answerDQuestion3:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void verifyQuestionFourAnswers(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        String right = "Correct!";
        String wrong = "Sorry. The right answer is 84.";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerAQuestion4:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerBQuestion4:
                if (checked) {
                    Toast.makeText(MainActivity.this,
                            right, Toast.LENGTH_LONG).show();
                    score = score + 1;
                }
                break;
            case R.id.answerCQuestion4:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerDQuestion4:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void verifyQuestionFiveAnswers(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        String right = "Correct!";
        String wrong = "Sorry. The right answer is 11/25 + 13/40 = 153/200.";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerAQuestion5:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerBQuestion5:
                if (checked) {
                    Toast.makeText(MainActivity.this,
                            right, Toast.LENGTH_LONG).show();
                    score = score + 1;
                }
                break;
            case R.id.answerCQuestion5:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerDQuestion5:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void verifyQuestionSixAnswers(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        String right = "Correct!";
        String wrong = "Sorry. The right answer is 135.";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerAQuestion6:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerBQuestion6:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerCQuestion6:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerDQuestion6:
                if (checked) {
                    Toast.makeText(MainActivity.this,
                            right, Toast.LENGTH_LONG).show();
                    score = score + 1;
                }
                break;
        }
    }

    public void verifyQuestionSevenAnswers(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        String right = "Correct!";
        String wrong = "Sorry. The right answer is 2000 seconds.";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerAQuestion7:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerBQuestion7:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerCQuestion7:
                if (checked) {
                    Toast.makeText(MainActivity.this,
                            right, Toast.LENGTH_LONG).show();
                    score = score + 1;
                }
                break;
            case R.id.answerDQuestion7:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void verifyQuestionEightAnswers(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        String right = "Correct!";
        String wrong = "Sorry. The right answer is 140, 928.";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerAQuestion8:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerBQuestion8:
                if (checked) {
                    Toast.makeText(MainActivity.this,
                            right, Toast.LENGTH_LONG).show();
                    score = score + 1;
                }
                break;
            case R.id.answerCQuestion8:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerDQuestion8:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void verifyQuestionNineAnswers(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        String right = "Correct!";
        String wrong = "Sorry. The right answer is 85%.";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerAQuestion9:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerBQuestion9:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerCQuestion9:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerDQuestion9:
                if (checked) {
                    Toast.makeText(MainActivity.this,
                            right, Toast.LENGTH_LONG).show();
                    score = score + 1;
                }
                break;
        }
    }

    public void verifyQuestionTenAnswers(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        String right = "Correct!";
        String wrong = "Sorry. The right answer is 5.";
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerAQuestion10:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerBQuestion10:
                if (checked) {
                    Toast.makeText(MainActivity.this,
                            right, Toast.LENGTH_LONG).show();
                    score = score + 1;
                }
                break;
            case R.id.answerCQuestion10:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
            case R.id.answerDQuestion10:
                if (checked)
                    Toast.makeText(MainActivity.this,
                            wrong, Toast.LENGTH_LONG).show();
                break;
        }
    }
}
