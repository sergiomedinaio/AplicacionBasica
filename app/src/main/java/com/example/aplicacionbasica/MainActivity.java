package com.example.aplicacionbasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                LinearLayout appContent = findViewById(R.id.appContent);
                TextView newText = new TextView(button.getContext());
                newText.setText(R.string.textItem);
                newText.setBackgroundColor(+R.color.purple_200);
                appContent.addView(newText);
            }
        });
    }
}