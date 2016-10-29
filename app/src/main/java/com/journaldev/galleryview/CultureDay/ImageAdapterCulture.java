package com.journaldev.galleryview.CultureDay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.journaldev.galleryview.R;

public class ImageAdapterCulture extends BaseAdapter {
    private Context mContext;

    public ImageAdapterCulture(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
    	return mThumbIds[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    // Create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // If it's not recycled, initialize some attributes

            imageView = new ImageView(mContext);
           // imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // References to our images in res > drawable
    public Integer[] mThumbIds = {
            R.drawable.a, R.drawable.d,
            R.drawable.b, R.drawable.e,
            R.drawable.c, R.drawable.f,
            R.drawable.g, R.drawable.a,
            R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e,
            R.drawable.f, R.drawable.g,
            R.drawable.a, R.drawable.b,
            R.drawable.c, R.drawable.d,
            R.drawable.e
    };
}
