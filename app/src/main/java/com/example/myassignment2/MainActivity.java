package com.example.myassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean flag=false;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start= (Button)findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);

                startActivity(intent);
            }
        });


    }

    @Override
    public void onResume(){
        super.onResume();
        // put your code here...
        Intent intent = getIntent();
        String score= intent.getStringExtra("score");
        tv=(TextView)findViewById(R.id.textView3);
        tv.setText("Score :"+score+"/10");
    }
}