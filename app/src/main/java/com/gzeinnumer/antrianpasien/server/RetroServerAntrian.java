package com.gzeinnumer.antrianpasien.server;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//todo 21
public class RetroServerAntrian {
//    public static String BASE_URL = "https://gzeinnumer.000webhostapp.com/antrian/";
public static String BASE_URL = "http://dev.smart-ics.com:222/antrian-api/Api/";
    public static Retrofit setInit(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiServiceAntrian getInstance(){
        return setInit().create(ApiServiceAntrian.class);
    }
}
