package exam.com.apcl.promessageother;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num, mess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=(EditText)findViewById(R.id.editText);
        mess=(EditText)findViewById(R.id.editText2);
    }
    public void sendMess(View view){
        try {


            String number = num.getText().toString().trim();
            String message = mess.getText().toString().trim();
            SmsManager sms = SmsManager.getDefault();
            Toast.makeText(MainActivity.this, "Message Send", Toast.LENGTH_LONG).show();
            sms.sendTextMessage(number, null, message, null, null);
            Toast.makeText(MainActivity.this, "Message not send", Toast.LENGTH_LONG).show();
        }catch (Exception e){
            Toast.makeText(MainActivity.this, "Message not send", Toast.LENGTH_LONG).show();
        }
    }
}
