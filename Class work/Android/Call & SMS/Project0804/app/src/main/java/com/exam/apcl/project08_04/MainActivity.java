package com.exam.apcl.project08_04;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity {
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText);
    }

    public void call(View view) {
        String phone = e1.getText().toString().trim();
        Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phone));
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) != getPackageManager().PERMISSION_GRANTED) {
            return;
        }
        startActivity(callIntent);
    }
}
