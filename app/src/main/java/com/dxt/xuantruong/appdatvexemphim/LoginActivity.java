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
            String sdt = dataKH.getString(3);
            String pass = dataKH.getString(5);
            Toast.makeText(this, "sdt: "+sdt +"/pass: "+pass, Toast.LENGTH_SHORT).show();
        }

        TextView register = (TextView)findViewById(R.id.createAccount);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, DangKyActivity.class);
                startActivity(intent);
            }
        });

        Button loginbtn = (Button)findViewById(R.id.loginBtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText sdt2 = (EditText)findViewById(R.id.login_phone);
                String sdt = sdt2.getText().toString();
                EditText matkhau1 = (EditText)findViewById(R.id.login_password);
                String matkhau = matkhau1.getText().toString();
                Button loginbtn = (Button)findViewById(R.id.loginBtn);

                int flat = 0;
                Cursor dataKH1 = database.GetData("SELECT * FROM KhachHang WHERE Sdt LIKE '" + sdt + "' AND MatKhau LIKE '"+ matkhau +"'");
//                while (dataKH1.moveToNext())
//                {
//                    String ten = dataKH1.getString(3);
//                    Toast.makeText(LoginActivity.this, ten, Toast.LENGTH_SHORT).show();
//                }
                while (dataKH1.moveToNext())
                {
                    String ten = dataKH1.getString(3);
                    if(ten != null)
                    {
                        flat = 1;
                        break;
                    }
                    //Toast.makeText(LoginActivity.this, ten, Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(LoginActivity.this, sdt+ ":" + matkhau, Toast.LENGTH_SHORT).show();
                if(flat == 1)
                {
                    Intent intent = new Intent(LoginActivity.this, IndexActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
