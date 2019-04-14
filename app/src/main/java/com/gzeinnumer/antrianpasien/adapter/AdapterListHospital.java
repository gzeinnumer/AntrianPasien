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
import com.gzeinnumer.antrianpasien.activity.ListDokter;
import com.gzeinnumer.antrianpasien.activity.ListHospital;
import com.gzeinnumer.antrianpasien.model.ModelHospital;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


//todo 8
public class AdapterListHospital extends RecyclerView.Adapter<AdapterListHospital.ViewHolder> {

    private Context context;
    private ArrayList<ModelHospital> list;

    public AdapterListHospital(Context context, ArrayList<ModelHospital> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //todo 9
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_hospital, viewGroup, false);
        return new ViewHolder(view);
    }

    //todo 11
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.idRs.setText(list.get(i).getIdRs());
        viewHolder.nameRs.setText(list.get(i).getNamaRs());
        //todo 17
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ListDokter.class);
                intent.putExtra(ListDokter.ID_RS, list.get(i).getIdRs());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //todo 12
        @BindView(R.id.id_rs)
        TextView idRs;
        @BindView(R.id.name_rs)
        TextView nameRs;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
