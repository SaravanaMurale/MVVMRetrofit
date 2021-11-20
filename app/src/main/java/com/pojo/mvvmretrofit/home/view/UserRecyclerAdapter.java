package com.pojo.mvvmretrofit.home.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pojo.mvvmretrofit.databinding.LayoutAdapterBinding;
import com.pojo.mvvmretrofit.home.model.GetUserDetailsModel;

import java.util.List;

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserRecyclerAdapter.UserViewHolder> {

    Context mCtx;
    List<GetUserDetailsModel> getUserDetailsModelList;

    public UserRecyclerAdapter(Context mCtx, List<GetUserDetailsModel> getUserDetailsModelList) {
        this.mCtx = mCtx;
        this.getUserDetailsModelList = getUserDetailsModelList;
    }



    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        LayoutAdapterBinding layoutAdapterBinding=LayoutAdapterBinding.inflate(layoutInflater,parent,false);
        return new UserViewHolder(layoutAdapterBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return getUserDetailsModelList.size();
    }

    class  UserViewHolder extends  RecyclerView.ViewHolder{

        LayoutAdapterBinding layoutAdapterBinding;

        public UserViewHolder(@NonNull LayoutAdapterBinding layoutAdapterBinding) {
            super(layoutAdapterBinding.getRoot());

            this.layoutAdapterBinding=layoutAdapterBinding;

        }
    }

}
