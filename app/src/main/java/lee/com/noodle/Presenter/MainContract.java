package lee.com.noodle.Presenter;

import android.content.Context;

import lee.com.noodle.Data.NoodleItem;

public interface MainContract {

    interface View {




    }

    interface Presenter {

        void attachView(View view);

        void detachView();

        void setNoodleItem(NoodleItem item);

        void loadItems(Context context);
    }
}
