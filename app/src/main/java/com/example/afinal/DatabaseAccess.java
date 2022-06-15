package com.example.afinal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.widget.EditText;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c = null;

        private DatabaseAccess(Context context) {
                this.openHelper = new DatabaseOpenHelper(context);
        }

        public static DatabaseAccess getInstance(Context context){
            if(instance==null) {
                instance=new DatabaseAccess(context);
            }
        return instance;

        }

        public void open(){
            this.db = openHelper.getWritableDatabase();
        }

        public void close(){
            if(db!=null){
                this.db.close();
            }
        }

        public String get1Clue(String t){
            c=db.rawQuery("select Loca1 from teams where id = '"+t+"'", new String[]{});
            StringBuffer buffer =new StringBuffer();
            while(c.moveToNext()) {
                String clue = c.getString(0);
                buffer.append(""+clue);
            }
            return buffer.toString();

        }

    public String get2Clue(String t){
        c=db.rawQuery("select Loca2 from teams where id = '"+t+"'", new String[]{});
        StringBuffer buffer =new StringBuffer();
        while(c.moveToNext()) {
            String clue = c.getString(0);
            buffer.append(""+clue);
        }
        return buffer.toString();

    }
    public String get3Clue(String t){
        c=db.rawQuery("select Loca3 from teams where id = '"+t+"'", new String[]{});
        StringBuffer buffer =new StringBuffer();
        while(c.moveToNext()) {
            String clue = c.getString(0);
            buffer.append(""+clue);
        }
        return buffer.toString();

    }

    public String get4Clue(String t){
        c=db.rawQuery("select Loca4 from teams where id = '"+t+"'", new String[]{});
        StringBuffer buffer =new StringBuffer();
        while(c.moveToNext()) {
            String clue = c.getString(0);
            buffer.append(""+clue);
        }
        return buffer.toString();

    }
    public String get5Clue(String t){
        c=db.rawQuery("select Loca5 from teams where id = '"+t+"'", new String[]{});
        StringBuffer buffer =new StringBuffer();
        while(c.moveToNext()) {
            String clue = c.getString(0);
            buffer.append(""+clue);
        }
        return buffer.toString();

    }
    public String get6Clue(String t){
        c=db.rawQuery("select Loca6 from teams where id = '"+t+"'", new String[]{});
        StringBuffer buffer =new StringBuffer();
        while(c.moveToNext()) {
            String clue = c.getString(0);
            buffer.append(""+clue);
        }
        return buffer.toString();

    }

    public String get7Clue(String t){
        c=db.rawQuery("select Loca7 from teams where id = '"+t+"'", new String[]{});
        StringBuffer buffer =new StringBuffer();
        while(c.moveToNext()) {
            String clue = c.getString(0);
            buffer.append(""+clue);
        }
        return buffer.toString();

    }
    public String get8Clue(String t){
        c=db.rawQuery("select Loca8 from teams where id = '"+t+"'", new String[]{});
        StringBuffer buffer =new StringBuffer();
        while(c.moveToNext()) {
            String clue = c.getString(0);
            buffer.append(""+clue);
        }
        return buffer.toString();

    }
}

