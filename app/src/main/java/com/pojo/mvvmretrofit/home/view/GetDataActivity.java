package com.pojo.mvvmretrofit.home.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.pojo.mvvmretrofit.R;
import com.pojo.mvvmretrofit.databinding.ActivityGetDataBinding;

public class GetDataActivity extends AppCompatActivity {

    ActivityGetDataBinding activityGetDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //https://www.youtube.com/watch?v=tDYZBSSgp1c

        activityGetDataBinding= DataBindingUtil.setContentView(this, R.layout.activity_get_data);

        //Another way of setting layout
        /*activityGetDataBinding=ActivityGetDataBinding.inflate(getLayoutInflater());
        setContentView(activityGetDataBinding.getRoot());
*/





    }
}