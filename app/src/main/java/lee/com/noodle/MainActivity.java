package lee.com.noodle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import lee.com.noodle.Presenter.MainContract;
import lee.com.noodle.Presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mainPresnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresnter = new MainPresenter();
        mainPresnter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresnter.detachView();
    }
}
