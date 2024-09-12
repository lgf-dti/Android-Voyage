package com.example.voyage;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Déclaration des attributs de l'IHM
    EditText editTextDepart;
    EditText editTextDestination;
    Button buttonCreerKit;
    Button buttonAjouterOption;

    KitVoyage kitVoyage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        buttonCreerKit = findViewById(R.id.buttonValiderKit);
        editTextDepart = findViewById(R.id.editTextDepart);
        editTextDestination = findViewById(R.id.editTextDestination);
        buttonAjouterOption = findViewById(R.id.buttonAjouterOption);

        buttonCreerKit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String depart = editTextDepart.getText().toString();
                String destination = editTextDestination.getText().toString();
                kitVoyage = new KitVoyage(depart, destination);
                Log.i("kit", kitVoyage.toString());
                Toast.makeText(MainActivity.this, kitVoyage.toString(), Toast.LENGTH_LONG).show();
            }
        });

        buttonAjouterOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        // Création d'un kit de voyage
    /*    KitVoyage kit = new KitVoyage("Marseille", "Istanbul");
        Sejour sejour = new Sejour("Hotel 4* a Istanbul", 40, 5, 100);
        Transport transport = new Transport("Vol vers Istanbul", 240);
        kit.ajouterOption(sejour);
        kit.ajouterOption(transport);

        // Affichage du kit de voyage dans Logcat
        Log.i("kit",kit.toString());
*/

    }
}