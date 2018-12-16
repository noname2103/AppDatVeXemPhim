package com.dxt.xuantruong.appdatvexemphim;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class IndexActivity extends AppCompatActivity {

    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        // Tao database rap chieu phim
        database = new Database(this, "rapphim.sqlite", null, 1);

        // Tao bang phim
        //database.QueryData("CREATE TABLE Phim(Id INTEGER PRIMARY KEY AUTOINCREMENT, Tenphim VARCHAR(100))");
        //database.QueryData("CREATE TABLE IF NOT EXITS Phim(Id INTEGER PRIMARY KEY, Tenphim VARCHAR(100))");
        //database.QueryData();

        // Nhap du lieu
        database.QueryData("INSERT INTO Phim VALUES(null, 'Nhoc Trum')");

        // select data
        Cursor dataPhim = database.GetData("SELECT * FROM Phim");
        while (dataPhim.moveToNext())
        {
            String ten = dataPhim.getString(1);
            Toast.makeText(this, ten, Toast.LENGTH_SHORT).show();
        }
    }
}
