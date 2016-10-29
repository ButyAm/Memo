package com.journaldev.galleryview.Colorday;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.journaldev.galleryview.R;

public class ColorDayActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set title for the GridView
        setTitle("GridView");
        // Get the view from grid_view.xml
        setContentView(R.layout.activity_color_day);

        // Set the images from ImageAdapter.java to GridView
        GridView gridview = (GridView) findViewById(R.id.gridviewcolor);
        gridview.setAdapter(new ImageAdapter(this));

        // Listening to GridView item click
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // Launch ImageViewPager.java on selecting GridView Item
                Intent i = new Intent(getApplicationContext(), ImageViewPager.class);


                // Send the click position to ImageViewPager.java using intent
                i.putExtra("id", position);

                // Start ImageViewPager
                startActivity(i);
            }
        });
    }

    // Not using options menu for this tutorial

}

