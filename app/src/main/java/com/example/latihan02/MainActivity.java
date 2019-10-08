package com.example.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hubungkan masing masing view yang ingin di manipulasi
        //dengan object yang kita buat
        Button btKrisna = findViewById(R.id.btKrisna);
        Button btBismaDewaBrata = findViewById(R.id.btBismaDewaBrata);
        Button btBasuDewa = findViewById(R.id.btBasuDewa);

        //pasang event listener dan handler
        //menggunakan kelas anonim yang mengimplementasikan interface
        //view.onClickListener
        btKrisna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "I'm Krisna , advisor of Arjuna", Toast.LENGTH_SHORT).show();

            }
        });
        btBismaDewaBrata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "i'm Bisma , The GodFather of Hastina", Toast.LENGTH_SHORT).show();
            }
        });
        btBasuDewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'm BasuDewa , The Brother of Krisna", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
