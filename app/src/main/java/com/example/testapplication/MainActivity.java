package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.testapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName4);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void openNaver(View view){
        Intent intent = new Intent(this, OpenNaverActivity.class);
        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName4);
        String naverURL = "https://www.naver.com";
        intent.putExtra(EXTRA_MESSAGE, naverURL);
        startActivity(intent);
    }

    public void openDaum(View view){
        Intent intent = new Intent(this, OpenDaumActivity.class);
        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName4);
        String daumURL = "https://www.daum.net";
        intent.putExtra(EXTRA_MESSAGE, daumURL);
        startActivity(intent);
    }

    public void openFragment(View view){
        Intent intent = new Intent(this, OpenFragment.class);
        //String naverURL = "https://www.naver.com";
        //intent.putExtra(EXTRA_MESSAGE, naverURL);
        startActivity(intent);
    }
}