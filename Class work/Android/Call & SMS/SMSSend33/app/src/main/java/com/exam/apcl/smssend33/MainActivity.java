package com.exam.apcl.smssend33;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textPhoneNo;
    EditText textSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textPhoneNo = (EditText) findViewById(R.id.editTextPhoneNo);
        textSMS = (EditText) findViewById(R.id.editTextSMS);
    }

    public void sendSMS(View view) {
        String phoneNo = textPhoneNo.getText().toString();
        String sms = textSMS.getText().toString();
        try {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("smsto:"));
            sendIntent.setType("vnd.android-dir/mms-sms");
            sendIntent.putExtra("address"  , phoneNo);
            sendIntent.putExtra("sms_body"  , sms);
            startActivity(sendIntent);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),
                    "SMS Not Send!",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
