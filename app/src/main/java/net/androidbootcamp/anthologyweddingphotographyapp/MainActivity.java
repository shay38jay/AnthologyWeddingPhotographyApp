package net.androidbootcamp.anthologyweddingphotographyapp;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView myGrid = (GridView)findViewById(R.id.myGrid);
        myGrid.setAdapter(new ImageAdapter(this));

        myGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Contact us at anthology@wed.com."  + (position + 1), Toast.LENGTH_SHORT).show();

                Intent z = new Intent(getApplicationContext(), OneViewActivity.class);
                z.putExtra("id", position);
                startActivity(z);
            }
        });
    }
}
