package com.mx.testfacedetect;

import android.graphics.Bitmap;

import com.mx.testfacedetect.bean.FaceppBean;

import java.util.List;

public interface MainContract {

    interface View {

        void showProgress();

        void hideProgress();

        void displayPhoto(Bitmap photo);

        void displayFaceInfo(List<FaceppBean.FacesBean> faces);

    }

    interface Presenter {
        void getDetectResultFromServer(Bitmap photo);
    }
}