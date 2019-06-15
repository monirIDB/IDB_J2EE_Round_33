package exam.com.apcl.vollystring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Queue;

public class MainActivity extends AppCompatActivity {
    EditText url;
    TextView result;
    Button action;
    RequestQueue task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url=(EditText)findViewById(R.id.editText);
        result=(TextView)findViewById(R.id.textView);
        action=(Button)findViewById(R.id.button);
        task= Volley.newRequestQueue(this);
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringRequest stringRequest=new StringRequest(Request.Method.GET, url.getText().toString(), new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainActivity.this, "This is working", Toast.LENGTH_LONG).show();
                        result.setText("Respons is:" + response.substring(0, 100));
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        result.setText("That don't work");
                    }
                });
                task.add(stringRequest);
            }
        });
    }
}
