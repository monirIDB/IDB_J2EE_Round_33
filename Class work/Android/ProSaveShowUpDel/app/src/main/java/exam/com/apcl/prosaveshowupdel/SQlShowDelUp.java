package exam.com.apcl.prosaveshowupdel;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Date;

public class SQlShowDelUp extends SQLiteOpenHelper{
    SQlShowDelUp(Context context){
        super(context,"sq_db2", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table student(id integer primary key, name text, email text, password text, subject text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists student");
        onCreate(db);
    }
    public boolean doInsert(int id, String name, String email, String password, String subject){
        SQLiteDatabase sqDb=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("id", id);
        cv.put("name", name);
        cv.put("email", email);
        cv.put("password", password);
        cv.put("subject", subject);

        Long res=sqDb.insert("student", null,cv);
        if(res==-1){
            return false;
        }else {
            return true;
        }
    }
    public Cursor doShow(){
        SQLiteDatabase sqDb=this.getWritableDatabase();
        Cursor c=sqDb.rawQuery("select * from student",null);
        return c;
    }

    public  boolean doDelete(Integer id){
        SQLiteDatabase sqDb=this.getWritableDatabase();
        int i=sqDb.delete("student", "id=?", new String[]{id.toString()});
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
   public boolean doUp(Integer id, String name, String email, String password, String subject){
        SQLiteDatabase sqDb= this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("name", name);
        cv.put("email", email);
        cv.put("password", password);
        cv.put("subject", subject);

        int i=sqDb.update("student", cv, "id=?", new String[] {id.toString()});
        if(i>0){
            return true;
        }else {
            return false;
        }
   }
}
