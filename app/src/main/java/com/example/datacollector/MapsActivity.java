package com.example.datacollector;

import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.Model.LatLng;
import com.google.android.gms.maps.Model.MarkerOptions;
import com.example.datacollector.APISET.Apiset;
import com.example.datacollector.Controller.ApiController;
import com.example.datacollector.databinding.ActivityMapsBinding;
import com.example.datacollector.Model.Terrain;
import java.lang.Long;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Reponse;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback{

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayout Inflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap){
       final String TAG = "Ajouter position";
       mMap = googleMap;
       Intent intent = getIntent();
       id=intent.getStringExtra("id");
       Call<Terrain> call = ApiController.getInstance().getapi().getTerrainById(Long.parseLong(getIntent().getStringExtra("id")));
       call.enqueue(new Callback<Terrain>(){
           public void onReponse(Call<Terrain> call, Reponse<Terrain> reponse){
               if(!reponse.isSuccessful ()){
                   Log.d(TAG, reponse.code ( + " "));
                   return;
               }
               Terrain c = reponse.body();
               mMap.addMarker(new MarkerOption().position(new LatLng(parseDouble(c.getLat ()), parseDouble(getLongitude()))).title(c.getNom()));
           }
           @Override
           public void onFailure(Call<Terrain> call, Throwable t) {
               Log.d(TAG, t.getMessage());
           }

       });
    }
}