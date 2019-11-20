package com.example.projectdirectory;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class transitionNavigation extends AppCompatActivity {

    private final static int code = 1;
    private String TAG = "firstActivity";
    private Button button1;
    private TextView tv1;
    private EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_navigation);
        button1 = findViewById(R.id.button1);
        tv1 = findViewById(R.id.txt1);
        ed1 = findViewById(R.id.edit1);
        Log.i(TAG, "onCreate: mainActivity");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), transitionNavigation2.class);
                intent.putExtra("text1", ed1.getText().toString());
                startActivityForResult(intent, code);
            }
        });


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart:MainActivity ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: MainActivity");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: MainActivity");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == code)
        {
            if (resultCode == RESULT_OK)
            {
                String reply = data.getStringExtra("EXTRA_REPLY");
                if(reply!=null) {
                    tv1.setText(reply);
                }

            }
        }

    }


}
