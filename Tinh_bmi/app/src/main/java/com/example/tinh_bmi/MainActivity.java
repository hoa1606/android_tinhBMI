package com.example.tinh_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt_chieucao, edt_cannang;
    Button btn_tinh;
    TextView tv_ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ánh xạ       //là kết nối vs phần activity
        tv_ketqua = (TextView) findViewById(R.id.textView_ketqua);
        btn_tinh = (Button) findViewById(R.id.button);
        edt_cannang = (EditText) findViewById(R.id.editText_cannang);
        edt_chieucao = (EditText) findViewById(R.id.editText_chieucao);

        btn_tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}