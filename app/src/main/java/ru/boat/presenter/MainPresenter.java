package ru.boat.presenter;

import ru.boat.contract.MainContract;
import ru.boat.model.MainModel;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    private MainContract.Model model;

    public MainPresenter() {
        model = new MainModel();
    }

    @Override
    public void attachView(MainContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void showPage() {
        view.showPage(model.getModel());
    }
}
