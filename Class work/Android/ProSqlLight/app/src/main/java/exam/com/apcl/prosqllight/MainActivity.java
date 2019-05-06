package exam.com.apcl.prosqllight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText id, name, email, round, subject;
    Button add;
    SqlTest sql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sql=new SqlTest(this);
        id=(EditText)findViewById(R.id.editText);
        name=(EditText)findViewById(R.id.editText2);
        email=(EditText)findViewById(R.id.editText3);
        round=(EditText)findViewById(R.id.editText4);
        subject=(EditText)findViewById(R.id.editText5);
        add=(Button)findViewById(R.id.button);
    }
    public void doAdd1(View view){
        boolean b=sql.insertData(name.getText().toString(), email.getText().toString(), round.getText().toString(), subject.getText().toString());
        if (b){
            Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(MainActivity.this, "Data Insert Fail", Toast.LENGTH_LONG).show();
        }
    }
}
