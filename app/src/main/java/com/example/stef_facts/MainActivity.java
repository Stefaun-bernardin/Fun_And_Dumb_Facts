package com.example.stef_facts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        text = findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownewfact();
            }
        });
    }

    public void shownewfact(){
        String[] facts = {"The sun is 92.96 million miles away from earth.",
        "There are 7 stars in the big diper", "Fire is really hot", "Red is a color",
                "The Kansas City Chiefs have only won 1 super bowl" , "I am black", "Anime is cool",
                "Most of these facts are dumb"};

        Random random = new Random();
        int randomNum = random.nextInt(facts.length);
        text.setText(facts[randomNum]);
    }
}