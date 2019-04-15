package com.gzeinnumer.antrianpasien.server;

import com.gzeinnumer.antrianpasien.model.ResponseAntrianAPI;
import com.gzeinnumer.antrianpasien.model.ResponseDokter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//todo 22
public interface ApiServiceAntrian {

    @GET("Antrian/ListAntrian")
    Call<List<ResponseAntrianAPI>> readAntrianAPI(@Query("dokterID") String dokterID,
                                                  @Query("tgl") String tgl,
                                                  @Query("jam") String jam,
                                                  @Query("rsid") String rsid);

}
