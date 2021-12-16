
package com.pojo.mvvmretrofit.mvprecyclerview;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class RootVideoView {

    @SerializedName("categories")
    private List<Category> mCategories;

    public List<Category> getCategories() {
        return mCategories;
    }

    public void setCategories(List<Category> categories) {
        mCategories = categories;
    }

}
