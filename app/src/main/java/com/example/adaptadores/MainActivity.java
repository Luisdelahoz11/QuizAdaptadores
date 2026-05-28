package com.example.adaptadores;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.example.adaptadores.adaptadores.EquipoAdaptador;
import com.example.adaptadores.clases.Equipos;


public class MainActivity extends AppCompatActivity {

    RecyclerView rcvEquipos;
    List<Equipos> listEquipos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rcvEquipos= findViewById(R.id.rcvEquipos);

        Equipos equ1= new Equipos("https://tmssl.akamaized.net//images/wappen/head/418.png?lm=1729684474","Real Madrid","España","15","1913");
        Equipos equ2= new Equipos("https://tmssl.akamaized.net//images/wappen/head/5.png?lm=1605166627","Milan","Italia","7","1980");
        Equipos equ3= new Equipos("https://tmssl.akamaized.net//images/wappen/head/31.png?lm=1727873452","Liverpool","Inglaterra","6","1967");
        Equipos equ4= new Equipos("https://tmssl.akamaized.net//images/wappen/head/27.png?lm=1729503608","Bayer Munchen","Alemania","6","1976");
        Equipos equ5= new Equipos("https://tmssl.akamaized.net//images/wappen/head/131.png?lm=1406739548","Barcelona FC","España","5","1923");
        Equipos equ6= new Equipos("https://tmssl.akamaized.net//images/wappen/head/985.png?lm=1457975903","Manchester United","Inglaterra","3","1987");


        listEquipos.add(equ1);
        listEquipos.add(equ2);
        listEquipos.add(equ3);
        listEquipos.add(equ4);
        listEquipos.add(equ5);
        listEquipos.add(equ6);



        rcvEquipos.setLayoutManager(new LinearLayoutManager(this));
        rcvEquipos.setAdapter(new EquipoAdaptador(listEquipos));
    }



}