package ru.boat.contract;

import ru.boat.presenter.BasePresenter;
import ru.boat.view.BaseView;

public class ToolbarContract {
    public interface View extends BaseView<ToolbarContract.Presenter> {
        void initToolbar();
    }

    public interface Presenter extends BasePresenter<ToolbarContract.View> {
        void initToolbar();
    }
}
