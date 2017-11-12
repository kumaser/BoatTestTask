package ru.boat.presenter;

import ru.boat.contract.ToolbarContract;

public class ToolbarPresenter implements ToolbarContract.Presenter {

    private ToolbarContract.View view;

    @Override
    public void attachView(ToolbarContract.View view) {
        this.view = view;
        view.setPresenter(this);
        initToolbar();
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void initToolbar() {
        view.initToolbar();
    }
}
