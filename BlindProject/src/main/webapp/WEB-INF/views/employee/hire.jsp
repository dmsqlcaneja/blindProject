<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main>
	<section>
		<h1>채용공고 등록 페이지</h1>
		<form method="POST">
		<ul>
			<li>
				<!-- Company 테이블에서 가져오기 -->
				<label>회사명</label>
				<select>
<!-- 					<option>선택</option> -->
<!-- 					<option>신세계</option> -->
<!-- 					<option>삼성</option> -->
<!-- 					<option>LG</option> -->
<!-- 					<option>네이버</option> -->
					<c:forEach var="company" items="${Company}">
						<option>${company.name}</option>
					</c:forEach>
				</select>
			</li>
			<li>
				<!-- Recruit_Notice에 입력 -->
				<label>제목</label>
				<input type="text" />
			</li>			
			<li>
				<label>접수 마감일</label>
				<input type="date" />
			</li>
<!-- 			<li> -->
<!-- 				<label>경력</label> -->
<!-- 				<select> -->
<!-- 					<option>선택</option> -->
<!-- 					<option>신입</option> -->
<!-- 					<option>경력(1~3년차)</option> -->
<!-- 					<option>경력(4~5년차)</option> -->
<!-- 				</select> -->
<!-- 			</li> -->
			<li>
				<!-- Recruit_Division 테이블에서 가져오기 -->
				<label>채용 구분</label>
				<select>
					<option>선택</option>
					<option>인턴</option>
					<option>계약직</option>
					<option>정규직</option>
				</select>
			</li>
			<li>
				<label>내용</label>
				<textarea rows="20" cols="100"></textarea>
			</li>
			<li>
				<label>연봉</label>
				<select>
					<option>회사 내규에 따름</option>
					<option>2,200 ~ 2,600 만원</option>
					<option>2,600 ~ 3,000 만원</option>
					<option>3,000 ~ 3,400 만원</option>
				</select>
			</li>
		</ul>
		<input type="submit" value="저장" />
		</form>
	</section>
</main>