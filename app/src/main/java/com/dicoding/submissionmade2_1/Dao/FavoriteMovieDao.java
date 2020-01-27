package com.dicoding.submissionmade2_1.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.dicoding.submissionmade2_1.Item.FavoriteMovie;

import java.util.List;

@Dao
public interface FavoriteMovieDao {

    @Insert
    void insert(FavoriteMovie favoriteMovie);

    @Update
    void update(FavoriteMovie favoriteMovie);

    @Delete
    void delete(FavoriteMovie favoriteMovie);

    @Query("SELECT * FROM favorite_table")
    List<FavoriteMovie> getAllFavoriteMovie();


}