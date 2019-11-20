package com.example.projectdirectory.assignment191119;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.projectdirectory.R;

public class implicitIntentAssignment extends AppCompatActivity {
    private EditText editwebsite;
    private EditText editlocation;
    private EditText edittext;
    private Button buttonwebsite;
    private Button buttonlocation;
    private Button buttontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment191119);
        editwebsite = findViewById(R.id.editweb);
        editlocation = findViewById(R.id.editlocation);
        edittext = findViewById(R.id.edittext);

        buttonwebsite = findViewById(R.id.buttonweb);
        buttonlocation = findViewById(R.id.buttonlocation);
        buttontext = findViewById(R.id.buttontext);
        ///
        buttonwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(editwebsite.getText().toString()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        buttonlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                String data =editlocation.getText().toString();
                intent.setData(Uri.parse("http://maps.google.com/maps?q="+ data));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        buttontext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_SEND);

                String data =edittext.getText().toString();

                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,data);

                if (intent.resolveActivity(getPackageManager()) != null) {

                    startActivity(intent);
                }
            }
        });


    }
}
