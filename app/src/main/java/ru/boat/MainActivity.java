package ru.boat;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import ru.boat.contract.MainContract;
import ru.boat.contract.ToolbarContract;
import ru.boat.presenter.MainPresenter;
import ru.boat.presenter.ToolbarPresenter;
import ru.boat.view.MainFragment;

public class MainActivity extends AppCompatActivity implements ToolbarContract.View {

    private ToolbarContract.Presenter toolbarPresenter;
    private MainContract.Presenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment fragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = MainFragment.newInstance();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.commit();
        }
        mainPresenter = (MainPresenter) getLastCustomNonConfigurationInstance();
        if (mainPresenter == null) {
            mainPresenter = new MainPresenter();
        }
        mainPresenter.attachView(fragment);
        toolbarPresenter = new ToolbarPresenter();
        toolbarPresenter.attachView(this);
    }

    @Override
    public MainContract.Presenter onRetainCustomNonConfigurationInstance() {
        return mainPresenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detachView();
        toolbarPresenter.detachView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_cart) {
            Toast.makeText(this, "Open cart", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setPresenter(ToolbarContract.Presenter presenter) {
    }

    @Override
    public void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_menu);
    }
}
