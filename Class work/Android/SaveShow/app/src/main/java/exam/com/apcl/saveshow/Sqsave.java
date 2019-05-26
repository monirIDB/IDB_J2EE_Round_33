package exam.com.apcl.saveshow;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Sqsave extends SQLiteOpenHelper {
    Sqsave(Context context){
        super(context,"sq_db1",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table info(id integer primary key autoincrement,name text,email text,round text,subject text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i1, int i2) {
    db.execSQL("drop table if exists info");
    onCreate(db);
    }
    public  boolean doInsert(String name,String email,String round,String subject){
        SQLiteDatabase sd= this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("name",name);
        cv.put("email",email);
        cv.put("round",round);
        cv.put("subject",subject);
        Long res= sd.insert("info",null,cv);
        if(res ==-1){
            return  false;
        }else{
            return true;
        }
    }
    public Cursor doShow(){
        SQLiteDatabase sqDb=this.getWritableDatabase();
        Cursor c=sqDb.rawQuery("select * from info",null);
        return c;
    }

}
