package com.pojo.mvvmretrofit.room;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface RoomQueryDAO {

    @Insert
    void insert(RoomTable roomTable);

    @Insert
    void  insertAll(RoomTable... roomTable);

    @Delete
    void delete(RoomTable roomTable);

    @Update
    void updateUser(RoomTable roomTable);

    @Query("SELECT * FROM roomtable WHERE uId LIKE :uid LIMIT 1")
    RoomTable findById(int uid);


    @Query("SELECT * FROM roomtable WHERE first_name LIKE :first AND last_name LIKE:last LIMIT 1")
    RoomTable findByName(String first,String last);

    @Query("SELECT * FROM roomtable")
    List<RoomTable> getAll();

    @Query("SELECT * FROM roomtable where uId IN(:userIds)")
    List<RoomTable> loadAllByIds(int[] userIds);




}
