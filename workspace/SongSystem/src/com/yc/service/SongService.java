package com.yc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yc.model.CategoryQueryModel;
import com.yc.model.SongQueryModel;

public interface SongService {
	List finAllSong();
	List finAllSongTop();
	List finAllSongByCondition(SongQueryModel songQueryModel);
	List finAllCategory();
	
	void addCategory(CategoryQueryModel categoryQueryModel);
}
