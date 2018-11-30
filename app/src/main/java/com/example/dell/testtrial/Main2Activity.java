package com.example.dell.testtrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextnum1;
    EditText editTextnum2;
    Button add;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextnum1=findViewById(R.id.editTextnum1);
        editTextnum2=findViewById(R.id.editTextnum2);
        findViewById(R.id.add).setOnClickListener(this);
        res=findViewById(R.id.result);

       /* add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editTextnum1.getText().toString().equals("") || editTextnum2.getText().toString().equals(""))
                {
                    Toast.makeText(Main2Activity.this, "Enter number", Toast.LENGTH_SHORT).show();
                }
                else {

                    String num=editTextnum1.getText().toString();
                    String num2=editTextnum2.getText().toString();

                    int no1=Integer.parseInt(num);
                    int no2=Integer.parseInt(num2);

                    int no3=no1+no2;
                    String fi=Integer.toString(no3);
                    res.setText(fi);



                }



            }
        });*/
    }

    public void tonavact(View view) {
        Intent i=new Intent(getApplication(),Navact.class);
        startActivity(i);

    }

    @Override
    public void onClick(View v) {
        if(editTextnum1.getText().toString().equals("") || editTextnum2.getText().toString().equals(""))
        {
            Toast.makeText(Main2Activity.this, "Enter number", Toast.LENGTH_SHORT).show();
        }
        else {

            String num=editTextnum1.getText().toString();
            String num2=editTextnum2.getText().toString();

            int no1=Integer.parseInt(num);
            int no2=Integer.parseInt(num2);

            int no3=no1+no2;
            String fi=Integer.toString(no3);
            res.setText(fi);



        }

    }
}
