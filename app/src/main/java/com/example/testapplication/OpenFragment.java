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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_fragment);
        fragmentManager = getSupportFragmentManager();
        fragmentA = new FragmentA();
        // fragmentB = new FragmentB();
        fragmentManager.beginTransaction().replace(R.id.frameLayout,fragmentA).commit();

        //transaction = fragmentManager.beginTransaction();
        //transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
        System.out.println("createdddd");
    }

    public void clickHandler(View view){
        //transaction = fragmentManager.beginTransaction();

        switch (view.getId()){
            case R.id.btn_fragmentA:
                if(fragmentA == null) {
                    fragmentA = new FragmentA();
                    fragmentManager.beginTransaction().add(R.id.frameLayout, fragmentA).commit();
                }

                if(fragmentA != null) fragmentManager.beginTransaction().show(fragmentA).commit();
                if(fragmentB != null) fragmentManager.beginTransaction().hide(fragmentB).commit();

                // transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                break;
            case R.id.btn_fragmentB:
                if(fragmentB == null) {
                    fragmentB = new FragmentB();
                    fragmentManager.beginTransaction().add(R.id.frameLayout, fragmentB).commit();
                }

                if(fragmentA != null) fragmentManager.beginTransaction().hide(fragmentA).commit();
                if(fragmentB != null) fragmentManager.beginTransaction().show(fragmentB).commit();
                //transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                break;
        }
    }
}