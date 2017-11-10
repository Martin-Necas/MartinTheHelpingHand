package com.example.frantisek.helpfulhandthird.model;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Initialized database
 */


final class Helper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "registration_database";
    private static final int DATABASE_VERSION = 1;

    public Helper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE registration( reg_id INTEGER AUTO_INCREMENT PRIMARY KEY, name TEXT, surname TEXT, email TEXT,password TEXT );, ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
