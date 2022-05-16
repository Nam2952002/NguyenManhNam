package com.example.nguyenmanhnam;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface UsedDao {

    @Insert
    void insertFeedback(FbEntity fbEntity);

    @Update
    void updateFeedback(FbEntity fbEntity);

    @Delete
    void deleteFeedback(FbEntity fbEntity);
}
