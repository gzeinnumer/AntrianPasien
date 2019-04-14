package com.gzeinnumer.antrianpasien.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.gzeinnumer.antrianpasien.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Login extends AppCompatActivity {

    //todo 4
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        //todo 5
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListHospital.class);
                startActivity(intent);
            }
        });
    }
}
