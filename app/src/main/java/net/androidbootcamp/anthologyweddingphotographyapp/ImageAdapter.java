package net.androidbootcamp.anthologyweddingphotographyapp;

import android.content.Context;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context dContext;

    public ImageAdapter(Context c) {
        dContext = c;
    }

    @Override
    public int getCount() {
        return sPics.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if(convertView == null) {
            imageView = new ImageView(dContext);
            imageView.setLayoutParams(new GridView.LayoutParams(95, 95));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(10, 10, 10, 10);
        }
        else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(sPics[position]);
        return imageView;

    }

    public Integer[] sPics = {
            //10 Wedding Photos
            R.drawable.wedding_1, R.drawable.wedding_2, R.drawable.wedding_3, R.drawable.wedding_4,
            R.drawable.wedding_5, R.drawable.wedding_6, R.drawable.wedding_7, R.drawable.wedding_8,
            R.drawable.wedding_9, R.drawable.wedding_10
    };


}
