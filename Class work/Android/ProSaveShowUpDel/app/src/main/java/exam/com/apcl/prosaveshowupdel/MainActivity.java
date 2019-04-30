package exam.com.apcl.prosaveshowupdel;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText id, name, email, password, subject;
    SQlShowDelUp ssdu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ssdu=new SQlShowDelUp(this);
        id=(EditText)findViewById(R.id.editText);
        name=(EditText)findViewById(R.id.editText2);
        email=(EditText)findViewById(R.id.editText3);
        password=(EditText)findViewById(R.id.editText4);
        subject=(EditText)findViewById(R.id.editText5);

    }
    public void doSave(View view){
        boolean b=ssdu.doInsert(Integer.parseInt(id.getText().toString()), name.getText().toString(), email.getText().toString(), password.getText().toString(), subject.getText().toString());
        if(b){
            Toast.makeText(MainActivity.this, "Data Saved", Toast.LENGTH_LONG).show();
            show(view);
        }else {
            Toast.makeText(MainActivity.this, "Data Not Saved", Toast.LENGTH_LONG).show();
        }
    }

    public  void show(View view) {
        Cursor c = ssdu.doShow();
        if (c.getCount() == 0) {
            Toast.makeText(MainActivity.this, "No Data Found", Toast.LENGTH_LONG).show();
        } else {
            StringBuffer sb = new StringBuffer();
            while (c.moveToNext()) {
                sb.append(c.getInt(0) + " ");
                sb.append(c.getString(1) + " ");
                sb.append(c.getString(2) + " ");
                sb.append(c.getString(3) + " ");

                sb.append(c.getString(4) + "\n ");
            }
            AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
            adb.setCancelable(true);
            adb.setTitle("Student Info");
            adb.setMessage(sb.toString());
            adb.show();
        }
    }

    public void  doRemove(View view){
        boolean b=ssdu.doDelete(Integer.parseInt(id.getText().toString()));
        if(b){
            Toast.makeText(MainActivity.this, "Delete Successful", Toast.LENGTH_LONG).show();
            show(view);
        }else {
            Toast.makeText(MainActivity.this, "Not deleted", Toast.LENGTH_LONG).show();
        }
    }
    public  void doUpdate(View view){
        boolean b=ssdu.doUp(Integer.parseInt(id.getText().toString()), name.getText().toString(), email.getText().toString(), password.getText().toString(), subject.getText().toString());
        if(b){
            Toast.makeText(MainActivity.this, "Update Successful", Toast.LENGTH_LONG).show();
            show(view);
        }else {
            Toast.makeText(MainActivity.this, "Update Fail", Toast.LENGTH_LONG).show();
        }
    }
}
