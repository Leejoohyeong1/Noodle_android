package lee.com.noodle.Presenter;

import android.content.Context;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import lee.com.noodle.Data.NoodleItem;
import lee.com.noodle.NoodleService.NetworkCall;
import lee.com.noodle.NoodleService.NoodleService;
import retrofit2.Call;

public class MainPresenter implements MainContract.Presenter{

    private  NoodleItem item;
    private  MainContract.View view;

    @Override
    public void attachView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void setNoodleItem(NoodleItem item) {
        this.item = item;
    }

    @Override
    public ArrayList<NoodleItem> loadItems() {
        ArrayList<NoodleItem> items = null;
        NoodleService Service = NoodleService.retrofit.create(NoodleService.class);
        final Call<ArrayList<NoodleItem>> call = Service.get_Noodle_retrofit();
        try {
            items = (ArrayList<NoodleItem>) new NetworkCall().execute(call).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
