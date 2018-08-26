package com.example.shadow.slideshow;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SlideActivity extends AppCompatActivity {

    ImageView iv;
    Button next;
    Button prev;
    TextView number;
    TextView nameview;
    String names[] = {"Rick and Morty", "Supreme Simpson", "Supreme", "Monster", "Infinity"};
    int nums[] = {1, 2, 3, 4, 5};
    int images[] = {R.drawable.moon, R.drawable.paris, R.drawable.london, R.drawable.lake, R.drawable.house};
    int index = 0;
    View ivView;
    View welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        iv = findViewById(R.id.iv);
        next = findViewById(R.id.nextbtn);
        prev = findViewById(R.id.prebtn);
        number = findViewById(R.id.number);
        nameview = findViewById(R.id.nameview);
        ivView = findViewById(R.id.iv);
        welcome = findViewById(R.id.welcome);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index++;
                if (index == images.length) {
                    index = 0;
                }
                iv.setImageResource(images[index]);
                number.setText("" + nums[index]);
                nameview.setText("" + names[index]);
            }

        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                index--;
                if (index == -1) {
                    index = images.length - 1;
                }
                iv.setImageResource(images[index]);
                number.setText("" + nums[index]);
                nameview.setText("" + names[index]);
            }
        });

    }
}