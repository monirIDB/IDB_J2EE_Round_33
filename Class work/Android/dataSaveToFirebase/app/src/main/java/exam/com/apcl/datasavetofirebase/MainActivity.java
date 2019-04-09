package exam.com.apcl.datasavetofirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText id;
    EditText name;
    Spinner spinner;
    Button button;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseReference = FirebaseDatabase.getInstance().getReference("students");
        id=(EditText)findViewById(R.id.editText);
        name=(EditText)findViewById(R.id.editText2);
        spinner=(Spinner)findViewById(R.id.spinner);
        button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData();
            }
        });
    }
    private void addData(){
        String id1=id.getText().toString().trim();
        String name1=name.getText().toString().trim();
        String round=spinner.getSelectedItem().toString().trim();
        if(!TextUtils.isEmpty(id1) || !TextUtils.isEmpty(name1)){
            Student s=new Student(id1, name1, round);
            databaseReference.child(id1).setValue(s);
            Toast.makeText(MainActivity.this, "Data Saved", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(MainActivity.this, "Enter both ID and Name", Toast.LENGTH_LONG).show();
        }
    }
}
