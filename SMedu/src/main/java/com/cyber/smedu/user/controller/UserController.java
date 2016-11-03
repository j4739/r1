package com.cyber.smedu.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cyber.smedu.user.domain.PlannerDomain;
import com.cyber.smedu.user.domain.ProfessorDomain;
import com.cyber.smedu.user.domain.StudentDomain;
import com.cyber.smedu.user.domain.UserDomain;
import com.cyber.smedu.user.service.UserService;

@Controller
public class UserController {
	@Autowired private UserService userService;
	//로그인 폼으로 이동
	@RequestMapping(value = "/smedu/main/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		return "smedu/main/login_form";
	}
	
	//회원가입 폼으로 이동
	@RequestMapping(value = "/smedu/main/signUpUser", method = RequestMethod.GET)
	public String signUpUser() {
		return "smedu/main/sign_up_user";
	}
	
	//교수,플래너 폼으로 이동
	@RequestMapping(value = "/smedu/main/professorPlannerInsertForm", method = RequestMethod.GET)
	public String professorPlannerInsertForm() {
		return "smedu/main/professor_planner_insert";
	}

	//학생(회원) 폼으로 이동
	@RequestMapping(value = "/smedu/main/studentInsertForm", method = RequestMethod.GET)
	public String studentInsertForm() {
		return "smedu/main/student_insert";
	}
	
	//학생 (회원) 가입 처리
	@RequestMapping(value = "/smedu/main/studentInsert", method = RequestMethod.POST)
	public String studentInsert(UserDomain user, StudentDomain student) {
		userService.addStudent(user, student);
		return "redirect:/smedu/main/main";
	}
	
	//교수 가입 처리
	@RequestMapping(value = "/smedu/main/professorInsert", method = RequestMethod.POST)
	public String professorInsert(UserDomain user, ProfessorDomain professor) {
		userService.addProfessor(user, professor);
		return "redirect:/smedu/main/main";
	}
	
	//교수 가입 처리
	@RequestMapping(value = "/smedu/main/plannerInsert", method = RequestMethod.POST)
	public String plannerInsert(UserDomain user, PlannerDomain planner) {
		userService.addPlanner(user, planner);
		return "redirect:/smedu/main/main";
	}
}
