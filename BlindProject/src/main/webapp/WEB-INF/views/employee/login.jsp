<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main>
	<section>
		<h1>로그인 페이지</h1>
		<form method="get" action="index">
			<table>
				<tr>
					<td>
						<label>아이디</label>
						<input type="text" name="login_id" />
					</td>
				</tr>
				<tr>
					<td>
						<label>비밀번호</label>
						<input type="password" name="pwd" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="로그인">
						<input type="button" value="회원가입" onClick="location.href='join'">
					</td>
				</tr>  
<!-- 				<tr> -->
<!-- 					<td> -->
<!-- 						<a href="find-id">아이디 찾기</a> -->
<!-- 						<a href="reset-pwd">비밀번호 재설정</a> -->
<!-- 					</td> -->
<!-- 				</tr>   -->
			</table>
		</form>
	</section>
</main>