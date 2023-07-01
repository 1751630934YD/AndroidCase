package com.xinke.myapplication23;

import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SpxqActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoxq);
        Intent t=new Intent();
//        String path= t.getStringExtra("path");
        VideoView vd = findViewById(R.id.videoView);
        MediaController mediaController =new MediaController(this);


        vd.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/raw/"+Video.getpath));
        vd.setMediaController(mediaController);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        vd.start();
    }
}
