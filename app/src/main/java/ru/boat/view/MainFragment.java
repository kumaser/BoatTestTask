package ru.boat.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ru.boat.R;
import ru.boat.contract.MainContract;
import ru.boat.model.data.MainItem;
import ru.boat.view.adapter.MainAdapter;

public class MainFragment extends Fragment implements MainContract.View {

    private MainContract.Presenter presenter;
    private MainAdapter adapter;
    private RecyclerView recyclerView;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.main_recycler_view);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        presenter.showPage();
    }

    @Override
    public void showPage(List<MainItem> page) {
        adapter.showPage(page);
        recyclerView.scrollTo(0, 0);
    }
}
