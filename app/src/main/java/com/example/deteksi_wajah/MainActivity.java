package com.example.deteksi_wajah;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    ImageView bgapp;
    LinearLayout textsplash, texthome;
    RelativeLayout menus;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);


        bgapp = (ImageView) findViewById(R.id.bgapp);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);
        menus = (RelativeLayout) findViewById(R.id.menus1);

        bgapp.animate().translationY(-1900).setDuration(800).setStartDelay(1300);
        textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(1300);

        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);

    }
}
