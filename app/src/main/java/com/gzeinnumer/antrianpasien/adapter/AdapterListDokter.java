package com.gzeinnumer.antrianpasien.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gzeinnumer.antrianpasien.R;
import com.gzeinnumer.antrianpasien.activity.AntrianActivity;
import com.gzeinnumer.antrianpasien.model.ResponseDokter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


//todo 28
public class AdapterListDokter extends RecyclerView.Adapter<AdapterListDokter.ViewHolder> {

    private Context context;
    private ArrayList<ResponseDokter> list;

    public AdapterListDokter(Context context, ArrayList<ResponseDokter> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //todo 29
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_dokter, viewGroup, false);
        return new ViewHolder(view);
    }

    //todo 31
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.idDokter.setText(list.get(i).getDokterID());
        viewHolder.nameDokter.setText(list.get(i).getDokterName());
        viewHolder.fbDokter.setText(list.get(i).getFBAccount());
        viewHolder.igDokter.setText(list.get(i).getIGAccount());
        viewHolder.waDokter.setText(list.get(i).getWANumber());
        viewHolder.spesialisIdDokter.setText(list.get(i).getSpesialisasiID());
        viewHolder.spesialisNameDokter.setText(list.get(i).getSpesialisasiName());
        viewHolder.kotaIdDokter.setText(list.get(i).getDokterID());
        viewHolder.kotaNamaDokter.setText(list.get(i).getDokterName());
        viewHolder.profileDokter.setText(list.get(i).getProfile());
        viewHolder.photofileNameDokter.setText(list.get(i).getPhotoFileName());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AntrianActivity.class);
                intent.putExtra(AntrianActivity.ID_DOK, list.get(i).getDokterID());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.id_dokter)
        TextView idDokter;
        @BindView(R.id.name_dokter)
        TextView nameDokter;
        @BindView(R.id.fb_dokter)
        TextView fbDokter;
        @BindView(R.id.ig_dokter)
        TextView igDokter;
        @BindView(R.id.wa_dokter)
        TextView waDokter;
        @BindView(R.id.spesialis_id_dokter)
        TextView spesialisIdDokter;
        @BindView(R.id.spesialis_name_dokter)
        TextView spesialisNameDokter;
        @BindView(R.id.kota_id_dokter)
        TextView kotaIdDokter;
        @BindView(R.id.kota_nama_dokter)
        TextView kotaNamaDokter;
        @BindView(R.id.profile_dokter)
        TextView profileDokter;
        @BindView(R.id.photofile_name_dokter)
        TextView photofileNameDokter;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
