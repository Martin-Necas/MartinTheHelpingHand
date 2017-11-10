package com.example.frantisek.helpfulhandthird.note;

import android.database.Cursor;

import com.example.frantisek.helpfulhandthird.model.Model;


/**
 * Created by erasmus on 10.11.2017.
 */

public final class Note {

    public final int id;
    public final String name;
    public final String surname;
    public final String email;
    public final String password;

    public Note (Cursor cursor) {
        int id_index = cursor.getColumnIndex(Model.COL_ID);
        int name_index = cursor.getColumnIndex(Model.COL_name);
        int surname_index = cursor.getColumnIndex(Model.COL_surname);
        int email_index = cursor.getColumnIndex(Model.COL_email);
        int password_index = cursor.getColumnIndex(Model.COL_password);

        id = cursor.getInt(id_index);
        name = cursor.getString(name_index);
        surname = cursor.getString(surname_index);
        email = cursor.getString(email_index);
        password = cursor.getString(password_index);
    }
}