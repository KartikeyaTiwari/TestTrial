package com.example.dell.testtrial;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import static android.view.View.GONE;
import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    Button button, button2;
    TextView textView;
    EditText editTextEnter;
    ProgressBar progressBar;
    private Object myTask;
    Handler handler;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.nxt);
        textView = findViewById(R.id.textView);
        editTextEnter = findViewById(R.id.editTextenter);
        progressBar = findViewById(R.id.showprogress);
        progressBar.setVisibility(GONE);

        handler = new Handler();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editTextEnter.getText());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getBaseContext(), Main2Activity.class);
                startActivity(i);

            }
        });

    }

    public void addapp(View view) {

        Intent i = new Intent(getBaseContext(), Main3Activity.class);
        startActivity(i);

    }

    public void chatbt(View view) {
        progressBar.setVisibility(View.VISIBLE);

        new Thread(new Runnable() {

            int i = 0;
            int progressStatus = 0;

            public void run() {
                while (progressStatus < 100) {
                    progressStatus += doWork();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Update the progress bar
                    handler.post(new Runnable() {
                        public void run() {
                            progressBar.setProgress(progressStatus);
                            i++;
                        }
                    });
                }

                startActivity(new Intent(MainActivity.this,Chatact.class));
                finish();

            }
            private int doWork() {

                return i * 3;
            }

        }).start();

    }

    public void gotoloaderact(View view) {

        Intent i = new Intent(getBaseContext(), LoaderAct.class);
        startActivity(i);
    }
}

