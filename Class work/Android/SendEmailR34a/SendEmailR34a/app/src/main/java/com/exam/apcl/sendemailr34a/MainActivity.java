package com.exam.apcl.sendemailr34a;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText to,sub,detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        to=(EditText) findViewById(R.id.to);
        sub=(EditText) findViewById(R.id.sub);
        detail=(EditText) findViewById(R.id.detail);
    }
    public void sendEmail(View v){
        try {
            Intent intent;
            intent= new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{to.getText().toString()});
            //intent.putExtra(Intent.EXTRA_CC, new String[]{ to.toString()});
            //intent.putExtra(Intent.EXTRA_BCC, new String[]{to.toString()});
            intent.putExtra(Intent.EXTRA_SUBJECT,sub.getText().toString());
            intent.putExtra(Intent.EXTRA_TEXT,detail.getText().toString());
            intent.setType("message/rfc822");
            //startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            Toast.makeText(this,"Sorry no mail clint found", Toast.LENGTH_LONG).show();
        }
    }
}
