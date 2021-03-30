package com.example.buttonclasswin;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view ) {
           mainActivity.mTextView1.setText("You clicked 이준석 's  button");
    }
}
