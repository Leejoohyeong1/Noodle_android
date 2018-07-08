package lee.com.noodle.NoodleService;

import java.util.ArrayList;

import lee.com.noodle.Data.NoodleItem;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface NoodleService {
    @Headers({"Accept: application/json"})
    @GET("/")
    Call<ArrayList<NoodleItem>> get_Noodle_retrofit();

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(API.BaseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
