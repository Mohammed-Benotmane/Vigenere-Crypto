package com.example.mohamed.vigenre;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mohamed on 07/04/18.
 */

public class Resultat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultat);
        TextView t1 = (TextView)findViewById(R.id.code);
        Intent intent = getIntent();
        t1.setText(intent.getStringExtra("a"));
    }

}
