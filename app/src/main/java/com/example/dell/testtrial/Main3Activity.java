package com.example.dell.testtrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        RecyclerView rescylce=findViewById(R.id.recyclerView);
        rescylce.setLayoutManager(new LinearLayoutManager(this));
        String[] lang={"c","C++","Ruby on rails","java","c","C++","Ruby on rails","java"};
        rescylce.setAdapter(new ProgramAdaptar(getApplicationContext(),lang));
    }
}
