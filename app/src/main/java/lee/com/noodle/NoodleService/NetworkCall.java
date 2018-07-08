package lee.com.noodle.NoodleService;

import android.os.AsyncTask;


import java.io.IOException;
import java.util.ArrayList;

import lee.com.noodle.Data.NoodleItem;
import retrofit2.Call;
import retrofit2.Response;

public class NetworkCall extends AsyncTask<Call,Void,Object>{
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
    }

    @Override
    protected Object doInBackground(Call... params) {
        try {
            Call<ArrayList<NoodleItem>> call = params[0];
            Response<ArrayList<NoodleItem>> response = call.execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
