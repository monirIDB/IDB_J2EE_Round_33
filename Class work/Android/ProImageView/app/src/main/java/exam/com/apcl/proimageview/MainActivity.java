package exam.com.apcl.proimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static exam.com.apcl.proimageview.R.drawable.aaa;
import static exam.com.apcl.proimageview.R.drawable.img3;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.imageView);
    }
    public void setImage(View view){
    img.setImageResource(img3);
        Toast.makeText(this, "Image set", Toast.LENGTH_LONG).show();
    }
}
