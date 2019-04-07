package exam.com.apcl.addtwonum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.editText);
        num2=findViewById(R.id.editText2);
        result=findViewById(R.id.editText3);
    }
    public void doSum(View v){
        Integer a=Integer.parseInt(num1.getText().toString());
        Integer b=Integer.parseInt(num2.getText().toString());
        Integer c=a+b;
        result.setText(Integer.toString(c));
    }
}
