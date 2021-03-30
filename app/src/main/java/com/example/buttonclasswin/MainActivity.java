package com.example.buttonclasswin;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button mButton1 , mButton2;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1=findViewById(R.id.button1);
        mButton2=findViewById(R.id.button2);
        mTextView1=findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnClickListener());
        mButton2.setOnClickListener(new MyOnClickListener());
    }


    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button1 :
                    mTextView1.setText("You clicked 이준석 's button");
                    break;
                case R.id.button2 :
                    mTextView1.setText("You clicked my 2nd button");
                    break;
                default:
                    break;
            }
        }
    }
}