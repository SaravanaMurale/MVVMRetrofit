package com.pojo.mvvmretrofit.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {RoomTable.class}, version = 1)
public abstract class RoomDatabaseInstance extends RoomDatabase {


    public abstract RoomQueryDAO roomQueryDAO();
    private static  volatile RoomDatabaseInstance INSTANCE;

    static RoomDatabaseInstance getInstance(Context context){

        if(INSTANCE==null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),RoomDatabaseInstance.class,"DB_NAME")
                    .build();
        }
        return INSTANCE;

    }

}
