package exam.com.apcl.prosum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText a;
    EditText b;
    EditText c;
    EditText m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.editText4);
        b=findViewById(R.id.editText5);
        c=findViewById(R.id.editText6);
        m=findViewById(R.id.editText7);
    }
    public void doSum(View view){
        Integer d=Integer.parseInt(a.getText().toString());
        Integer e=Integer.parseInt(b.getText().toString());
        Integer f=d+e;
        c.setText(f.toString());
        Integer g=Integer.parseInt(c.getText().toString());
        if(g/2==0){
            c.setText("Sum is "+f +" And this is a even number");
        }else {
            c.setText("Sum is "+f+ " and The number is odd");
        }

        Integer fact=1;
        for(int i=1; i<=d; i++){
             fact=fact*i;
        }
        b.setText("The Factorial of " + d + " is " + fact);

    }
    public void doPrime(View view){
        Integer d=Integer.parseInt(a.getText().toString());
        int c=0;
        for(int i=1; i<=d; i++){
            if(d%i==0){
                c++;
            }
        }
        if(c==2){
            m.setText("The Num 1 is prime");
        }else {m.setText("The Num 1 is not prime");}

    }
}
