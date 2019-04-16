package exam.com.apcl.prodropdownmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner country, city;
    String[] con={"Bangladesh", "India", "Pakistan"};
    String[] cy={"Dhaka", "Delli", "Islamabad"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
