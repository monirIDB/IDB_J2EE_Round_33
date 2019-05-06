package exam.com.apcl.prosum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    EditText num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1.findViewById(R.id.edit4);
        num2.findViewById(R.id.d5);
        num3.findViewById(R.id.d6);
    }

    public void doSum(View view){
        Integer a=Integer.parseInt()

    }
}
