
package com.pojo.mvvmretrofit.mvprecyclerview;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Video {

    @SerializedName("description")
    private String mDescription;
    @SerializedName("sources")
    private List<String> mSources;
    @SerializedName("subtitle")
    private String mSubtitle;
    @SerializedName("thumb")
    private String mThumb;
    @SerializedName("title")
    private String mTitle;

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public List<String> getSources() {
        return mSources;
    }

    public void setSources(List<String> sources) {
        mSources = sources;
    }

    public String getSubtitle() {
        return mSubtitle;
    }

    public void setSubtitle(String subtitle) {
        mSubtitle = subtitle;
    }

    public String getThumb() {
        return mThumb;
    }

    public void setThumb(String thumb) {
        mThumb = thumb;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
