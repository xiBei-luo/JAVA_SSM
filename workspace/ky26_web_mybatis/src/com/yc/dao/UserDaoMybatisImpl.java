package com.yc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
import com.yc.utils.MybatisUtils;

public class UserDaoMybatisImpl implements UserDao {
	SqlSessionFactory ssf=MybatisUtils.getSqlSessionF();
	String str="com.yc.dao.UserDao";
	@Override
	public void del(int operator_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(UserModel um) {
		// TODO Auto-generated method stub
		String stam=str+".add";
		SqlSession ss=ssf.openSession();
		try{
			ss.insert(stam, um);
			ss.commit();
		}catch(Exception e){
			e.printStackTrace();
			ss.rollback();
		}finally{
			ss.close();
		}
	}

	@Override
	public void update(UserModel um) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		List<UserModel> us=null;
		String stam=str+".findAll";
		SqlSession ss=ssf.openSession();
		try{
			us=ss.selectList(stam);
			ss.commit();
		}finally{
			ss.close();
		}
		return us;
	}

	@Override
	public List<UserModel> findByCondition(UserQueryModel uq) {
		List<UserModel> us=null;
		String stam=str+".findByCondition";
		SqlSession ss=ssf.openSession();
		try{
			us=ss.selectList(stam);
			ss.commit();
		}finally{
			ss.close();
		}
		System.out.println(us);
		return us;
	}

}
