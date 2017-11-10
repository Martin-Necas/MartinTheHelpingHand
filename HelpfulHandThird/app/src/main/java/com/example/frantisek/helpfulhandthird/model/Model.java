package com.example.frantisek.helpfulhandthird.model;

/**
 * Created by erasmus on 9.11.2017.
 */

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import com.example.frantisek.helpfulhandthird.note.Note;

import java.util.ArrayList;

public final class Model {
    private final Helper helper;

    private final SQLiteDatabase database;

    public Model(Context context) {
        helper = new Helper(context);
        database = helper.getWritableDatabase();
    }
    private final String TABLE_NAME = "registration";

    public static String COL_ID = "reg_id";
    public static String COL_name = "name";
    public static String COL_surname = "surname";
    public static String COL_email = "email";
    public static String COL_password = "password";

    public void insertNote(String name, String surname, String email, String password) {
        String SQL = String.format("INSERT INTO %s (%S, %S, %S) VALUES (?, ?, ?);",
                TABLE_NAME, COL_name, COL_surname, COL_email,COL_password, name, surname, email, password);

        database.execSQL(SQL, new String[] {name, surname, email, password});
    }

    public ArrayList<Note> fetchAllNotes() {
        ArrayList<Note> arrayList = new ArrayList<>();

        String SQL = String.format("SELECT %s, %s, %s FROM %s;",
                COL_ID, COL_name, COL_surname, COL_email,COL_password, TABLE_NAME);

        Cursor cursor = database.rawQuery(SQL, new String[] {});

        if (cursor.moveToFirst()) {
           do {
                arrayList.add(new Note(cursor));
            } while (cursor.moveToNext());
        }


        return arrayList;
    }
}