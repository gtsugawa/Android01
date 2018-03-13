package com.example.u_08_et.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView r = findViewById(R.id.respuestas);

        int n1 = 5;
        int n2 = 2;
        int s1 = n1 + n2;
        int s2 = n1 - n2;
        int s3 = n1*n2;
        int s4 = n1/n2;
        int s5 = n1%n2;

        boolean b1 = true;
        boolean b2 = false;

        boolean s6 = b1 && b2;
        boolean s7 = b1 || b2;
        boolean s8 = !b1;

        boolean s9 = n1 > n2;
        boolean s10 = n1 >= n2;
        boolean s11 = n1 < n2;
        boolean s12 = n1 <= n2;
        boolean s13 = n1 == n2;
        boolean s14 = n1 != n2;

        int s15 = n1++;
        int s16 = ++n1;
        int s17 = n1--;
        int s18 = --n1;

        n2 *= n2;
        n1 *= n1;

        r.setText(String.valueOf(s1)+"\r\n"
                 +String.valueOf(s2)+"\r\n"
                 +String.valueOf(s3)+"\r\n"
                 +String.valueOf(s4)+"\r\n"
                 +String.valueOf(s5)+"\r\n"
                +String.valueOf(s6)+"\r\n"
                +String.valueOf(s7)+"\r\n"
                +String.valueOf(s8)+"\r\n"
                +String.valueOf(s9)+"\r\n"
                +String.valueOf(s10)+"\r\n"
                +String.valueOf(s11)+"\r\n"
                +String.valueOf(s12)+"\r\n"
                +String.valueOf(s13)+"\r\n"
                +String.valueOf(s14)+"\r\n"
                +String.valueOf(s15)+"\r\n"
                +String.valueOf(s16)+"\r\n"
                +String.valueOf(s17)+"\r\n"
                +String.valueOf(s18)+"\r\n"
                +String.valueOf(n2) + "\r\n CAMBIOS EFECTUADOS" +String.valueOf(n2));
    }
}
