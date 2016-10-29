package com.journaldev.galleryview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.journaldev.galleryview.Colorday.ColorDayActivity;
import com.journaldev.galleryview.CultureDay.CultureDay;
import com.journaldev.galleryview.YearBook.CurlActivity;

public class MainActivity extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;

    ImageButton b1, b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayouthome);
        mNavigationView = (NavigationView) findViewById(R.id.homenavigview) ;

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Hotel");

        b1 = (ImageButton) findViewById(R.id.image1);
        b2 = (ImageButton) findViewById(R.id.image2);
        b3 = (ImageButton) findViewById(R.id.image3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ColorDayActivity.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CultureDay.class));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CurlActivity.class));
            }
        });
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();


                if (menuItem.getItemId() == R.id.nav_colorday) {
                    startActivity(new Intent(MainActivity.this, ColorDayActivity.class));

                }
                if (menuItem.getItemId() == R.id.nav_cultureday) {
                    startActivity(new Intent(MainActivity.this, CultureDay.class));

                }

                if (menuItem.getItemId() == R.id.nav_yearbook) {
                    startActivity(new Intent(MainActivity.this, CurlActivity.class));

                }

                return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbarhome);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();


    }


}
