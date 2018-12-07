package com.example.dell.testtrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class LoaderAct extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.symptoms, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = parent.getItemAtPosition(position).toString();
        switch (selectedItem) {
            case "Select one Item":
                break;
            case "Common Fever":
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Dark Circles":
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Obesity":
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Stress":
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Wrinkles":
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
