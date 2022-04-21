package com.example.fa19_bse_147_assignment_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    Button Input,Calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input=findViewById(R.id.Input);
        Calculate=findViewById(R.id.Calculate);
                Input.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LeftFragment bb=new LeftFragment();
                        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.l2,bb).commit();
                    }
                });
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RightFrhagment bb=new RightFrhagment();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.l2,bb).commit();
            }
        });

    }
}