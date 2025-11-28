package com.example.belajarlayouthorizontal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

    public class MainActivity extends AppCompatActivity {
        Button BtnBukaSatu,BtnBukaDua,BtnBukaTiga;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.home);
            BtnBukaSatu = (Button) findViewById(R.id.BtnBukaSatu);
            BtnBukaDua = (Button) findViewById(R.id.BtnBukaDua);
            BtnBukaTiga = (Button) findViewById(R.id.BtnBukaTiga);

            BtnBukaSatu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent BukaActSatu = new Intent(getApplicationContext(), ChildrenInRow.class);
                    startActivity(BukaActSatu);
                }
            });
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });

            BtnBukaDua.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent BukaActDua = new Intent(getApplicationContext(), EqualHigh.class);
                    startActivity(BukaActDua);
                }
            });

            BtnBukaTiga.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent BukaActTiga = new Intent(getApplicationContext(), LeftOverWidth.class);
                    startActivity(BukaActTiga);
                }
            });
        }
}