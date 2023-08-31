package com.example.javaoopdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kopek kopek = new Kopek("Max", "Yeşil", "Siyah");
        Kopek kopek2 = new Kopek();
        kopek2.isim = "Kopek 2";
        System.out.println(kopek2.isim);
        kopek2.turIsmi = "test";
        System.out.println(kopek2.turIsmi);
        //System.out.println(turIsmi);
        System.out.println(kopek.turIsmi);
        kopek.konusKopek();
        Kopek.konusKopekStatic();

        At at = new At();
        At at2 = new At("Zeno", "Mavi", "Siyah");
        System.out.println(at2.tuyRengi);




    }

    public void test() {
    }
}