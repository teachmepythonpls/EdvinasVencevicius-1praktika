package com.example.edvinasvencevicius_1praktika;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button button;
    private Button changeColorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tv = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        changeColorButton = findViewById(R.id.changeColorButton);
    }

    public void buttonClick(View view) {
        tv.setText("Hello");
    }

    public void changeColorButtonClick(View view) {
        // Change text color to red
        tv.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
    }
}
