package com.yc.dao;

import java.util.List;

import com.yc.model.CategoryQueryModel;
import com.yc.model.SongQueryModel;

public interface SongDao {
	List finAllSong();
	List finAllSongTop();
	List finAllSongByCondition(SongQueryModel songQueryModel);
	List finAllCategory();
	
	void addCategory(CategoryQueryModel categoryQueryModel);
}
