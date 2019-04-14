package com.gzeinnumer.antrianpasien.server;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//todo 21
public class RetroServer {
//    public static String BASE_URL = "https://gzeinnumer.000webhostapp.com/antrian/";
    public static String BASE_URL = "http://hidok.co.id:8081/HiDok/api/";
    public static Retrofit setInit(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getInstance(){
        return setInit().create(ApiService.class);
    }
}
