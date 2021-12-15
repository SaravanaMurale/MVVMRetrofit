package com.pojo.mvvmretrofit.videoview.viewmodel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryViewModel {

    @SerializedName("name")
    String name;
    @SerializedName("videos")
    List<ListVideosViewModel> listVideosViewModelList;

    public CategoryViewModel(String name, List<ListVideosViewModel> listVideosViewModelList) {
        this.name = name;
        this.listVideosViewModelList = listVideosViewModelList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ListVideosViewModel> getListVideosViewModelList() {
        return listVideosViewModelList;
    }

    public void setListVideosViewModelList(List<ListVideosViewModel> listVideosViewModelList) {
        this.listVideosViewModelList = listVideosViewModelList;
    }
}
