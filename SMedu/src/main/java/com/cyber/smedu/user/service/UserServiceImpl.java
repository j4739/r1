package com.cyber.smedu.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cyber.smedu.user.domain.PlannerDomain;
import com.cyber.smedu.user.domain.ProfessorDomain;
import com.cyber.smedu.user.domain.StudentDomain;
import com.cyber.smedu.user.domain.UserDomain;
import com.cyber.smedu.user.repository.UserDao;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired private UserDao userDao;
	
	//학생 입력
	@Override
	public int addStudent(UserDomain user, StudentDomain student) {
		if(user.getUserLevel().equals("학생")){
			userDao.insertUser(user);
			userDao.insertStudent(student);	
			return 1;
		} 
		return 0;
	}

	@Override
	public int addProfessor(UserDomain user, ProfessorDomain professor) {
		if(user.getUserLevel().equals("교수")){
			userDao.insertUser(user);
			userDao.insertProfessor(professor);	
			return 1;
		}
		return 0;
	}

	@Override
	public int addPlanner(UserDomain user, PlannerDomain planner) {
		if(user.getUserLevel().equals("플래너")){
			userDao.insertUser(user);
			userDao.insertPlanner(planner);	
			return 1;
		}
		return 0;
	}
}
