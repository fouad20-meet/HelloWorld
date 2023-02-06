package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView title;
    private EditText food;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.food);
        food = findViewById(R.id.food_name);
        submit = findViewById(R.id.submit);
    }

    @Override
    public void onClick(View view) {
        if(view==submit){
            title.setText(food.getText().toString());
            food.setText("");
        }
    }
}