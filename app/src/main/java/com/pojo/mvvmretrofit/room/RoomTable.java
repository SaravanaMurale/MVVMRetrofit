package com.pojo.mvvmretrofit.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class RoomTable {

    @PrimaryKey(autoGenerate = true)
    public int uId;

    @ColumnInfo(name="first_name")
    public String firstName;

    @ColumnInfo(name="last_name")
    public String lastName;

    public RoomTable(){

    }

}
