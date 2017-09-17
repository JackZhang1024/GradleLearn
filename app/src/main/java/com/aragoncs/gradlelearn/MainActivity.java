package com.aragoncs.gradlelearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvAppFlavor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAppFlavor = (TextView) findViewById(R.id.tv_app_flavor);
        Log.e("info","学习Gradle知识");
        Log.e("info","学习Pull request知识");
        if (BuildConfig.OEM.equals("OEMA")){
            tvAppFlavor.setText("OEMA");
        }else{
            tvAppFlavor.setText("OEMB");
        }
    }
}
