package com.example.datacollector;

import androidx.appcompat.app.AppCompactActivity;

import android.annotation.SuppressLint;
import android.content.context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.wigdet.Button;
import android.wigdet.ImageView;
import android.wigdet.TextView;

import com.bumptech.glide.Glide;
import com.example.datacollector.Model.Terrain;

public class Detail_Stade extends AppCompatActivity{

    TextView nom,adresse,description,tarif,id_terrain,ImageView button,stade;

    @Ovveride
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Detail_Stade);

        nom=findViewById(R.id.stade_nom);
        adresse=findViewById(R.id.stade_adresse);
        tarif=findViewById(R.id.stade_tarif);
        description=findViewById(R.id.description);
       button=findViewById(R.id.button_location);
        id_terrain=findViewById(R.id.terrain);
        stade=findViewById(R.id.stade_image);

        Intent intent = getIntent();

        String id = intent.getStringExtra("id");
        String nom = intent.getStringExtra("nom");
        String adresse = intent.getStringExtra("adresse");
        String tarif = intent.getStringExtra("tarif");
        String description = intent.getStringExtra("description");
        String rang = intent.getStringExtra("rang");
        String image = intent.getStringExtra("image");

        nom.setText(nom);
        adresse.setText(adresse);
        tarif.setText(tarif);
        description.setText(description);

        Glide.with(this).load(image).into (stade);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick( View view){
                Intent intent=new Intent (getApplicationContext(),MapsActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }

        });
        
    }
}
