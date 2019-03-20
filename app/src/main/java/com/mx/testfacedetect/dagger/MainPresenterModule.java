package com.mx.testfacedetect.dagger;

import com.mx.testfacedetect.MainContract;
import com.mx.testfacedetect.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainPresenterModule {

    MainContract.View mView;

    public MainPresenterModule(MainContract.View mView) {
        this.mView = mView;
    }

    @Provides
    MainPresenter providesPresenter() {
        return new MainPresenter(mView);
    }
}
