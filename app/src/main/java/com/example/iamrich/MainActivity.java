package com.example.iamrich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button poorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        poorButton=findViewById(R.id.poor_button);
        poorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "You are ready to be poor", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,PoorActivity.class);
                startActivity(intent);

            }
        });
    }
}
