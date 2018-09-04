package com.example.shadow.picslideshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SlideActivity extends AppCompatActivity {

    ImageView iv;
    Button next;
    Button prev;
    TextView number;
    TextView nameview;
    String names[] = {"Rick and Morty", "Supreme Simpson", "Supreme", "Monster", "Infinity"};
    int nums[] = {1, 2, 3, 4, 5};
    int images[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5};
    //String[] images = {"file:///android_asset/pic1.jpg","file:///android_asset/pic2.jpg","file:///android_asset/pic3.jpg","file:///android_asset/pic4.jpg","file:///android_asset/pic5.jpg"};
    int index = -1;
    View welcome;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        iv = findViewById(R.id.ImageView);
        next = findViewById(R.id.nextbtn);
        prev = findViewById(R.id.prebtn);
        number = findViewById(R.id.number);
        nameview = findViewById(R.id.nameview);
        welcome = findViewById(R.id.welcome);
        menu = findViewById(R.id.menu);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (welcome.getVisibility() == View.VISIBLE && nameview.getVisibility() == View.INVISIBLE && number.getVisibility() == View.INVISIBLE) {
                    nameview.setVisibility(View.VISIBLE);
                    number.setVisibility(View.VISIBLE);
                    welcome.setVisibility(View.GONE);
                }
                index++;
                if (index == images.length) {
                    index = 0;
                }
                iv.setImageResource(images[index]);
                //Picasso.get().load(images[index]).into(iv);

                number.setText("" + nums[index]);
                nameview.setText("" + names[index]);


            }

        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (welcome.getVisibility() == View.VISIBLE && nameview.getVisibility() == View.INVISIBLE && number.getVisibility() == View.INVISIBLE) {
                    nameview.setVisibility(View.VISIBLE);
                    number.setVisibility(View.VISIBLE);
                    welcome.setVisibility(View.GONE);
                }
                index--;
                if (index <= -1) {
                    index = images.length - 1;
                }
                //Picasso.get().load(images[index]).into(iv);
                iv.setImageResource(images[index]);
                number.setText("" + nums[index]);
                nameview.setText("" + names[index]);

            }
        });

        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (welcome.getVisibility() == View.VISIBLE && nameview.getVisibility() == View.INVISIBLE && number.getVisibility() == View.INVISIBLE) {
                    nameview.setVisibility(View.VISIBLE);
                    number.setVisibility(View.VISIBLE);
                    welcome.setVisibility(View.GONE);
                }
                index++;
                if (index == images.length) {
                    index = 0;
                }
                iv.setImageResource(images[index]);
                number.setText("" + nums[index]);
                nameview.setText("" + names[index]);
            }

        });

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(welcome.getVisibility() == View.GONE) {
                    Intent intent1 = new Intent(getApplicationContext(), FullscreenActivity.class);
                    intent1.putExtra("picture", images[index]);
                    intent1.putExtra("name", names[index]);
                    startActivity(intent1);
                }
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(getApplicationContext(),list.class);
                startActivity(i);
            }
        });
    }
}