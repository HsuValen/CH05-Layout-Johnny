package tw.tcnr07.m0502;

import android.os.Bundle;
import android.view.View;


import android.widget.Button;

import android.widget.RadioButton;
import android.widget.RadioGroup;


import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0502 extends AppCompatActivity {


    private Button b001;

    private TextView ans01;
    //    private int iAge;

    private RadioGroup rb01;
    private RadioGroup rb02;
    private RadioButton rb021;
    private RadioButton rb022;
    private RadioButton rb023;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0502);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
//        設定LayOut配置

        b001 = (Button) findViewById(R.id.m0502_b001); //按鈕婚姻建議

        ans01 = (TextView) findViewById((R.id.m0502_f000)); //顯示建議

        rb01 = (RadioGroup) findViewById(R.id.m0502_r001); //性別
        rb02 = (RadioGroup) findViewById(R.id.m0502_r002); //年齡
        rb021 = (RadioButton) findViewById(R.id.m0502_r002a);
        rb022 = (RadioButton) findViewById(R.id.m0502_r002b);
        rb023 = (RadioButton) findViewById(R.id.m0502_r002c);


//        rb01.setOnCheckedChangeListener(r001ON);
        b001.setOnClickListener(b001ON); //宣告按鈕及
        rb01.setOnCheckedChangeListener(radGSexOnCheChanLis);// 群組監聽
    }

    private RadioGroup.OnCheckedChangeListener radGSexOnCheChanLis = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.m0502_r001a: //點男
                    rb021.setText(getString(R.string.m0502_r002aa));
                    rb022.setText(getString(R.string.m0502_r002ab));
                    rb023.setText(getString(R.string.m0502_r002ac));
                    break;
                case R.id.m0502_r001b: //點女
                    rb021.setText(getString(R.string.m0502_r002ba));
                    rb022.setText(getString(R.string.m0502_r002bb));
                    rb023.setText(getString(R.string.m0502_r002bc));
                    break;

            }
        }
    };


//    private AdapterView.OnItemSelectedListener s001ON = new AdapterView.OnItemSelectedListener(
//
//    ) {
//        @Override
//        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//        }
//
//        @Override
//        public void onNothingSelected(AdapterView<?> parent) {
//
//        }
//    }

//    }

//    private AdapterView.OnItemSelectedListener s001ON = new AdapterView.OnItemSelectedListener() {
//        @Override
//        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
////    sSex=parent.getSelectedItem().toString();
//            sSex = parent.getSelectedItem().toString();
//        }
//
//        @Override
//        public void onNothingSelected(AdapterView<?> parent) {
//
//        }
//    };

    private View.OnClickListener b001ON;

    {
        b001ON = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSug = getString(R.string.m0502_f000);
                // 檢查 年齡是否有輸入
                int rSex = rb01.getCheckedRadioButtonId();
                switch (rSex) {
                    case R.id.m0502_r001a:// 男
                        switch (rb02.getCheckedRadioButtonId()) {
                            case R.id.m0502_r002a:
                                strSug += getString(R.string.m0502_f001);
                                break;
                            case R.id.m0502_r002b:
                                strSug += getString(R.string.m0502_f002);
                                break;
                            case R.id.m0502_r002c:
                                strSug += getString(R.string.m0502_f003);
                                break;

                        }
                        break;
                    ////////////////////////////////////////////////////////////////
                    case R.id.m0502_r001b://女
                        switch (rb02.getCheckedRadioButtonId()) {
                            case R.id.m0502_r002a:
                                strSug += getString(R.string.m0502_f004);
                                break;
                            case R.id.m0502_r002b:
                                strSug += getString(R.string.m0502_f005);
                                break;
                            case R.id.m0502_r002c:
                                strSug += getString(R.string.m0502_f006);
                                break;

                        }
                        break;
//                Switch(sSex){
//                    case R.id.m0502_r001a:
////                        Switch(){
////                        case :
////
////                            break;
////                    }
//                        break;
//                        //-------------------------------------------
//                    case R.id.m0502_r001b:
//                        break;
                }
                ans01.setText(strSug); //請勿輸入空白
            }
        };
    }
};
