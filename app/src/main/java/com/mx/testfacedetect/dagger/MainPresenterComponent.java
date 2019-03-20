package com.mx.testfacedetect.dagger;

import com.mx.testfacedetect.MainPresenter;

import dagger.Component;

@Component(modules = {FaceppServiceModule.class})
public interface MainPresenterComponent {
    void inject(MainPresenter mainPresenter);
}
