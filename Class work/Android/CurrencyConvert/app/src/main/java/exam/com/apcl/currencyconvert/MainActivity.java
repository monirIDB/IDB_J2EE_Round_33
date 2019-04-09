package exam.com.apcl.currencyconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner fromSpinner;
    Spinner toSpinner;
    EditText amountEditText;
    EditText resultEditText;
    Button convertButton;
    Button clearButton;

    String[] currency={"BDT","USD","EUR","GBP","AUD","CAD","INR","SGD","JPY"};
    double[] rates={83.00, 1, 1.24,0.69881, 0.61095, 0.931880, 44.72, 1.30, 110.55};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fromSpinner=(Spinner)findViewById(R.id.spinner2);
        toSpinner=(Spinner)findViewById(R.id.spinner);
        amountEditText=(EditText)findViewById(R.id.editText);
        resultEditText=(EditText)findViewById(R.id.editText2);
        convertButton=(Button)findViewById(R.id.button2);
        clearButton=(Button)findViewById(R.id.button3);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, currency);
        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);
    }
    public void doConvert(View v){
        double amount=Double.parseDouble(amountEditText.getText().toString());
        double from=rates[fromSpinner.getSelectedItemPosition()];
        double to=rates[toSpinner.getSelectedItemPosition()];
        double result=(amount/to)*from;
        resultEditText.setText(result+"");
    }
}
