package com.ysdc.ui.splash;

import android.os.Bundle;

import com.ysdc.R;
import com.ysdc.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity implements SplashMvpView{

    @Inject
    SplashMvpPresenter<SplashMvpView> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        presenter.onAttach(SplashActivity.this);
    }

    @Override
    protected void onDestroy() {
        presenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
