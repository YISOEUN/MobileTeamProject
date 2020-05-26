package com.example.term.ui.umb;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UmbrellaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UmbrellaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is umbrella fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}