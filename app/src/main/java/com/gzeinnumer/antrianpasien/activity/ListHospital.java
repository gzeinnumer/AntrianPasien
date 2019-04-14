package com.gzeinnumer.antrianpasien.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gzeinnumer.antrianpasien.R;
import com.gzeinnumer.antrianpasien.adapter.AdapterListHospital;
import com.gzeinnumer.antrianpasien.model.ModelHospital;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListHospital extends AppCompatActivity {

    //todo 7
    @BindView(R.id.rv_list_hospital)
    RecyclerView rvListHospital;

    ArrayList<ModelHospital> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hospital);
        ButterKnife.bind(this);

        //todo 13 pecahkan bolam
        initDataHospital();
    }

    private void initDataHospital() {
        //todo 14 isi data
        list.add(new ModelHospital("RSMMCJ", "nama RS"));

        //todo 15 initData to RV
        initDataToRVHospital();
    }

    private void initDataToRVHospital() {
        //todo 16
        AdapterListHospital adapter = new AdapterListHospital(getApplicationContext(), list);
        rvListHospital.setAdapter(adapter);
        rvListHospital.setHasFixedSize(true);
        rvListHospital.setLayoutManager(new LinearLayoutManager(this));
    }

}
