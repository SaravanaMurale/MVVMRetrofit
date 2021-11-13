package com.pojo.mvvmretrofit.home.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.pojo.mvvmretrofit.R;
import com.pojo.mvvmretrofit.databinding.ActivityGetDataBinding;
import com.pojo.mvvmretrofit.home.model.GetUserDetailsModel;
import com.pojo.mvvmretrofit.home.viewmodel.GetDataViewModel;
import com.pojo.mvvmretrofit.home.viewmodel.LoginViewModel;

import java.util.List;

public class GetDataActivity extends AppCompatActivity {

    ActivityGetDataBinding activityGetDataBinding;
    GetDataViewModel getDataViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Another way of setting layout
        /*activityGetDataBinding=ActivityGetDataBinding.inflate(getLayoutInflater());
        setContentView(activityGetDataBinding.getRoot());
*/
        activityGetDataBinding= DataBindingUtil.setContentView(this, R.layout.activity_get_data);
        getDataViewModel= ViewModelProviders.of(this).get(GetDataViewModel.class);

        activityGetDataBinding.setLifecycleOwner(this);





        getDataViewModel.getDataFromServer().observe(this, new Observer<List<GetUserDetailsModel>>() {
            @Override
            public void onChanged(List<GetUserDetailsModel> getUserDetailsModels) {

                for (int i = 0; i <getUserDetailsModels.size() ; i++) {

                    System.out.println("ReceivedData"+getUserDetailsModels.get(i).getTitle());

                }

            }
        });





    }
}