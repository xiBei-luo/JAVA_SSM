package com.yc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yc.dao.SongDao;
import com.yc.model.CategoryQueryModel;
import com.yc.model.SongQueryModel;

@Service("songServiceImpl")
public class SongServiceImpl implements SongService {
	@Autowired
	private SongDao songDao;
	@Override
	public List finAllSong() {
		// TODO Auto-generated method stub
		return songDao.finAllSong();
	}
	@Override
	public List finAllCategory() {
		// TODO Auto-generated method stub
		return songDao.finAllCategory();
	}
	@Override
	public List finAllSongTop() {
		// TODO Auto-generated method stub
		return songDao.finAllSongTop();
	}
	@Override
	public List finAllSongByCondition(SongQueryModel songQueryModel) {
		// TODO Auto-generated method stub
		return songDao.finAllSongByCondition(songQueryModel);
	}
	@Override
	public void addCategory(CategoryQueryModel categoryQueryModel) {
		// TODO Auto-generated method stub
		songDao.addCategory(categoryQueryModel);
	}

}
