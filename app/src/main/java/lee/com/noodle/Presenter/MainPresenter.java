package lee.com.noodle.Presenter;

import android.content.Context;

import lee.com.noodle.Data.NoodleItem;

public class MainPresenter implements MainContract.Presenter{

    private  NoodleItem item;
    private  MainContract.View view;

    @Override
    public void attachView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void loadItems(Context context) {

    }

    @Override
    public void setNoodleItem(NoodleItem item) {
        this.item = item;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
