package com.example.dogsmoodtranslator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {
    private Button button;
    private EditText nameText;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Get the EditText reference
        EditText ageEditText = findViewById(R.id.ageEditText);

// Get the entered dog name
        String dogName = ageEditText.getText().toString().trim();

// Save the dog name using SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("dogName", dogName);
        editor.apply();

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity2.this, activity3.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.buttonback);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity2.this, activity1.class);
                startActivity(intent);
            }
        });

        nameText = findViewById(R.id.ageEditText);
        nextButton = findViewById(R.id.button2);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = ageEditText.getText().toString();

                Intent intent = new Intent(activity2.this, activity3.class);
                intent.putExtra("user_name", userName);
                startActivity(intent);
            }
        });
    }
}
