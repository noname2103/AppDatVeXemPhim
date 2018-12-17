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

public class DangKyActivity extends AppCompatActivity {

    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        // Tao database rap chieu phim
        database = new Database(this, "cinema.db", null, 1);


        Button LoginBtn = (Button)findViewById(R.id.signUpBtn);
        LoginBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText hoten1 = (EditText) findViewById(R.id.edtTenkh);
                String hoten = hoten1.getText().toString();
                EditText email1 = (EditText) findViewById(R.id.edtEmail);
                String email = email1.getText().toString();
                EditText sdt1 = (EditText) findViewById(R.id.edtDt);
                String sdt = sdt1.getText().toString();
                EditText diachi1 = (EditText) findViewById(R.id.edtDiachi);
                String diachi = diachi1.getText().toString();
                EditText matkhau1 = (EditText) findViewById(R.id.edtMatkhau);
                String matkhau = matkhau1.getText().toString();
                EditText rematkhau1 = (EditText) findViewById(R.id.edtNhaplaimk);
                String rematkhau = rematkhau1.getText().toString();

//                if(matkhau.toString() != rematkhau.toString())
//                {
//                    Toast.makeText(DangKyActivity.this, "Không trùng mật khẩu" , Toast.LENGTH_SHORT).show();
//                }
//                else if(hoten == null)
//                {
//                    Toast.makeText(DangKyActivity.this, "Bạn phải nhập họ tên" , Toast.LENGTH_SHORT).show();
//                }
                // Tao bang phim
                //database.QueryData("CREATE TABLE KhachHang(Id_kh INTEGER PRIMARY KEY AUTOINCREMENT, TenKhachHang NVARCHAR(100),Email VARCHAR(100), Sdt VARCHAR(15), DiaChi NVARCHAR(150), MatKhau VARCHAR(100))");
                // Nhap du lieu
                database.QueryData("INSERT INTO KhachHang VALUES(null,'"+ hoten +"','"+ email +"','"+ sdt +"','"+ diachi +"','"+ matkhau +"')");

                Intent intent = new Intent(DangKyActivity.this, LoginActivity.class);
                startActivity(intent);


            }
        });
    }


}
