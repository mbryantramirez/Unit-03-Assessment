package org.pursuit.unit_03_assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.pursuit.unit_03_assessment.R;

public class DisplayActivity extends AppCompatActivity {


    private TextView planet_name;
    private TextView planet_number;
    private ImageView planet_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        planet_name = findViewById(R.id.display_name_planet);
        planet_number = findViewById(R.id.planet_id_number);
        planet_image = findViewById(R.id.planet_id_image);


        Intent intent = getIntent();
        planet_name.setText(intent.getStringExtra("name"));
        planet_number.setText(Integer.toString(intent.getIntExtra("number",0)));
        Picasso.get().load(intent.getStringExtra("image")).into(planet_image);



        /*
        * TODO: Add logic that will:
        * TODO 1. Receive values from sending intent
        * TODO 2. Create a TextView instance for the Planet Name
        * TODO 3. Create a TextView instance for the Planet Number count
        * TODO 4. Create an ImageView for the image url
        * TODO 5. Display each value in views - Strings for TextViews, and Picasso for the ImageView
        */
    }
}
