package com.example.datacollector.APISET;


import android.text.method.SingleLineTransformationMethod;

import com.example.datacollector.Resultat;
import com.example.datacollector.Model.Position;
import com.example.datacollector.Model.Terrain;
import com.example.datacollector.Model.User;
import com.example.datacollector.Model.Ville;
import com.example.datacollector.Model.Zone;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Apiset {
    @GET("villes/all")
    Call<List<Ville>> getAllVilles();

    @GET("villes/zones/all")
    Call<List<Zone>> getAllZones();
    @GET("villes/terrains")
    Call<List<Terrain>> getAllTerrain();

    @GET("villes/terrains/{id}")
    Call<Terrain> getTerrainById(@Path("id") long id);

    @GET("positions/all")
    Call<List<Position>> findAll();

    @POST("positions/save")
    Call<Void> savePosition(@Body Position position);





}
