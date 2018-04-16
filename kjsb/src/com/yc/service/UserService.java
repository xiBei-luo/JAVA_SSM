package com.yc.service;

import java.util.List;

import com.yc.model.ExpertModel;
import com.yc.model.ExpertQueryModel;
import com.yc.model.ProjectModel;
import com.yc.model.ProjectQueryModel;
import com.yc.model.ProjetCategoryModel;
import com.yc.model.ProjetCategoryQueryModel;
import com.yc.model.UnitModel;
import com.yc.model.UnitQueryModel;
import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;

public interface UserService {
	/*void del(int uid);
	void add(UserModel um);
	void update(UserModel um);
	UserModel findById(int operator_id);
	List<UserModel> findByCondition(UserQueryModel uq);
	boolean findByName(String name);
	boolean checkLogin(UserQueryModel uq);*/
	
	
	UserModel checkLogin(UserQueryModel uq);
	List<UserModel> findAll();
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
	UserModel expertUpdatePass(int expertid);
	ProjectModel projectFindById(int categoryid);
	List<ProjectModel> projectFindByIdD(int categoryid);
	void expertProjectDoupdate(ProjectQueryModel pm);
	void unitPassDoUpdate(UserModel um);
	void addProject(ProjectQueryModel pqm);
	List<ProjectModel> searchProject(String projectname);
	
	
	
}
