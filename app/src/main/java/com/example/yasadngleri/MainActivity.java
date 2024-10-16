package com.example.yasadngleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //İLK ÇALIŞAN YAŞAM DÖNGÜSÜ
        System.out.println("onCreate çalıştı");

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("OnResume çlıştı");
        //  oncreate den sonra çalışır.
    }

    @Override
    protected void onStop() {
        System.out.println("onstop çalıştı");
        super.onStop();
        //TAMAMEN DURMASIYLA ÇALIŞIR.
    }

    @Override
    protected void onPause() {
        System.out.println("onpause çalıştı");
        super.onPause();
        //ACTİVİTYDEKİ NESNELERİN DURMASIYLA ÇALIŞIR.
    }

    @Override
    protected void onStart() {
        System.out.println("onstart calştı");
        super.onStart();
        //TEKRAR AÇILMASIYLA DURUMUYLA ÇALISIR
    }


    public  void ikinciaktivity(View v){
        Intent intent=new Intent( this, MainActivity2.class);
        startActivity(intent);

    }
}