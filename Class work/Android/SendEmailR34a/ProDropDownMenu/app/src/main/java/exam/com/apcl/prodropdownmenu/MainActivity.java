package exam.com.apcl.prodropdownmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner country, city;
    String[] cou={"Bangladesh", "India", "Pakistan", "Nepal"};
    String[] cit={"Dhaka", "New Delli", "Islamabad", "Katmondu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, cou);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, cit);
        country.setAdapter(adapter);
        city.setAdapter(adapter1);
    }
}
