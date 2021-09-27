package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class OpenFragment extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentA fragmentA;
    private FragmentB fragmentB;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_fragment);

        fragmentManager = getSupportFragmentManager();
        fragmentA = new FragmentA();
        fragmentB = new FragmentB();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
    }

    public void clickHandler(View view){
        transaction = fragmentManager.beginTransaction();

        switch (view.getId()){
            case R.id.btn_fragmentA:
                transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                break;
            case R.id.btn_fragmentB:
                transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                break;
        }
    }
}