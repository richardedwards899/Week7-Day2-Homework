package com.codeclan.example.week7_day2_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText user_text;
    private Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates the links between the interface fields and our objects
        user_text = (EditText) findViewById(R.id.user_text);
        countButton = (Button) findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button){

        Log.d(getClass().toString(), "countButton clicked!");
        String text = user_text.getText().toString();
        Log.d(getClass().toString(), "The text entered was: "+ text);

        WordCounting counter = new WordCounter();
        int wordCount = counter.countWordsIn(text);

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("count", wordCount);
        startActivity(intent);
    }
}
