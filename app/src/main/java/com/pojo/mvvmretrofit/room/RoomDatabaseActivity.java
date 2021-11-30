package com.pojo.mvvmretrofit.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

import com.pojo.mvvmretrofit.R;

import java.util.List;

public class RoomDatabaseActivity extends AppCompatActivity {

//https://www.youtube.com/watch?v=qO56SL856xc&list=PLdHg5T0SNpN3CMNtsd5KGaiBtzhTGIwtC

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_database);
    }

    public void insertSingleTodo(View view) {

        RoomTable roomTable=new RoomTable("Saravana","Murali");
        doInsertData(roomTable);

    }

    public void getAllTodos(View view) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                List<RoomTable> roomTableList=RoomDatabaseInstance.getInstance(getApplicationContext()).roomQueryDAO().getAll();

                for (int i = 0; i <roomTableList.size() ; i++) {

                    System.out.println("ReceivedData "+roomTableList.size()+" "+roomTableList.get(i).getFirstName()+" "+roomTableList.get(i).getFirstName());

                }


            }
        }).start();

    }

    public void deleteATodo(View view) {

        threadCheck();

    }

    private void threadCheck() {

        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i <10 ; i++) {


                    System.out.println("PrintingIValue "+i);

                    SystemClock.sleep(1000);

                }

            }
        }).start();

    }

    public void updateATodo(View view) {


    }

    public void insertMultipleTodos(View view) {
    }

    public void findCompletedTodos(View view) {

    }

    private void doInsertData(RoomTable roomTable) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                RoomDatabaseInstance.getInstance(getApplicationContext()).roomQueryDAO().insert(roomTable);
                System.out.println("ValueInserted");

            }
        }).start();

    }


}