package com.example.gajju.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.action_red);
        Toolbar toolbar1= (Toolbar) findViewById(R.id.action_green);
        Toolbar toolbar2= (Toolbar) findViewById(R.id.action_blue);
     }

}
