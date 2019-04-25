package exam.com.apcl.proproduct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView pName;
    TextView uPrice;
    TextView quantity;
    TextView tPrice;
    TextView tVat;
    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pName=(TextView) findViewById(R.id.textView11);
        uPrice=(TextView) findViewById(R.id.textView12);
        quantity=(TextView) findViewById(R.id.textView13);
        tPrice=(TextView)findViewById(R.id.textView14);
        tVat=(TextView)findViewById(R.id.textView17);
        it=new Intent(this,MainActivity.class);
        Intent in=getIntent();
        String pNam=in.getStringExtra("proNam");
        String uPri=in.getStringExtra("pUnit");
        String quan=in.getStringExtra("quntit");
        String tPri=in.getStringExtra("tPri");
        Integer totalPrice=Integer.parseInt(tPri);
        Integer totalVat=totalPrice+totalPrice*15/100;
        pName.setText(pNam);
        uPrice.setText(uPri);
        quantity.setText(quan);
        tPrice.setText(tPri);
       tVat.setText(totalVat.toString());

    }
    public void goBack(View view){
     Intent in=new Intent(this,MainActivity.class);
     startActivity(in);
    }
}
