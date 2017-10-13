package com.example.spark.playmp3;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button button,button2;
    Boolean check=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.sample);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    mp.start();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mp.pause();
            }
        });
    }
}
