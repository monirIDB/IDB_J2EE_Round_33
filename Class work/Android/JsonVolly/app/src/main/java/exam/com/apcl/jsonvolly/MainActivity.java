package exam.com.apcl.jsonvolly;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

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
                JsonRequest jr=new JsonRequest(Request.Method.GET, url.toString(), url.toString(), new Response.Listener() {
                    @Override
                    public void onResponse(Object response) {
                        Toast.makeText(MainActivity.this, "This is ok", Toast.LENGTH_LONG).show();
                        result.setText("Respons is ");
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        result.setText("This is don't working");
                    }
                }) {
                    @Override
                    protected Response parseNetworkResponse(NetworkResponse response) {
                        return null;
                    }

                    @Override
                    public int compareTo(@NonNull Object o) {
                        return 0;
                    }
                };

            }
        });
        
    }
}
