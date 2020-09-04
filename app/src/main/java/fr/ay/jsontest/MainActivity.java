package fr.ay.jsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    String url = "https://api.themoviedb.org/3/movie/550?api_key=e4a9d54204f8ee1d8121e867e9a8a5a5";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        RequestQueue requestQueue = Volley.newRequestQueue(this);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null
                , new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                TextView textView = findViewById(R.id.title);

                try {
                    textView.setText("Title : " + response.getString("title" ) + "\nDate : " + response.getString("release_date") + "\nSynopsis : " + response.getString("overview"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        requestQueue.add(request); */

        List<MovieInfo> movieInfoList = new ArrayList<>();
        movieInfoList.add(new MovieInfo("Best Movie World", "Horror","C'est la fin du monde omg où sont les super zéros call 007", "29-02-2023"));
        movieInfoList.add(new MovieInfo("La La Land", "Musical","City of stars... are your shining just for me ? ", "12-06-2018"));
        movieInfoList.add(new MovieInfo("Cyber James Bond", "Action","Literally James Bond...but with a PROJECT skin ! ", "00-007-2007"));

        ListView movieInfo = findViewById(R.id.movie_info_view);
        movieInfo.setAdapter(new MovieInfoAdapter(this, movieInfoList));



    }
}