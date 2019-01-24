package org.pursuit.unit_03_assessment.network;

import org.pursuit.unit_03_assessment.model.PlanetList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("JDVila/storybook/master/planets.json")
    Call<PlanetList> getPlanet();
}
