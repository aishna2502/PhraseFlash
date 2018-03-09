package com.example.aishnagupta.phraseflash;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){
        Log.i("button tapped",Integer.toString(view.getId()));
        int id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);
        int resourceId = view.getResources().getIdentifier(ourId, "raw", "com.example.aishnagupta.phraseflash");
        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
