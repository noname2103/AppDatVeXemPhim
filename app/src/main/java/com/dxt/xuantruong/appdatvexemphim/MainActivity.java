package com.dxt.xuantruong.appdatvexemphim;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Database database;
    ListView lvPhim;
    ArrayList<Phim> arrayPhim;
    PhimAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPhim  = (ListView)findViewById(R.id.lvPhim);
        lvPhim.setAdapter(adapter);
        arrayPhim  = new ArrayList<>();
        adapter = new PhimAdapter(this,R.layout.tenphim,arrayPhim);
        database = new Database(this, "cinema.db", null, 1);
        //database.QueryData("CREATE TABLE Phim (Id_ph INTEGER PRIMARY KEY AUTOINCREMENT, TenPhim NVARCHAR(100), NgayChieu DATETIME, ThoiLuong VARCHAR(10), TheLoai NVARCHAR(20), DaoDien NVARCHAR(100), DienVien NVARCHAR(300), NgonNgu NVARCHAR(50))");

        //database.QueryData("INSERT INTO Phim VALUES(null, 'Avenger4', 09/09/2019, '1:30', 'Ao tuong', 'Marvel','Minh Trung', 'English')");
        //database.QueryData("INSERT INTO Phim VALUES(null, 'NhocTrum', 04/09/2019, '2:30', 'Hoat hinh', 'DC','Xuan Truong', 'English')");

        Cursor dataPhim = database.GetData("SELECT * FROM Phim");

        while (dataPhim.moveToNext()){
            String ten = dataPhim.getString(1);
            int id =dataPhim.getInt(0);
            arrayPhim.add(new Phim(id,ten));
            //Toast.makeText(MainActivity.this,ten,Toast.LENGTH_SHORT).show();
        }

        adapter.notifyDataSetChanged();
    }
}
