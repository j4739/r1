package com.cyber.smedu.user.repository;
//인터페이스

import com.cyber.smedu.user.domain.PlannerDomain;
import com.cyber.smedu.user.domain.ProfessorDomain;
import com.cyber.smedu.user.domain.StudentDomain;
import com.cyber.smedu.user.domain.UserDomain;

public interface UserDao {
	public int insertUser(UserDomain user);
	public int insertStudent(StudentDomain student);
	public int insertProfessor(ProfessorDomain professor);
	public int insertPlanner(PlannerDomain planner);
}
