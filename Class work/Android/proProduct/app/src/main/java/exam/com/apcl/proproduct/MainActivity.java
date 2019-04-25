package exam.com.apcl.proproduct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText pName;
    EditText uPrice;
    EditText quantity;
    EditText tPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pName=(EditText)findViewById(R.id.editText);
        uPrice=(EditText)findViewById(R.id.editText2);
        quantity =(EditText) findViewById(R.id.editText3);
        tPrice =(EditText)findViewById(R.id.editText4);

    }
    public void doForward(View view){

        Integer upric=Integer.parseInt(uPrice.getText().toString());
        Integer quan=Integer.parseInt(quantity.getText().toString());
        Integer total=upric*quan;
        tPrice.setText(total.toString());
    }
    public void goNext(View view){
        String nam=pName.getText().toString();
        Integer upric=Integer.parseInt(uPrice.getText().toString());
        Integer quan=Integer.parseInt(quantity.getText().toString());
        Integer total=upric*quan;
        Intent in=new Intent(this,Main2Activity.class);
        in.putExtra("proNam", nam.toString());
        in.putExtra("pUnit", upric.toString());
        in.putExtra("quntit", quan.toString());
        in.putExtra("tPri",total.toString());
        startActivity(in);

    }
}
