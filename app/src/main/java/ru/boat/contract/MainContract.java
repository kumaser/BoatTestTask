package ru.boat.contract;

import java.util.List;

import ru.boat.model.BaseModel;
import ru.boat.model.data.MainItem;
import ru.boat.presenter.BasePresenter;
import ru.boat.view.BaseView;

public interface MainContract {

    interface View extends BaseView<Presenter> {
        void showPage(List<MainItem> page);
    }

    interface Presenter extends BasePresenter<View> {
        void showPage();
    }

    interface Model extends BaseModel {

    }
}
