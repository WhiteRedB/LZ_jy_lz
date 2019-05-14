package com.example.msi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_BOOK="ceeate table Book("
        +"id integer primary key autoincrement,"
        +"author text,"
        +"price real,"
        +"pages integer,"
        +"name text"
        +")" ;
    private Context context;
    public MyDatabaseHelper(
            Context context,
            String name,
            SQLiteDatabase.CursorFactory factory,
            int version){
        super(context,name,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){

    }
    @Override
    public void onUpgrade(SQLiteDatabase db,
            int oldVersion,
            int newVersion              )
    {

    }
}
