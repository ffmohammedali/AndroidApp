package com.example.projectdirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectdirectory.assignment191119.implicitIntentAssignment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button assignment191119BT;
    private Button dataSaveAssignmentBT;
    private Button transitionNavigationBT;
    private Button textViewScrollView;
    private Button idCard;
    private Button imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assignment191119BT = findViewById(R.id.assignment191119BT);
        assignment191119BT.setOnClickListener(this);

        dataSaveAssignmentBT =findViewById(R.id.dataSaveAssignmentBT);
        dataSaveAssignmentBT.setOnClickListener(this);

        transitionNavigationBT =findViewById(R.id.transitionNavigationBT);
        transitionNavigationBT.setOnClickListener(this);

        textViewScrollView = findViewById(R.id.textViewScrollViewBT);
        textViewScrollView.setOnClickListener(this);

        idCard = findViewById(R.id.idcardBT);
        idCard.setOnClickListener(this);

        imageView = findViewById(R.id.imageViewBT);
        imageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == assignment191119BT.getId()){
            Intent intent = new Intent(this, implicitIntentAssignment.class);
            startActivity(intent);
        }
       else if (v.getId() == dataSaveAssignmentBT.getId()){
            Intent intent = new Intent(this, assignment_datasave.class);
            startActivity(intent);
        }
        else if (v.getId() == transitionNavigationBT.getId()){
            Intent intent = new Intent(this,transitionNavigation.class);
            startActivity(intent);
        }
        else if (v.getId() == textViewScrollView.getId()){
            Intent intent = new Intent(this,textViewScrollView.class);
            startActivity(intent);
        }
        else if (v.getId() == idCard.getId()){
            Intent intent = new Intent(this,idCardViewer.class);
            startActivity(intent);
        }
        else if (v.getId() == imageView.getId()){
            Intent intent = new Intent(this,imageViewer.class);
            startActivity(intent);
        }

    }
}
