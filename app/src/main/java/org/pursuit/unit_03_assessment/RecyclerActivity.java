package org.pursuit.unit_03_assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.pursuit.unit_03_assessment.R;
import org.pursuit.unit_03_assessment.controller.AdapterClass;
import org.pursuit.unit_03_assessment.model.Planet;
import org.pursuit.unit_03_assessment.model.PlanetList;
import org.pursuit.unit_03_assessment.network.APIService;
import org.pursuit.unit_03_assessment.network.RetrofitSingleton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RecyclerActivity extends AppCompatActivity {
    private static final String TAG = "allplanets";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        final RecyclerView recyclerView = findViewById(R.id.RecyclerViewLayout);

        PlanetList planetList = new PlanetList();
        Log.d(TAG,"onResponse: " + planetList.getPlanetsList());

        Retrofit retrofit = RetrofitSingleton.getRetrofitInstance();
        APIService apiService = retrofit.create(APIService.class);
        Call<PlanetList> planetListCall = apiService.getPlanet();
        Log.d(TAG,"onResponse: " );

        planetListCall.enqueue(new Callback<PlanetList>() {
            @Override
            public void onResponse(Call<PlanetList> call, Response<PlanetList> response) {
//
//                Log.d(TAG,"onResponse: " + response.body().getPlanetsList());
//                recyclerView.setAdapter(new AdapterClass(response
//                        .body()
//                        .getPlanetsList()));
//                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

            }

            @Override
            public void onFailure(Call<PlanetList> call, Throwable t) {
                Log.d(TAG,"onFailure: " + t.toString());

            }
        });


        /*
        * TODO: Add logic that will:
        * TODO 7. Pass list to RecyclerView
        * TODO 8. Display planet name in a RecyclerView tile
        * TODO 9. Implement an OnClickListener for the itemview
        * TODO 10. Pass the Planet Name, Number, and Image URL data to DisplayActivity when tile is clicked
        */

    }
}
