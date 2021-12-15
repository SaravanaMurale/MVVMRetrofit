package com.pojo.mvvmretrofit.videoview.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.pojo.mvvmretrofit.R;
import com.pojo.mvvmretrofit.databinding.ActivityVideoViewBinding;

public class VideoViewActivity extends AppCompatActivity {

    ActivityVideoViewBinding activityVideoViewBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityVideoViewBinding= DataBindingUtil.setContentView(this, R.layout.activity_video_view);
    }
}
