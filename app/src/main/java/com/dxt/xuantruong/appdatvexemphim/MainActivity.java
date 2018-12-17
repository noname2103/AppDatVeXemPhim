package com.dxt.xuantruong.appdatvexemphim;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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
        database.QueryData("CREATE TABLE IF NOT EXISTS PHIM\n" +
                "(\n" +
                "\tMAPHIM NVARCHAR(10),\n" +
                "\tTENPHIM NVARCHAR(100),\n" +
                "\tPRIMARY KEY(MAPHIM)\n" +
                ")");
        Cursor dataPhim = database.GetData("SELECT * FROM Phim");
        while (dataPhim.moveToNext()){
            String ten =dataPhim.getString(1);
            int id =dataPhim.getInt(0);
            arrayPhim.add(new Phim(id,ten));
        }
    }
}
