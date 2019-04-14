package com.gzeinnumer.antrianpasien.server;

import com.gzeinnumer.antrianpasien.model.ModelHospital;
import com.gzeinnumer.antrianpasien.model.ResponseDokter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

//todo 22
public interface ApiService {

    @GET("Dokter/ListDataByRS")
    Call<List<ResponseDokter>> readDokter(@Query("rsID") String dokterID);

}
