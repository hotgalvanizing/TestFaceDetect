package com.mx.testfacedetect.dagger;

import com.mx.testfacedetect.MainActivity;

import dagger.Component;

@Component(modules = {MainPresenterModule.class})
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
