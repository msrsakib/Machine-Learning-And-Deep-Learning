package com.touhidapps.demo.tflite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

  private Button mCameraBtn;
  private Button mInfoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mCameraBtn = (Button) findViewById(R.id.camera_btn);
        mInfoBtn =(Button) findViewById(R.id.file_btn);

        mCameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,CameraActivity.class);
                startActivity(intent);

            }
        });

        mInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Information.class);
                startActivity(intent);
            }
        });

    }
}
