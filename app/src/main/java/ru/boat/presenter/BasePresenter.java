package ru.boat.presenter;

public interface BasePresenter<T> {
    void attachView(T view);
    void detachView();
}
