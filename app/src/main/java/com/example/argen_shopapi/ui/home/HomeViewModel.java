package com.example.argen_shopapi.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.argen_shopapi.models.ModelM;
import com.example.argen_shopapi.repositories.Repository;

import java.util.List;

public class HomeViewModel extends ViewModel {
    private Repository Repository;
    private  LiveData<List<ModelM>> modelMResponseLiveData;
    public HomeViewModel() {
        Repository = new Repository();
        modelMResponseLiveData = Repository.getDashJeminyList();
    }

    public LiveData<List<ModelM>> getModeResponseLiveData() {
        return modelMResponseLiveData;
    }
}