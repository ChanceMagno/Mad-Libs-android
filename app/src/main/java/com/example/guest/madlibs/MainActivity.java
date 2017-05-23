package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.submitButton)
    Button mSubmitButton;
    @Bind(R.id.editTextName)
    EditText mName;
    @Bind(R.id.editTextVerb)
    EditText mVerb;
    @Bind(R.id.editTextNoun)
    EditText mNoun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        String name = mName.getText().toString();
        String verb = mVerb.getText().toString();
        String noun = mNoun.getText().toString();
        if (noun.equals("") || verb.equals("") || name.equals("")) {
            Toast.makeText(MainActivity.this, "Fill out all inputs!", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("verb", verb);
            intent.putExtra("noun", noun);
            startActivity(intent);
            mName.setText("");
            mVerb.setText("");
            mNoun.setText("");
        }

    }

}