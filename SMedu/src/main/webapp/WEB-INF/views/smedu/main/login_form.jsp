<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../module/top.jsp" />
<div class="wrapper row3">
		<div class="hoc container clear">
			<div class="sidebar one_quarter first">
				<h3>회원 서비스</h3><hr>
				<nav class="sdb_holder">
					<ul>
						<li><a href="/smedu/main/loginForm"><strong>로그인</strong></a></li>
        				<li><a href="/smedu/main/signUpUser">회원가입</a></li>
						<li><a href="#">개인정보취급방침</a></li>
						<li><a href="#">이용약관</a></li>
						<li><a href="#">이력서등록</a></li>
					</ul>
				</nav>
			 </div>
    	<div class="content three_quarter"> 
		  <h1>로그인</h1><hr>
		  <form action="/smeduLogin">
		    <div class="form-group">
		      <label>아이디:</label>
		      	<input type="text" class="form-control" id="email" name="userId">
		    </div>
		    <div class="form-group">
		      <label>비밀번호:</label>
		      	<input type="password" class="form-control" id="pwd" name="userPw">
		    </div>
		    <div class="checkbox">
		      <label><input type="checkbox">아이디 저장</label>
		    </div>
		    <button type="submit" class="btn btn-default">로그인</button>
		  </form>
		</div>
	</div>
</div>
<jsp:include page="../module/foot.jsp" />
</body>
</html>