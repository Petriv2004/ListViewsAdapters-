package com.example.navegacionappet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MascotaVerCategoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mascota_ver_categoria);
        ArrayAdapter<Mascota> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Mascota.mascotas);
        ListView listmascotas = findViewById(R.id.list_mascotas);
        listmascotas.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id){
                        Intent intent = new Intent(MascotaVerCategoriaActivity.this,
                                MascotaActivity.class);
                        intent.putExtra(MascotaActivity.EXTRA_MASCOTAID, (int) id);
                        startActivity(intent);
                    }
                };

        listmascotas.setOnItemClickListener(itemClickListener);
    }
}