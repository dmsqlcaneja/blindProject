<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<main>
	<section id="form-section">
		<h1>개인정보 입력 페이지</h1>
		<form method="post" enctype="multipart/form-data">
		<!-- 이메일,이름,비밀번호,회사선택,채용공고선택,채용구분-->
			<table>
				<tr>
					<td>
						<c:if test="${!empty Company}">
						<label>회사 선택 :</label>
						<select name = "company">
							<c:forEach var="Company" items="${Company}" varStatus="i">
								<option value="${Company.name}">${Company.name}</option>
							</c:forEach>	
						</select>
						</c:if>
					</td>
				</tr>
				<tr>
					<td>
						<label>회사 선택 : </label>
						<select name="company">
							<option value="">회사선택</option>
							<option value="josun">신세계조선호텔</option>
							<option value="payment">신세계페이먼츠</option>
							<option value="everyday">에브리데이리테일</option>
							<option value="emart">이마트</option>
							<option value="tomboy">톰보이</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td>
						<label>채용공고 선택 : </label>
						<select name="recruit">
							<option value="">채용공고선택</option>
							<option value="josun">(주)이마트 신입사원 모집</option>
							<option value="payment">(주)이마트 [데이터/디자인]신입사원 모집(S-SCOUT)</option>
							<option value="everyday">(주)신세계 신입사원 모집</option>
							<option value="emart">(주)신세계인터네셔날 신입사원 모집</option>
							<option value="tomboy">(주)신세계푸드 신입사원 모집</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td>
						<label>채용구분 : </label>
						<select name="recruit">
							<option value="">선택</option>
							<option value="josun">정규직</option>
							<option value="payment">계약직</option>
							<option value="everyday">프리랜서</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td>
						<label>아이디 : </label>
						<input name="name" type="text"/>
					</td>
				</tr>
			
				<tr>
					<td>
						<label>이메일 : </label>
						<input name="email" type="text" />
						<!-- readonly="readonly" 는 읽기전용 -->
					</td>
				</tr>
				
				<tr>
					<td>
						<label>이름 : </label>
						<input name="name" type="text"/>
					</td>
				</tr>
				
				<tr>
					<td>
						<label>비밀번호 : </label>
						<input type="password" name="pwd" required="required" />
					</td>
				</tr>
				
				<tr>
					<td>
						<input type="submit" value="입사지원" />
					</td>
				</tr>
			</table>
		</form>
		 
	</section>
</main>

