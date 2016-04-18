package com.paulo.calculator;

import android.renderscript.Long4;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView out;
    private TextView Value;
    private TextView opr;
    private Button sev;
    private Button eig;
    private Button nin;
    private Button fur;
    private Button fiv;
    private Button six;
    private Button one;
    private Button two;
    private Button tre;
    private Button eql;
    private Button zer;
    private Button pls;
    private Button min;
    private Button tim;
    private Button ovr;
    private Button squ;
    private Button sqrt;
    private Button cos;
    private Button sen;
    private Button ce;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = (TextView) findViewById(R.id.out);
        Value = (TextView) findViewById(R.id.Value);
        opr = (TextView) findViewById(R.id.opr);
    }

    public void dispNum(String a){
        if(Long.parseLong(out.getText().toString()) == 0){
            out.setText(String.valueOf(a));
        }
        else{
            String r = Long.parseLong(out.getText().toString()) + a;
            out.setText(String.valueOf(r));
        }
    }


    public void sev(View v){
        String a = "7";
        dispNum(a);
    }
    public void one(View v){
        String a = "1";
        dispNum(a);
    }
    public void two(View v){
        String a = "2";
        dispNum(a);
    }
    public void tre(View v){
        String a = "3";
        dispNum(a);
    }
    public void fur(View v){
        String a = "4";
        dispNum(a);
    }
    public void fiv(View v){
        String a = "5";
        dispNum(a);
    }
    public void six(View v){
        String a = "6";
        dispNum(a);
    }
    public void eig(View v){
        String a = "8";
        dispNum(a);
    }
    public void nin(View v){
        String a = "9";
        dispNum(a);
    }
    public void zer(View v){
        String a = "0";
        dispNum(a);
    }

    public void pls(View v){
        String t = "+";
        opr.setText(String.valueOf(t));
        String i = " ";
        String a = "Nao e possivel dividir por zero";
        String b = "Nao existe raiz real de numero negativo";

        if (out.getText().equals(a) || out.getText().equals(b)) {
            String r = "0";
            out.setText(String.valueOf(r));
        }
        if (Value.getText().equals(String.valueOf(i))){
            float q = Float.parseFloat(out.getText().toString());
            Value.setText(String.valueOf(q));
            int r = 0;
            out.setText(String.valueOf(r));
        }
        else {
            float x = Float.parseFloat(Value.getText().toString());
            float y = Float.parseFloat(out.getText().toString());
            float q = x + y;
            Value.setText(String.valueOf(q));
            int r = 0;
            out.setText(String.valueOf(r));
        }
    }

    public void min(View v){
        String t = "-";
        opr.setText(String.valueOf(t));
        String i = " ";
        String a = "Nao e possivel dividir por zero";
        String b = "Nao existe raiz real de numero negativo";
        if (out.getText().equals(a) || out.getText().equals(b)) {
            String r = "0";
            out.setText(String.valueOf(r));
        }
        if (Value.getText().equals(String.valueOf(i))){
            float q = Float.parseFloat(out.getText().toString());
            Value.setText(String.valueOf(q));
            int r = 0;
            out.setText(String.valueOf(r));
        }
        else {
            float x = Float.parseFloat(Value.getText().toString());
            float y = Float.parseFloat(out.getText().toString());
            float q = x - y;
            Value.setText(String.valueOf(q));
            int r = 0;
            out.setText(String.valueOf(r));
        }
    }
    public void tim(View v){
        String t = "*";
        opr.setText(String.valueOf(t));
        String i = " ";
        String a = "Nao e possivel dividir por zero";
        String b = "Nao existe raiz real de numero negativo";
        if (out.getText().equals(a) || out.getText().equals(b)) {
            String r = "0";
            out.setText(String.valueOf(r));
        }
        if (Value.getText().equals(String.valueOf(i))){
            float q = Float.parseFloat(out.getText().toString());
            Value.setText(String.valueOf(q));
            int r = 0;
            out.setText(String.valueOf(r));
        }
        else{
            float x = Float.parseFloat(Value.getText().toString());
            float y = Float.parseFloat(out.getText().toString());
            float q = x * y;
            Value.setText(String.valueOf(q));
            int r = 0;
            out.setText(String.valueOf(r));
        }
    }
    public void ovr(View v){
        String t = "/";
        opr.setText(String.valueOf(t));
        String i = " ";
        String a = "Nao e possivel dividir por zero";
        String b = "Nao existe raiz real de numero negativo";
        if (out.getText().equals(a) || out.getText().equals(b)) {
            String r = "0";
            out.setText(String.valueOf(r));
        }
        if (Value.getText().equals(String.valueOf(i))){
            float q = Float.parseFloat(out.getText().toString());
            Value.setText(String.valueOf(q));
            int r = 0;
            out.setText(String.valueOf(r));
        }
        else {
            if (Float.parseFloat(out.getText().toString()) == 0) {
                String q = "Nao e possivel dividir por zero";
                opr.setText(String.valueOf(q));
            }
            else {
                float x = Float.parseFloat(Value.getText().toString());
                float y = Float.parseFloat(out.getText().toString());
                float q = x / y;
                Value.setText(String.valueOf(q));
            }
            int r = 0;
            out.setText(String.valueOf(r));
        }
    }
    public void ce(View v){
        String r = "0";
        out.setText(String.valueOf(r));
        String s = " ";
        opr.setText(String.valueOf(s));
        String q = " ";
        Value.setText(String.valueOf(q));
    }

    public void squ(View v){
        String a = "Nao e possivel dividir por zero";
        String b = "Nao existe raiz real de numero negativo";
        if (out.getText().equals(a) || out.getText().equals(b)) {
            String r = "0";
            out.setText(String.valueOf(r));
        }
        else {
            float y = Float.parseFloat(out.getText().toString());
            float q = y * y;
            out.setText(String.valueOf(q));
        }
    }
    public void sqrt(View v){
        String a = "Nao e possivel dividir por zero";
        String b = "Nao existe raiz real de numero negativo";
        if (out.getText().equals(a) || out.getText().equals(b)) {
            String r = "0";
            out.setText(String.valueOf(r));
        }
        else {
            double y = Double.parseDouble(out.getText().toString());
            if (y < 0) {
                String e = "Nao existe raiz real de numero negativo";
                opr.setText(String.valueOf(e));
            }
            double q = Math.sqrt(y);
            out.setText(String.valueOf(q));
        }
    }
    public void cos(View v){
        String a = "Nao e possivel dividir por zero";
        String b = "Nao existe raiz real de numero negativo";
        if (out.getText().equals(a) || out.getText().equals(b)) {
            String r = "0";
            out.setText(String.valueOf(r));
        }
        else {
            double y = Double.parseDouble(out.getText().toString());
            double q = Math.cos(y);
            out.setText(String.valueOf(q));
        }
    }
    public void sin(View v){
        String a = "Nao e possivel dividir por zero";
        String b = "Nao existe raiz real de numero negativo";
        if (out.getText().equals(a) || out.getText().equals(b)) {
            String r = "0";
            out.setText(String.valueOf(r));
        }
        else {
            double y = Double.parseDouble(out.getText().toString());
            double q = Math.sin(y);
            out.setText(String.valueOf(q));
        }
    }

    public void eql(View v) {
        String s = "+";
        String d = "-";
        String t = "*";
        String o = "/";
        String i = " ";
        String a = "Nao e possivel dividir por zero";
        String b = "Nao existe raiz real de numero negativo";
        if (opr.getText().equals(i) || opr.getText().equals(a) || opr.getText().equals(b)) {
            String r = "0";
            out.setText(String.valueOf(r));
        }
        else {
            if (opr.getText().toString().equals(String.valueOf(s))) {
                pls(v);
                String r = Value.getText().toString();
                out.setText(String.valueOf(r));
            }
            if (opr.getText().toString().equals(String.valueOf(d))) {
                min(v);
                String r = Value.getText().toString();
                out.setText(String.valueOf(r));
            }
            if (opr.getText().toString().equals(String.valueOf(t))) {
                tim(v);
                String r = Value.getText().toString();
                out.setText(String.valueOf(r));
            }
            if (opr.getText().toString().equals(String.valueOf(o))) {
                if (Float.parseFloat(out.getText().toString()) == 0.0) {
                    String r = "Nao e possivel dividir por zero";
                    out.setText(String.valueOf(r));
                }
                else {
                    ovr(v);
                    String r = Value.getText().toString();
                    out.setText(String.valueOf(r));
                }
            } else {
                String q = out.getText().toString();
                out.setText(String.valueOf(q));
            }

            Value.setText(String.valueOf(i));
            opr.setText(String.valueOf(i));
        }
    }

}
