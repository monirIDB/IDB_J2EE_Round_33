package exam.com.apcl.prosqllight;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.PublicKey;

/**
 * Created by l2pc208e on 4/4/2018.
 */

public class SqlTest extends SQLiteOpenHelper {
    public SqlTest (Context context){
        super(context, "st_db", null, 1);
    }
    @Override
    public void  onCreate(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL("create table student(id integer primary key autoincrement, name text, email text, round text, subject text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists student");
        onCreate(sqLiteDatabase);
    }

    public boolean insertData(String name, String email, String round, String subject){
        SQLiteDatabase sqDb=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("name", name);
        cv.put("email", email);
        cv.put("round", round);
        cv.put("subject", subject);
        Long res = sqDb.insert("student", null, cv);
        if(res==-1){
            return false;
        }else {
            return true;
        }
    }
}
