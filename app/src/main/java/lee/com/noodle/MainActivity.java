package lee.com.noodle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

import lee.com.noodle.Data.NoodleItem;
import lee.com.noodle.Presenter.MainContract;
import lee.com.noodle.Presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    final String TAG = "MainActivity";
    private MainContract.Presenter mainPresnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresnter = new MainPresenter();
        mainPresnter.attachView(this);

        ArrayList<NoodleItem> itme = mainPresnter.loadItems();
        Log.d(TAG,itme.toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresnter.detachView();
    }
}
