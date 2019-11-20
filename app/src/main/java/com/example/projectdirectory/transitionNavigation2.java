package com.example.projectdirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class transitionNavigation2 extends AppCompatActivity {

    private String TAG = "secondActivity";
    private TextView txt2;
    private EditText edit2;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_navigation2);
        txt2 = findViewById(R.id.txt2);
        button2 = findViewById(R.id.button2);
        edit2 = findViewById(R.id.edit2);
        String txt = getIntent().getStringExtra("text1");
        if(txt!=null) {
            txt2.setText(txt);
        }
        Log.d(TAG, "onCreate: secondWindow time: "+System.currentTimeMillis());

        ///System.currentTimeMillis()
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_REPLY",edit2.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: secondWindow time: "+System.currentTimeMillis());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: secondWindow time: "+System.currentTimeMillis());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: secondWindow time: "+System.currentTimeMillis());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: secondWindow time: "+System.currentTimeMillis());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: secondWindow time: "+System.currentTimeMillis());

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: secondWindow time: "+System.currentTimeMillis());
    }

}
