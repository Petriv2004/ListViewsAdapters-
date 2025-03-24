package com.example.navegacionappet;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MascotaActivity extends AppCompatActivity {
    public static final String EXTRA_MASCOTAID = "mascotaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mascota);

        int mascotaId = (Integer) getIntent().getExtras().get(EXTRA_MASCOTAID);
        Mascota mascota = Mascota.mascotas[mascotaId];

        TextView name = findViewById(R.id.name);
        name.setText(mascota.getNombre());

        TextView raza = findViewById(R.id.raza);
        raza.setText(mascota.getRaza());

        TextView descripcion = findViewById(R.id.description);
        descripcion.setText(mascota.getDescripcion());

        TextView edad = findViewById(R.id.edad);
        edad.setText(String.valueOf(mascota.getEdad()));

        TextView sexo = findViewById(R.id.sexo);
        sexo.setText(mascota.getSexo());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(mascota.getFoto());
        photo.setContentDescription(mascota.getNombre());
    }
}