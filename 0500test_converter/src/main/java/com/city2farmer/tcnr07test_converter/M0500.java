package com.city2farmer.tcnr07test_converter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class M0500 extends AppCompatActivity {
    private EditText e001;
    private Button b001;
    private TextView t003;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
//        設定Layout配置
        e001 = (EditText) findViewById(R.id.m0500_e001); //輸入公斤數
        b001 = (Button) findViewById(R.id.m0500_b001); //按鈕執行換算
//        t003=(TextView)findViewById(R.id.m0500_t003);
        t003 = (TextView) findViewById(R.id.m0500_t003); //顯示磅數
        b001.setOnClickListener(b001ON); //宣告按鈕監聽
    }
//private View.OnClickListener b001ON=new View.OnClickListener() {
//
//    @Override
//    public void onClick(View v) {
//
//    }
//};

//    private View.OnClickListener b001ON=new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//
//    };
//}

//private View.OnClickListener b001ON=new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//
//    };
//}

    //    private View.OnClickListener b001ON=new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//        }
//    };
//
    private View.OnClickListener b001ON = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat pondsFormat = new DecimalFormat("0.0000");
            String output = pondsFormat.format(Float.parseFloat(e001.getText().toString()) * 2.20462262);
            t003.setText(output);
        }
    };


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.m0500);
//    }
}