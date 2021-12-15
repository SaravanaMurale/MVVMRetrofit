package com.pojo.mvvmretrofit.videoview.viewmodel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideoViewModel {

    @SerializedName("categories")
    List<CategoryViewModel> categoryViewModelList;

    public VideoViewModel(List<CategoryViewModel> categoryViewModelList) {
        this.categoryViewModelList = categoryViewModelList;
    }

    public List<CategoryViewModel> getCategoryViewModelList() {
        return categoryViewModelList;
    }

    public void setCategoryViewModelList(List<CategoryViewModel> categoryViewModelList) {
        this.categoryViewModelList = categoryViewModelList;
    }
}
