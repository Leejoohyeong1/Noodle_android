package lee.com.noodle.Presenter;

import android.content.Context;

import java.util.ArrayList;

import lee.com.noodle.Data.NoodleItem;

public interface MainContract {

    interface View {




    }

    interface Presenter {

        void attachView(View view);

        void detachView();

        void setNoodleItem(NoodleItem item);

        ArrayList<NoodleItem> loadItems();
    }
}
