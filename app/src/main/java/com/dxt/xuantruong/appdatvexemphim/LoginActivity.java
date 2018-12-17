package com.dxt.xuantruong.appdatvexemphim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText edituser,editpass;
    Button btnlogin;
    TextView tvcreate,tvforgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        anhxa();
        ControllButton();
    }

    private void ControllButton() {

    }

    private void anhxa() {
        edituser = (EditText)findViewById(R.id.login_user);
        editpass = (EditText)findViewById(R.id.login_password);
        btnlogin = (Button)findViewById(R.id.loginBtn);
        tvcreate = (TextView)findViewById(R.id.createAccount);
        tvforgot = (TextView)findViewById(R.id.forgot_password);

    }
}
