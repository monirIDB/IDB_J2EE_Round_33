package exam.com.apcl.saveshow;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText n,e,r,s;
    Sqsave sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sv= new Sqsave(this);
        n=(EditText) findViewById( R.id.name);
        e=(EditText) findViewById( R.id.email);
        r=(EditText) findViewById( R.id.round);
        s=(EditText) findViewById( R.id.subject);

    }
    public  void doAdd(View view){
        boolean b=sv.doInsert( n.getText().toString(), e.getText().toString(), r.getText().toString(), s.getText().toString());
        if (b){
            Toast.makeText(MainActivity.this,"Data Saved",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(MainActivity.this,"Data Did not Saved",Toast.LENGTH_LONG).show();
        }
    }
    public  void show(View view){
        Cursor c=sv.doShow();
        if(c.getCount()==0){
            Toast.makeText(MainActivity.this,"No Data Found",Toast.LENGTH_LONG).show();
        }else {
            StringBuffer sb= new StringBuffer();
            while (c.moveToNext()){
                sb.append(c.getInt(0) + " ");
                sb.append(c.getString(1)+ " ");
                sb.append(c.getString(2)+ " ");
                sb.append(c.getString(3)+ " ");
                sb.append(c.getString(4)+ "\n ");
            }
            AlertDialog.Builder adb=new AlertDialog.Builder(MainActivity.this);
            adb.setCancelable(true);
            adb.setTitle("Student Info");
            adb.setMessage(sb.toString());
            adb.show();
        }
    }
    public void doUpdate(View view){

    }
}
