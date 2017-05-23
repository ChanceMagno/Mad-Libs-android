package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView mNameTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String verb = intent.getStringExtra("verb");
        String noun = intent.getStringExtra("noun");
        mNameTextView = (TextView) findViewById(R.id.textView2);

        mNameTextView.setText(String.format("%s Went on a %s ride it was great until a wild dog came up to %s him in the face", name, noun, verb));
    }
}
