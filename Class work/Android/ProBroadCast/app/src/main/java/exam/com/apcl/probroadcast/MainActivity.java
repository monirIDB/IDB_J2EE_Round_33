package exam.com.apcl.probroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doBroadCast(View view){
        Intent intent=new Intent();
        intent.setAction("com.exam.coustomIntend");
        sendBroadcast(intent);
    }
}