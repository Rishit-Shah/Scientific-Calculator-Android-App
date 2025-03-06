package com.example.scientific_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bck, bc,bb1, bb2, bbc, bbc2, bbc3, bbc4, bl1, bll2, bll3 , bll4, bcc, bcc2, bcc3, bcc4, baa, baa2, baa3, baa4,bla, bla2, bla3 , bla4, bam , bam2, bam3, bam4;
    TextView tvmain, tvsec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome to Calc Clone", Toast.LENGTH_SHORT).show();
        bck= findViewById(R.id.bck);
        bc= findViewById(R.id.bc);
        bb1= findViewById(R.id.bb1);
        bb2= findViewById(R.id.bb2);
        bbc= findViewById(R.id.bbc);
        bbc2= findViewById(R.id.bbc2);
        bbc3= findViewById(R.id.bbc3);
        bbc4= findViewById(R.id.bbc4);
        bl1= findViewById(R.id.bl1);
        bll2= findViewById(R.id.bll2);
        bll3= findViewById(R.id.bll3);
        bll4= findViewById(R.id.bll4);
        bcc= findViewById(R.id.bcc);
        bcc2= findViewById(R.id.bcc2);
        bcc3= findViewById(R.id.bcc3);
        bcc4= findViewById(R.id.bcc4);
        baa= findViewById(R.id.baa);
        baa2= findViewById(R.id.baa2);
        baa3= findViewById(R.id.baa3);
        baa4= findViewById(R.id.baa4);
        bla= findViewById(R.id.bla);
        bla2= findViewById(R.id.bla2);
        bla3= findViewById(R.id.bla3);
        bla4= findViewById(R.id.bla4);
        bam = findViewById(R.id.bam);
        bam2 = findViewById(R.id.bam2);
        bam3 = findViewById(R.id.bam3);
        bam4 = findViewById(R.id.bam4);
        tvsec= findViewById(R.id.tvsec);
        tvmain= findViewById(R.id.tvmain);

        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+ "1");
            }
        });
    }
}