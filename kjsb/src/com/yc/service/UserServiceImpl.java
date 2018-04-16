package com.yc.service;

import java.sql.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.yc.dao.UserDao;
import com.yc.model.ExpertModel;
import com.yc.model.ExpertQueryModel;
import com.yc.model.ProjectModel;
import com.yc.model.ProjectQueryModel;
import com.yc.model.ProjetCategoryModel;
import com.yc.model.ProjetCategoryQueryModel;
import com.yc.model.UnitModel;
import com.yc.model.UnitQueryModel;
import com.yc.model.UserGroupModel;
import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;


@Service("us")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	
	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	@Override
	public UserModel checkLogin(UserQueryModel uq) {
		// TODO Auto-generated method stub
		UserModel um=null;
		try{
			um=userDao.checkLogin(uq);
		}catch(Exception e){
			e.printStackTrace();
		}
		return um;
	}

	@Override
	public List<ExpertModel> expertFindAll() {
		// TODO Auto-generated method stub
		return userDao.expertFindAll();
	}

	@Override
	public List<UnitModel> unitFindAll() {
		// TODO Auto-generated method stub
		return userDao.unitFindAll();
	}

	@Override
	public List<ProjectModel> projectFindAll() {
		// TODO Auto-generated method stub
		return userDao.projectFindAll();
	}

	@Override
	public ExpertModel expertFindById(int uid) {
		// TODO Auto-generated method stub
		return userDao.expertFindById(uid);
	}
	@Override
	public UnitModel unitFindById(int unitid) {
		// TODO Auto-generated method stub
		UnitModel um=userDao.unitFindById(unitid);
		return um;
	}
	@Override
	public void expertDoUpdate(ExpertModel em) {
		// TODO Auto-generated method stub
		userDao.expertDoUpdate(em);
	}
	@Override
	public void unitDoUpdate(UnitQueryModel uqm) {
		// TODO Auto-generated method stub
		userDao.unitDoUpdate(uqm);
	}
	@Override
	public void userDel(int uid) {
		// TODO Auto-generated method stub
		/*int gid=userDao.findGroup(uid).getGid();
		System.out.println(gid);
		if(gid==1){
			System.out.println("管理员表"+uid);
			userDao.delForeignAdmin(uid);//管理员表
		}else if(gid==2){
			System.out.println("专家表"+uid);
			userDao.delForeignExpert(uid);//专家
		}else{
			System.out.println("单位用户表"+uid);
			userDao.delForeignUnit(uid);//单位用户
		}*/
		userDao.userDel(uid);
	}
	@Override
	public void addUser(UserModel um) {
		// TODO Auto-generated method stub
		if(um.getPassword()==null){
			um.setPassword("123456");
		}
		userDao.addUser(um);
	}
	@Override
	public List<ProjetCategoryModel> expertFindProject() {
		// TODO Auto-generated method stub
		return userDao.expertFindProject();
	}
	@Override
	public UserModel expertUpdatePass(int expertid) {
		// TODO Auto-generated method stub
		return userDao.expertUpdatePass(expertid);
	}
	@Override
	public void expertDel(int expertid) {
		// TODO Auto-generated method stub
		userDao.expertDel(expertid);
	}
	@Override
	public void unitDel(int unitid) {
		// TODO Auto-generated method stub
		userDao.unitDel(unitid);
	}
	@Override
	public List<ProjetCategoryQueryModel> projectCategoryFindAll() {
		// TODO Auto-generated method stub
		return userDao.projectCategoryFindAll();
	}
	@Override
	public ProjetCategoryQueryModel projectCategoryFindById(int categoryid) {
		// TODO Auto-generated method stub
		return userDao.projectCategoryFindById(categoryid);
	}
	@Override
	public void projectCategoryDoUpdate(ProjetCategoryQueryModel pcqm) {
		// TODO Auto-generated method stub
		userDao.projectCategoryDoUpdate(pcqm);
	}
	@Override
	public void projectCategoryDel(int categoryid) {
		// TODO Auto-generated method stub
		userDao.projectCategoryDel(categoryid);
	}
	@Override
	public void addProjectCategory(ProjetCategoryQueryModel pcqm) {
		// TODO Auto-generated method stub
		userDao.addProjectCategory(pcqm);
	}
	@Override
	public ProjectModel projectFindById(int categoryid) {
		// TODO Auto-generated method stub
		return userDao.projectFindById(categoryid);
	}
	@Override
	public void expertProjectDoupdate(ProjectQueryModel pm) {
		// TODO Auto-generated method stub
		
		userDao.expertProjectDoupdate(pm);
	}
	@Override
	public void unitPassDoUpdate(UserModel um) {
		// TODO Auto-generated method stub
		userDao.unitPassDoUpdate(um);
	}
	@Override
	public void addProject(ProjectQueryModel pqm) {
		// TODO Auto-generated method stub
		long time=20180411;
		pqm.setFill_date(new Date(time));
		userDao.addProject(pqm);
	}
	@Override
	public List<ProjectModel> projectFindByIdD(int categoryid) {
		// TODO Auto-generated method stub
		return userDao.projectFindByIdD(categoryid);
	}
	@Override
	public List<ProjectModel> searchProject(String projectname) {
		// TODO Auto-generated method stub
		return userDao.searchProject(projectname);
	}

}
