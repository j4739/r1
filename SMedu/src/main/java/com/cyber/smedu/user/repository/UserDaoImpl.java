package com.cyber.smedu.user.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cyber.smedu.user.domain.PlannerDomain;
import com.cyber.smedu.user.domain.ProfessorDomain;
import com.cyber.smedu.user.domain.StudentDomain;
import com.cyber.smedu.user.domain.UserDomain;

@Repository
public class UserDaoImpl implements UserDao {
	private final String NS = "com.cyber.smedu.mapper.UserMapper";
    @Autowired private SqlSessionTemplate sqlSession;
    
	//회원 테이블 insert
	@Override
	public int insertUser(UserDomain user) {
		return sqlSession.insert(NS+".insertUser", user);
	}

	//학생 테이블 insert
	@Override
	public int insertStudent(StudentDomain student) {
		return sqlSession.insert(NS+".insertStudent", student);
	}
	
	//교수 테이블 insert
	@Override
	public int insertProfessor(ProfessorDomain professor) {
		return sqlSession.insert(NS+".insertProfessor", professor);
	}

	//플래너 테이블 insert
	@Override
	public int insertPlanner(PlannerDomain planner) {
		return sqlSession.insert(NS+".insertPlanner", planner);
	}
	

	
}
