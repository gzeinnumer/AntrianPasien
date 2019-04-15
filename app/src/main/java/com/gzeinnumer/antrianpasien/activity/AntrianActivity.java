package com.gzeinnumer.antrianpasien.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.gzeinnumer.antrianpasien.R;
import com.gzeinnumer.antrianpasien.adapter.AdapterAntrian;
import com.gzeinnumer.antrianpasien.model.ResponseAntrianAPI;
import com.gzeinnumer.antrianpasien.server.RetroServerAntrian;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AntrianActivity extends AppCompatActivity implements AdapterAntrian.MyOnItemClick {

    public static final String ID_DOK = "id_dok";
    @BindView(R.id.rv_no_antrian_pasient)
    RecyclerView rvNoAntrianPasient;
    @BindView(R.id.fab1)
    FloatingActionButton fab1;
    @BindView(R.id.fab2)
    FloatingActionButton fab2;
    @BindView(R.id.fab3)
    FloatingActionButton fab3;
    @BindView(R.id.fab4)
    FloatingActionButton fab4;

    ArrayList<ResponseAntrianAPI> mList = new ArrayList<>();

    AdapterAntrian adapter;

    String idDok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antrian);
        ButterKnife.bind(this);



        //matikan salah satu
        idDok = "agusbudiman@gmail.com";
//        idDok = getIntent().getStringExtra(ID_DOK);

        initDataFromApi();

        adapter.setOnClickListener2(this);
    }

    private void initDataFromApi() {
        RetroServerAntrian.getInstance().readAntrianAPI(
                idDok,
                "04-04-2019",
                "09:00:00",
                "RSPWD")
                .enqueue(new Callback<List<ResponseAntrianAPI>>() {
                    @Override
                    public void onResponse(Call<List<ResponseAntrianAPI>> call, Response<List<ResponseAntrianAPI>> response) {

                        List<ResponseAntrianAPI> list = response.body();
                        for (int i=0; i<list.size(); i++){
                            mList.add(new ResponseAntrianAPI(
                                    list.get(i).getDokterID(),
                                    list.get(i).getNoUrut(),
                                    list.get(i).getAntrianID(),
                                    list.get(i).getNoAntrian(),
                                    list.get(i).getJam(),
                                    list.get(i).getTgl(),
                                    list.get(i).getRSID(),
                                    list.get(i).getNamaPasien(),
                                    list.get(i).getDokterName()));
                        }
                        initToRecycler();
                    }

                    @Override
                    public void onFailure(Call<List<ResponseAntrianAPI>> call, Throwable t) {

                    }
        });
    }

    private void initToRecycler() {
    }

    @OnClick({R.id.fab1, R.id.fab2, R.id.fab3, R.id.fab4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fab1:
                actionFab1();
                break;
            case R.id.fab2:
                actionFab2();
                break;
            case R.id.fab3:
                actionFab3();
                break;
            case R.id.fab4:
                actionFab4();
                break;
        }
    }

    private void actionFab1() {

    }

    private void actionFab2() {

    }

    private void actionFab3() {

    }

    private void actionFab4() {

    }

    @Override
    public void onItemClick(int position) {

    }
}
