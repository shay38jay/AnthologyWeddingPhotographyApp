package net.androidbootcamp.anthologyweddingphotographyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class OneViewActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_view);

        Intent z = getIntent();

        int position = z.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        Toast.makeText(getBaseContext(), "Anthology Wedding Photo"  + (position + 1), Toast.LENGTH_SHORT).show();
        ImageView imageView = (ImageView)findViewById(R.id.OneView);
        imageView.setImageResource(imageAdapter.sPics[position]);
    }

}
