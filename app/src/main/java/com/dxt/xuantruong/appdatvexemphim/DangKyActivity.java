package com.dxt.xuantruong.appdatvexemphim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DangKyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        Button LoginBtn = (Button)findViewById(R.id.signUpBtn);
        LoginBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //String tc = "Thanh cong";
                //Toast.makeText(this, tc, Toast.LENGTH_SHORT).show();
            }
        });
    }


}
