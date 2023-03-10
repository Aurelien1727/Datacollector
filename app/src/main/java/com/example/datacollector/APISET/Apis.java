package com.example.datacollector.APISET;

public class Apis {
    public static final String URL_001="http://192.168.10.104:8087/terrains/";

    public static TerrainService getTerrainService(){
        return  Cliente.getClient(URL_001).create(TerrainService.class);
    }
}
