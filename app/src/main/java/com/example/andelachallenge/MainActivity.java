package com.example.andelachallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialButton btnWebView;
    private MaterialButton btnMyProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWebView = findViewById(R.id.about_id);
        btnMyProfil = findViewById(R.id.myprofil_id);

        btnWebView.setOnClickListener(this);
        btnMyProfil.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.about_id:
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
                break;
            case R.id.myprofil_id:
                startActivity(new Intent(getApplicationContext(), ProfilActivity.class));
                break;
        }

    }

}
