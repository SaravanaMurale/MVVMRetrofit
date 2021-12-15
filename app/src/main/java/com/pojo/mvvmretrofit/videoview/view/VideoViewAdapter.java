package com.pojo.mvvmretrofit.videoview.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pojo.mvvmretrofit.databinding.LayoutVideoAdapterBinding;
import com.pojo.mvvmretrofit.videoview.viewmodel.VideoViewModel;

import java.util.List;

public class VideoViewAdapter extends RecyclerView.Adapter<VideoViewAdapter.VideoViewHolder> {

    Context mCtx;
    List<String> videoViewModelList;
    VideoClickable videoClickable;


    public interface VideoClickable {

        public void onVideoClickable();

    }

    public VideoViewAdapter(Context mCtx, List<String> videoViewModelList, VideoClickable videoClickable) {
        this.mCtx = mCtx;
        this.videoViewModelList = videoViewModelList;
        this.videoClickable = videoClickable;
    }

    public void setData(List<String> videoViewModelList){
        this.videoViewModelList=videoViewModelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        LayoutVideoAdapterBinding layoutVideoAdapterBinding=LayoutVideoAdapterBinding.inflate(layoutInflater,parent,false);
        return new VideoViewHolder(layoutVideoAdapterBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {

        //List<String> str=videoViewModelList.get(position).getCategoryViewModelList().get(position).getListVideosViewModelList();
        //holder.layoutVideoAdapterBinding.setVideomodel(videoViewModel);
        holder.layoutVideoAdapterBinding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return videoViewModelList==null?0:videoViewModelList.size();
    }

    class VideoViewHolder extends RecyclerView.ViewHolder{

        LayoutVideoAdapterBinding layoutVideoAdapterBinding;

        public VideoViewHolder(@NonNull LayoutVideoAdapterBinding itemView) {
            super(itemView.getRoot());

            this.layoutVideoAdapterBinding=itemView;

            layoutVideoAdapterBinding.videoImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    videoClickable.onVideoClickable();
                }
            });
        }
    }

}
