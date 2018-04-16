package com.yc.dao;

import java.util.List;

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

public interface UserDao {
/*	void add(UserModel um);
	void del(int uid);
	void update(UserModel um);
	UserModel findById(int uid);
	List<UserModel> findByCondition(UserQueryModel uq);
	List<UserModel> findByName(String name);
	List<UserModel> checkLogin(UserQueryModel um);*/
	
	
	List<UserModel> findAll();
	UserModel checkLogin(UserQueryModel um);
	List<ExpertModel> expertFindAll();
	List<UnitModel> unitFindAll();
	List<ProjectModel> projectFindAll();
	List<ProjetCategoryQueryModel> projectCategoryFindAll();
	ProjetCategoryQueryModel projectCategoryFindById(int categoryid);
	ExpertModel expertFindById(int uid);
	UnitModel unitFindById(int unitid);
	void expertDoUpdate(ExpertModel em);
	void unitDoUpdate(UnitQueryModel uqm);
	void projectCategoryDoUpdate(ProjetCategoryQueryModel pcqm);
	void userDel(int uid);
	void expertDel(int expertid);
	void unitDel(int unitid);
	void projectCategoryDel(int categoryid);
	void addUser(UserModel um);
	void addProjectCategory(ProjetCategoryQueryModel pcqm);
	List<ProjetCategoryModel> expertFindProject();
	List<ProjectModel> projectFindByIdD(int categoryid);
	UserModel expertUpdatePass(int expertid);
	ProjectModel projectFindById(int categoryid);
	void expertProjectDoupdate(ProjectQueryModel pm);
	void unitPassDoUpdate(UserModel um);
	void addProject(ProjectQueryModel pqm);
	List<ProjectModel> searchProject(String projectname);
	
	/*UserGroupModel findGroup(int uid);
	void delForeignAdmin(int uid);
	void delForeignExpert(int uid);
	void delForeignUnit(int uid);*/
	
	
	
	
	
	
}
