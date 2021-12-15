package com.pojo.mvvmretrofit.videoview.viewmodel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class    ListVideosViewModel {

    @SerializedName("description")
    String description;

    @SerializedName("sources")
    List<String> sourcesViewModelList;

    @SerializedName("subtitle")
    String subtitle;

    @SerializedName("thumb")
    String thumb;

    @SerializedName("title")
    String title;

    public ListVideosViewModel(String description, List<String> sourcesViewModelList, String subtitle, String thumb, String title) {
        this.description = description;
        this.sourcesViewModelList = sourcesViewModelList;
        this.subtitle = subtitle;
        this.thumb = thumb;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<String> getSourcesViewModelList() {
        return sourcesViewModelList;
    }

    public void setSourcesViewModelList(List<String> sourcesViewModelList) {
        this.sourcesViewModelList = sourcesViewModelList;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
