package com.example.lucas.mynanodegreeapps.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Context context = MainActivity.this;
    private Button btpopularmovies;
    private Button btstockhawk;
    private Button btmakematerial;
    private Button btgoubiquitous;
    private Button btcapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        findViews();
        setClickListeners();
    }

    private void findViews(){
        btpopularmovies = (Button)findViewById(R.id.btpopularmovies);
        btstockhawk = (Button)findViewById(R.id.btstockhawk);
        btmakematerial = (Button)findViewById(R.id.btmakematerial);
        btgoubiquitous = (Button)findViewById(R.id.btgoubiquitous);
        btcapstone = (Button)findViewById(R.id.btcapstone);
    }

    private void setClickListeners(){
        btpopularmovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, R.string.btpopularmovies_message, Toast.LENGTH_SHORT).show();
            }
        });
        btstockhawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, R.string.btstockhawk_message, Toast.LENGTH_SHORT).show();
            }
        });
        btmakematerial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, R.string.btmakematerial_message, Toast.LENGTH_SHORT).show();
            }
        });
        btgoubiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, R.string.btgoubiquitous_message, Toast.LENGTH_SHORT).show();
            }
        });
        btcapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, R.string.btcapstone_message, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
