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
    int images[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5};
    int index = 0;
    View ivView;
    View welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        iv = findViewById(R.id.ImageView);
        next = findViewById(R.id.nextbtn);
        prev = findViewById(R.id.prebtn);
        number = findViewById(R.id.number);
        nameview = findViewById(R.id.nameview);
        ivView = findViewById(R.id.ImageView);
        welcome = findViewById(R.id.welcome);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                welcome.setVisibility(View.INVISIBLE);
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

                welcome.setVisibility(View.INVISIBLE);
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