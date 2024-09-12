package com.example.voyage;


import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Création d'un kit de voyage
        KitVoyage kit = new KitVoyage("Marseille", "Istanbul");
        Sejour sejour = new Sejour("Hotel 4* a Istanbul", 40, 5, 100);
        Transport transport = new Transport("Vol vers Istanbul", 240);
        kit.ajouterOption(sejour);
        kit.ajouterOption(transport);

        // Affichage du kit de voyage dans Logcat
        Log.i("kit",kit.toString());

    }
}