package com.hao.sendbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Bundles extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundles);

        Intent i = getIntent();
        Bundle data = i.getExtras();
        tv = (TextView) findViewById(R.id.myBundle);
        tv.setText(String.format("name=%s\nage=%d\n",data.getString("name"),data.getString("age")));
    }
}
