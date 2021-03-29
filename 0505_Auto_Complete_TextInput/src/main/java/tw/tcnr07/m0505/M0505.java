package tw.tcnr07.m0505;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class M0505 extends AppCompatActivity {

    private Button b001;
    private Button b002;
    private AutoCompleteTextView a001;
    private ArrayAdapter<String> ans01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0505);
        setupViewcompenet();

    }

    private void setupViewcompenet() {
    b001=(Button)findViewById(R.id.m0505_b001);
    b002=(Button)findViewById(R.id.m0505_b002);
    a001=(AutoCompleteTextView)findViewById(R.id.m0505_a001);
    b001.setOnClickListener(b001ON);
    b002.setOnClickListener(b001ON);

    ans01=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);
    a001.setAdapter(ans01);



    }
    private View.OnClickListener b001ON=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.m0505_b001:
                    String s= a001.getText().toString();
                    ans01.add(s);
                    a001.setText("");
                break;
                case R.id.m0505_b002:
                    ans01.clear();
                    break;
            }


        }
    };
}