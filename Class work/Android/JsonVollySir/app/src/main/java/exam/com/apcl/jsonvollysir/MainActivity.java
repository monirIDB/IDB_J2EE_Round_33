package exam.com.apcl.jsonvollysir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.ref.ReferenceQueue;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    String URL="https://raw.githubusercontent.com/ianbar20/JSON-volley-Tutorial/master/Example-JSON-Files/Example-Array.JSON";
    String data="";
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        requestQueue= Volley.newRequestQueue(this);
        JsonArrayRequest arrayRequest=new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    JSONObject colorObj = response.getJSONObject(0);
                    JSONArray colorArray = colorObj.getJSONArray("colorArray");
                    for (int i = 0; i < colorArray.length(); i++) {
                        JSONObject jsonObject = colorArray.getJSONObject(i);
                        String color = jsonObject.getString("colorName");
                        String hex = jsonObject.getString("hexValue");
                        data += "Color Number " + (i + 1) + "\n Color Name" + color + "\n Hex Value :" + hex + "\n\n\n";
                    }
                    textView.setText(data);
                } catch (Exception e) {

                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "Fail", Toast.LENGTH_LONG).show();
            }
        }

        );
        requestQueue.add(arrayRequest);
    }
}
