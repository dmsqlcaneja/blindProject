<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main>
	<section>
		<h1>회원가입 페이지</h1>
		<form method="post">
			<table>
				<tr>
					<td>
						<label>아이디</label>
						<input type="text" name="loginId" size="20" maxlength="12" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<label>비밀번호</label>
						<input type="password" name="pwd" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<label>이메일</label>
						<input type="email" name="email" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<label>이름</label>
						<input type="text" name="name" required="required"/>
					</td>
				</tr>
				<tr>
					<td>
						<label>회사명</label>
						<select>
							<c:forEach var="company" items="${companyList}">
								<option>${company.name}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<label>전화번호</label>
						<input type="text" name="phonNumber" placeholder="-없이 입력하세요"/>
					</td>
				</tr>
				<tr>
					<td>
						<label>사원번호</label>
						<input type="text" name="id"/>
					</td>
				</tr>
				<tr>	
					<td>
						<input type="submit" value="회원가입" />
					</td>
				</tr>
			</table>
		</form>
	</section>
</main>