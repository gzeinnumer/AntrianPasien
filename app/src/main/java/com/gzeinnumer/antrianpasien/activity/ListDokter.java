package com.gzeinnumer.antrianpasien.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.gzeinnumer.antrianpasien.R;
import com.gzeinnumer.antrianpasien.adapter.AdapterListDokter;
import com.gzeinnumer.antrianpasien.model.ResponseDokter;
import com.gzeinnumer.antrianpasien.server.RetroServer;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListDokter extends AppCompatActivity {

    //todo 18
    public static final String ID_RS = "id_rs";
    String idRs;
    ArrayList<ResponseDokter> listData = new ArrayList<>();

    //todo 25
    @BindView(R.id.rv_list_dokter)
    RecyclerView rvListDokter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_dokter);
        ButterKnife.bind(this);

        //todo 19
        idRs = getIntent().getStringExtra(ID_RS);

        //todo 20
        initDataDokter();
    }

    private void initDataDokter() {
        //todo 23
        RetroServer.getInstance().readDokter(idRs).enqueue(new Callback<List<ResponseDokter>>() {
            @Override
            public void onResponse(Call<List<ResponseDokter>> call, Response<List<ResponseDokter>> response) {
                if (response.isSuccessful()) {
                    List<ResponseDokter> list = response.body();
                    assert list != null;
                    if (list.size() != 0) {
                        for (int i = 0; i < list.size(); i++) {
                            listData.add(new ResponseDokter(
                                    list.get(i).getDokterID(),
                                    list.get(i).getFBAccount(),
                                    list.get(i).getKotaID(),
                                    list.get(i).getPhotoFileName(),
                                    list.get(i).getKotaName(),
                                    list.get(i).getPinBbm(),
                                    list.get(i).getWANumber(),
                                    list.get(i).getSpesialisasiName(),
                                    list.get(i).getIGAccount(),
                                    list.get(i).getSpesialisasiID(),
                                    list.get(i).getProfile(),
                                    list.get(i).getDokterName()));
                        }
                    }

                    //todo 26
                    initDataToRVDokter();

                }
            }

            @Override
            public void onFailure(Call<List<ResponseDokter>> call, Throwable t) {

            }
        });
    }

    private void initDataToRVDokter() {
        //todo 27 buat adapter

        //todo 33
        AdapterListDokter adapter = new AdapterListDokter(getApplicationContext(), listData);
        rvListDokter.setAdapter(adapter);
        rvListDokter.setLayoutManager(new LinearLayoutManager(this));
        rvListDokter.setHasFixedSize(true);
    }
}
