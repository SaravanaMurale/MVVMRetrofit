package com.pojo.mvvmretrofit.mvprecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pojo.mvvmretrofit.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MVPAdapter extends RecyclerView.Adapter<MVPAdapter.MVPViewHolder> {

    Context context;
    List<RootVideoView> rootVideoViewList;
    MVPClickable mvpClickable;

    interface  MVPClickable{
        public void onMvpVideoClick();
    }


    public MVPAdapter(Context context, List<RootVideoView> rootVideoViewList, MVPClickable mvpClickable) {
        this.context = context;
        this.rootVideoViewList = rootVideoViewList;
        this.mvpClickable = mvpClickable;
    }


    public void setData(List<RootVideoView> rootVideoViewList){
        this.rootVideoViewList=rootVideoViewList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MVPViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.layout_mvp_adapter,parent,false);
        return new MVPViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MVPViewHolder holder, int position) {


        Picasso.get().load(rootVideoViewList.get(position).getCategories().get(position).getVideos().get(position).getThumb()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return rootVideoViewList.size();
    }

    class MVPViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public MVPViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=(ImageView)itemView.findViewById(R.id.mvpImage);
            textView=(TextView)itemView.findViewById(R.id.mvpTitle);


        }
    }
}
