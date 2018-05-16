package com.yc.framework;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
import com.yc.utils.DbHelper;
public class PageUtils {
	private QueryRunner qr=new QueryRunner(DbHelper.getDataSource());
	public  List<UserModel> findByPage(Page page){
		int start=(page.getNowPage()-1)*page.getPageSize();
		String sql="select *from t_crud limit "+start+","+page.getPageSize()+"";
		try {
			return qr.query(sql, new BeanListHandler<UserModel>(UserModel.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public  int getPageTotalSize(UserQueryModel uq){
		String sql="select * from t_crud where 1=1 ";
		if(uq != null) {
		if(uq.getName()!=null&&uq.getName().trim().length()>0){
			sql+=" and name like '%"+uq.getName()+"%'";
			}
			if(!(uq.getStatus()==-1)){
				sql+=" and status="+uq.getStatus();
			}
		}
		try {
			List<UserModel> list=qr.query(sql, new BeanListHandler<UserModel>(UserModel.class));
			return list.size();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
