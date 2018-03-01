package com.mcc.linearlayoutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button firstbutton;
    public Button secondbutton;
    public Button thirdbutton;
    public Button fourthbutton;
    public Button fifthbutton;

    public void init() {
        firstbutton = (Button)findViewById(R.id.firstbutton);
        firstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent first = new Intent(MainActivity.this, firstbutton.class);
                startActivity(first);
            }
        });

        secondbutton = (Button)findViewById(R.id.secondbutton);
        secondbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second = new Intent(MainActivity.this, secondbutton.class);
                startActivity(second);
            }
        });

        thirdbutton = (Button)findViewById(R.id.thirdbutton);
        thirdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent third = new Intent(MainActivity.this, thirdbutton.class);
                startActivity(third);
            }
        });


        fourthbutton=(Button)findViewById(R.id.fourthbutton);
        fourthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fourth = new Intent(MainActivity.this, fourthbutton.class);
                startActivity(fourth);
            }
        });

        fifthbutton=(Button)findViewById(R.id.fifthbutton);
        fifthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fifth= new Intent(MainActivity.this, fifthbutton.class);
                startActivity(fifth);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

}