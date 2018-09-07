package com.example.iiucuser2.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btadd,btsub,btmul,btdiv,btequ,btclear;
    private TextView ans,val1,val2;
    private double num1,num2;
    private int c=0;
    private boolean add,mul,sub,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button)findViewById(R.id.btn1);
        bt2=(Button)findViewById(R.id.btn2);
        bt3=(Button)findViewById(R.id.btn3);
        bt4=(Button)findViewById(R.id.btn4);
        bt5=(Button)findViewById(R.id.btn5);
        bt6=(Button)findViewById(R.id.btn6);
        bt7=(Button)findViewById(R.id.btn7);
        bt8=(Button)findViewById(R.id.btn8);
        bt9=(Button)findViewById(R.id.btn9);
        bt0=(Button)findViewById(R.id.btn0);
        btadd=(Button)findViewById(R.id.btnadd);
        btsub=(Button)findViewById(R.id.btnsub);
        btmul=(Button)findViewById(R.id.btnmul);
        btdiv=(Button)findViewById(R.id.btndiv);
        btequ=(Button)findViewById(R.id.btnequ);
        btclear=(Button)findViewById(R.id.btnclear);

        ans=(TextView)findViewById(R.id.result);
        val1=(TextView)findViewById(R.id.val1);
        val2=(TextView)findViewById(R.id.val2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText().toString()+"1");
                if(c>0){
                    val2.setText(val2.getText().toString()+"1");
                }

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText().toString()+"2");
                if(c>0){
                    val2.setText(val2.getText().toString()+"2");
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText().toString()+"3");
                if(c>0){
                    val2.setText(val2.getText().toString()+"3");
                }
            }

        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText().toString()+"4");
                if(c>0){
                    val2.setText(val2.getText().toString()+"4");
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText().toString()+"5");
                if(c>0){
                    val2.setText(val2.getText().toString()+"5");
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText().toString()+"6");
                if(c>0){
                    val2.setText(val2.getText().toString()+"6");
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText().toString()+"7");
                if(c>0){
                    val2.setText(val2.getText().toString()+"7");
                }
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText().toString()+"8");
                if(c>0){
                    val2.setText(val2.getText().toString()+"8");
                }
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText().toString()+"9");
                if(c>0){
                    val2.setText(val2.getText().toString()+"9");
                }
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText().toString()+"0");
                if(c>0){
                    val2.setText(val2.getText().toString()+"0");
                }
            }
        });

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(ans.getText().toString()+"");
                add=true;
                val1.setText(ans.getText().toString()+"");
                ans.setText(null);
                c++;
                val2.setText(null);

            }
        });

        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(ans.getText().toString()+"");
                sub=true;
                val1.setText(ans.getText().toString()+"");
                ans.setText(null);
                c++;
                val2.setText(null);
            }
        });

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(ans.getText().toString()+"");
                mul=true;
                val1.setText(ans.getText().toString()+"");
                ans.setText(null);
                c++;
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(ans.getText().toString()+"");
                div=true;
                val1.setText(ans.getText().toString()+"");
                ans.setText(null);
                c++;
            }
        });
        btequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2=Double.parseDouble(ans.getText()+"");
                if(add==true){
                    ans.setText(num1+"+"+num2+"="+(num1+num2));
                    add=false;
                }
                if(sub==true){
                    ans.setText(num1+"-"+num2+"="+(num1-num2));
                    sub=false;
                }
                if(mul==true){
                    ans.setText(num1+"*"+num2+"="+(num1*num2));
                    mul=false;
                }
                if(div==true){
                    ans.setText(num1+"/"+num2+"="+(num1/num2));
                    div=false;
                }
            }
        });
        btclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    ans.setText(null);
                    val1.setText(null);
                    val2.setText(null);
                    c=0;
            }
        });
    }
}
