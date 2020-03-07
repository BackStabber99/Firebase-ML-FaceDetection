package com.mayank.facedetection;

import android.app.Application;

import com.google.firebase.FirebaseApp;

//inherits SuperClass Application

public class FaceDetection extends Application {

    public static final String RESULT_TEXT="RESULT_TEXT";
    public static final String RESULT_DIALOG="RESULT_DIALOG";

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseApp.initializeApp(this);


    }
}
