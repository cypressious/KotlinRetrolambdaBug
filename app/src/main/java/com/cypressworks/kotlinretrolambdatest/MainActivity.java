package com.cypressworks.kotlinretrolambdatest;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().post(() -> {
            TextView tv = (TextView) findViewById(R.id.text1);
            tv.setText(new Foo().bar());
        });
    }

}
