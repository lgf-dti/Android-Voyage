package com.example.voyage;


import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.voyage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    KitVoyage kitVoyage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.buttonValiderKit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String depart = binding.editTextDepart.getText().toString();
                String destination = binding.editTextDestination.getText().toString();
                kitVoyage = new KitVoyage(depart, destination);
                Log.i("kit", kitVoyage.toString());
                Toast.makeText(MainActivity.this, kitVoyage.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }

}