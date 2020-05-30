package com.example.term.ui.rain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RainViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RainViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is rain fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}