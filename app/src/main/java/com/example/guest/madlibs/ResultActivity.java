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
        String storyType = intent.getStringExtra("storyType");
        mNameTextView = (TextView) findViewById(R.id.textView2);

        if(storyType.equals("adventure")){
            mNameTextView.setText(String.format("%s Went on a %s ride it was great until a wild dog came up to %s him in the face", name, noun, verb));
        } else {
            mNameTextView.setText(String.format("%s longed for their beloved partner after years apart. They bought a %s as a gift for their beloved to cherish forever. But upon receiving the gift their beloved %s it", name, noun, verb));
        }


    }
}
