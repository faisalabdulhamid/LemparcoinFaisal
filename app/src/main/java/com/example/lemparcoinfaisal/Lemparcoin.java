package com.example.lemparcoinfaisal;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Lemparcoin extends Activity implements View.OnClickListener {
    private Button buttonLempar;
    private Button buttonUlang;
    private Button buttonkeluar;
    private Random acak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        acak = new Random();
        setContentView(R.layout.activity_lemparcoin);
        buttonLempar = (Button) findViewById(R.id.buttonlempar);
        buttonUlang = (Button) findViewById(R.id.buttonulang);
        buttonkeluar = (Button) findViewById(R.id.buttonkeluar);
        buttonLempar.setOnClickListener(this);
        buttonkeluar.setOnClickListener(this);
        buttonkeluar.setOnClickListener(this);

    }
    @Override
    public void onClick (View view){
        if (view==buttonLempar){
            Log.d("CLIK EVENT", "Lempar button di klik");
            TextView tw=(TextView)findViewById(R.id.textView1);
            ImageView iw=(ImageView)findViewById(R.id.imageView1);

            if (acak.nextDouble()<0.5){
                tw.setText("kepala");
                iw.setImageResource(R.drawable.head);

            }else {
                tw.setText("Cross");
                iw.setImageResource(R.drawable.tail);

            }
            buttonLempar.setVisibility(View.INVISIBLE);
            buttonkeluar.setVisibility(View.VISIBLE);
            buttonkeluar.setVisibility(View.VISIBLE);

        }
        else if (view==buttonUlang){
            TextView tw=(TextView)findViewById(R.id.textView1);
            ImageView iw=(ImageView)findViewById(R.id.imageView1);

            buttonLempar.setVisibility(View.VISIBLE);
            buttonUlang.setVisibility(View.INVISIBLE);
            buttonkeluar.setVisibility(View.INVISIBLE);

        }
        else if (view==buttonkeluar){
            this.finish();
        }
    }
}