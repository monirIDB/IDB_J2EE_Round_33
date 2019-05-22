package exam.com.apcl.savedatainsdcard;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    SharedPreferences sf;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        sf=getSharedPreferences("R33", MODE_PRIVATE);
        editor=sf.edit();
    }
    public void doSave(View view){
        editor.putString("a", editText.getText().toString());
        editor.putString("b", editText2.getText().toString());
        editor.commit();
        editText.setText(null);
        editText2.setText(null);
        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
    }
    public void doRetrive(View view){
        String s=sf.getString("a", "There is no Data");
        String s1=sf.getString("b", "Here no data");
        editText.setText(s);
        editText2.setText(s1);
        Toast.makeText(this, "data Retrive", Toast.LENGTH_SHORT).show();
    }
    public void doRemove(View v){
        editor.remove("a");
        editor.remove("b");
        editor.commit();
        editText.setText(null);
        editText2.setText(null);
        Toast.makeText(this, "Data Removed", Toast.LENGTH_SHORT).show();
    }
}
