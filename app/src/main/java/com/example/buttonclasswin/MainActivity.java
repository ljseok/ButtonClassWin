package com.example.buttonclasswin;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1=findViewById(R.id.button1);
        mTextView1=findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnClickListener(this));
    }


    private class MyOnClickListener implements View.OnClickListener{
        MainActivity mainActivity;
        public MyOnClickListener(MainActivity mainActivity) {
            this.mainActivity = mainActivity;
        }

        @Override
        public void onClick(View view) {
            mainActivity.mTextView1.setText("You clicked 이준석's button");
        }
    }
}