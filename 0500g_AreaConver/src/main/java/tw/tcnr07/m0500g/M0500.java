package tw.tcnr07.m0500g;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class M0500 extends AppCompatActivity {
    private EditText e001;
    private Button b001;
    private TextView t003;
    private TextView t005;
    private TextView t007;

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
        t003 = (TextView) findViewById(R.id.m0500_t003);
        t005=(TextView)findViewById(R.id.m0500_t005);
        t007=(TextView)findViewById(R.id.m0500_t007);
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
            String output = pondsFormat.format(Float.parseFloat(e001.getText().toString()) / 2934);
            t003.setText(output);
            String output1 = pondsFormat.format(Float.parseFloat(e001.getText().toString()) * 3.3058);
            t005.setText(output1);
            String output2 = pondsFormat.format(Float.parseFloat(e001.getText().toString()) * 0.03305785);
            t007.setText(output2);
        }
    };


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.m0500);
//    }
}