package com.example.shadow.picslideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class FullscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        ImageView fullpic = findViewById(R.id.fullpic);
        TextView picname= findViewById(R.id.picname);
        Button backbtn = findViewById(R.id.backButton);

        fullpic.setImageResource(getIntent().getExtras().getInt("picture"));
        //Picasso.get().load(getIntent().getExtras().getString("picture","")).into(fullpic);
        picname.setText(getIntent().getExtras().getString("name"));

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
