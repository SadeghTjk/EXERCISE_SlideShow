package com.example.shadow.slideshow;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SlideActivity extends AppCompatActivity {

    ImageView iv;
    Button next;
    Button prev;
    int images[] = {R.drawable.fan2,R.drawable.runeterra,R.drawable.fan1,R.drawable.fan3};
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        iv = findViewById(R.id.iv);
        next = findViewById(R.id.nextbtn);
        prev = findViewById(R.id.prebtn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                if (index == images.length){
                    index = 0;
                }
                iv.setImageResource(images[index]);
            }

        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                if (index == -1){
                    index = images.length-1;
                }
                iv.setImageResource(images[index]);
            }
        });
    }
}