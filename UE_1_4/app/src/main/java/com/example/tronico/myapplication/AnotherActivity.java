package com.example.tronico.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setOnClickListener(this);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(this);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        textView4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView1:
                Log.d("", "Option 1 wurde ausgewählt");
                break;
            case R.id.textView2:
                Log.d("", "Option 2 wurde ausgewählt");
                break;
            case R.id.textView3:
                Log.d("", "Option 3 wurde ausgewählt");
                break;
            case R.id.textView4:
                Log.d("", "Option 4 wurde ausgewählt");
                break;
        }
    }
}
