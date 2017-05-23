package com.codeclan.example.week7_day2_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    private TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        //my stuff goes in here...
        answerText = (TextView) findViewById(R.id.answer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int count = extras.getInt("count");
        String displayText = "Your text totalled "+count+" words!";

        answerText.setText(displayText);

    }
}
