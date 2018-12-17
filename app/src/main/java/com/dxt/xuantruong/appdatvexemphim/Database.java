package com.dxt.xuantruong.appdatvexemphim;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {

    // Khai bao ten CSDL, ten bang, ten version
    public static final String DATABASE_NAME = "cinema.db";
    public static final String TABLE_NAME = "phim";
    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    // Truy van khong tra ket qua: CREATE, INSERT, UPDATE, DELETE
    public void QueryData(String sql)
    {
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }

    // Truy van co tra ket qua: SELECT
    public Cursor GetData(String sql)
    {
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql, null);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
