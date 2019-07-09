package com.example.sonu.genderdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView MaleDark = (ImageView)findViewById(R.id.image2);
        final ImageView MaleWhite = (ImageView)findViewById(R.id.image1);
        final ImageView FemaleDark = (ImageView)findViewById(R.id.image3);
        final ImageView FemaleWhite = (ImageView)findViewById(R.id.image4);

        MaleWhite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {

                MaleDark.setVisibility(View.VISIBLE);
                MaleWhite.setVisibility(View.INVISIBLE);

            }
        });

        FemaleWhite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v2) {

                FemaleWhite.setVisibility(View.INVISIBLE);
                FemaleDark.setVisibility(View.VISIBLE);

            }
        });
    }
}


