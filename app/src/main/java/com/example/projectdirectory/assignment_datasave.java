package com.example.projectdirectory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class assignment_datasave extends AppCompatActivity {
    private Button button1;
    private EditText edit1;
    private TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_datasave);
        button1 =findViewById(R.id.button1);
        edit1 =findViewById(R.id.ed1);
        txt1 =findViewById(R.id.txt1);

        if(savedInstanceState!=null){
            String rr = savedInstanceState.getString("key");
            txt1.setText(rr);
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(edit1.getText().toString());
            }
        });

//ytyitiuit


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key",edit1.getText().toString());
    }
}
