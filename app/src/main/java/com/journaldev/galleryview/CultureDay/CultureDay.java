package com.journaldev.galleryview.CultureDay;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.journaldev.galleryview.Colorday.ImageAdapter;
import com.journaldev.galleryview.Colorday.ImageViewPager;
import com.journaldev.galleryview.R;

import java.util.ArrayList;

public class CultureDay extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set title for the GridView
        setTitle("GridView");
        // Get the view from grid_view.xml
        setContentView(R.layout.activity_culture_day);

        // Set the images from ImageAdapter.java to GridView
        GridView gridview = (GridView) findViewById(R.id.gridviewcultureday);

        ViewGroup.LayoutParams lp=new ViewGroup.LayoutParams(90,90);
        gridview.setLayoutParams(lp);

        gridview.setAdapter(new ImageAdapterCulture(this));

        // Listening to GridView item click
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // Launch ImageViewPager.java on selecting GridView Item
                Intent i = new Intent(getApplicationContext(), ImageViewPagerCulture.class);

                // Show a simple toast message for the item position
                //   Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();

                // Send the click position to ImageViewPager.java using intent
                i.putExtra("id", position);

                // Start ImageViewPager
                startActivity(i);
            }
        });

    }

    // Not using options menu for this tutorial

}

