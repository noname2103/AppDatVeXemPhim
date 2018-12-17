package com.dxt.xuantruong.appdatvexemphim;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Database database;

    EditText edituser,editpass;
    Button btnlogin;
    TextView tvcreate,tvforgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Tao database rap chieu phim
        database = new Database(this, "cinema.db", null, 1);

        // Truy van database
        // select data
        Cursor dataKH = database.GetData("SELECT * FROM KhachHang");
        while (dataKH.moveToNext())
        {
            String ten = dataKH.getString(1);
            Toast.makeText(this, ten, Toast.LENGTH_SHORT).show();
        }
        anhxa();
        ControllButton();
        TextView register = (TextView)findViewById(R.id.createAccount);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, DangKyActivity.class);
                startActivity(intent);
            }
        });
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
