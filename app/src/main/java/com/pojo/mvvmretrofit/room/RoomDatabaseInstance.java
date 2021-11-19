package com.pojo.mvvmretrofit.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {RoomTable.class}, version = 1)
public abstract class RoomDatabaseInstance extends RoomDatabase {


    public abstract RoomQueryDAO roomQueryDAO();

}
