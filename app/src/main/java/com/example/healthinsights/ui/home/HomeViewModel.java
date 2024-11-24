package com.example.healthinsights.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Arrays;
import java.util.List;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<List<String>> mButtonTexts;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the home fragment!");

        mButtonTexts = new MutableLiveData<>();
        List<String> buttonTexts = Arrays.asList("Button 1", "Button 2", "Button 3");
        mButtonTexts.setValue(buttonTexts);
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<List<String>> getButtonTexts() {
        return mButtonTexts;
    }
}