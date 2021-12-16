package com.pojo.mvvmretrofit.mvprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pojo.mvvmretrofit.R;
import com.pojo.mvvmretrofit.network.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MVPRecyclerViewActivity extends AppCompatActivity implements MVPAdapter.MVPClickable {

    private RecyclerView recyclerView;
    MVPAdapter mvpAdapter;

    List<RootVideoView> rootVideoViewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_v_p_recycler_view);

        recyclerView=(RecyclerView)findViewById(R.id.mvpRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MVPRecyclerViewActivity.this));
        recyclerView.setHasFixedSize(true);

        rootVideoViewList=new ArrayList<>();

        mvpAdapter=new MVPAdapter(MVPRecyclerViewActivity.this,rootVideoViewList,this);

        recyclerView.setAdapter(mvpAdapter);

        getRecyclerViewDataFromServer();
    }

    private void getRecyclerViewDataFromServer() {

        RetrofitClient.getApiClient().getData().enqueue(new Callback<List<RootVideoView>>() {
            @Override
            public void onResponse(Call<List<RootVideoView>> call, Response<List<RootVideoView>> response) {

                rootVideoViewList=response.body();

                for (int i = 0; i <rootVideoViewList.size() ; i++) {

                    System.out.println("TitleOfTheVideo"+rootVideoViewList.get(i).getCategories().get(i).getVideos().get(i).getTitle());
                    //System.out.println("RootValue"+rootVideoViewList.get(i).getCategories());

                    mvpAdapter.setData(rootVideoViewList);

                    //System.out.println("TitleOfTheVideo"+rootVideoViewList.get(i).getCategories().get(i).getVideos().get(i).getTitle());

                }


            }

            @Override
            public void onFailure(Call<List<RootVideoView>> call, Throwable t) {

                System.out.println("Failure"+t.getMessage().toString());

            }
        });


    }


    @Override
    public void onMvpVideoClick() {

    }
}