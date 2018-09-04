package com.example.shadow.slideshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class list extends AppCompatActivity {
    String names[] = {"Rick and Morty", "Supreme Simpson", "Supreme", "Monster", "Infinity"};
    int images[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5};
    ListView lv;
    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lv = findViewById(R.id.listy);
        ArrayAdapter<String> ad = new ArrayAdapter<>(getApplicationContext(),R.layout.row,R.id.text1,names);
        lv.setAdapter(ad);
        button = findViewById(R.id.back);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent full = new Intent(getApplicationContext(), FullscreenActivity.class);
                full.putExtra("picture",images[i]);
                full.putExtra("name",names[i]);
                startActivity(full);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
