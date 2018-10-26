<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<main>
	<section>
		<h1>채용공고 등록 페이지</h1>
		<form method="POST">
		<ul>
			<li>
				<!-- Company 테이블에서 가져오기 -->
				<label>회사명</label>
				<select name="companyId">
					<option>선택</option>
					<c:forEach var="company" items="${companyList}">
						<option value="${company.id}">${company.name}</option>
					</c:forEach>
				</select>
			</li>
			<li>
				<!-- Recruit_Notice에 입력 -->
				<label>제목</label>
				<input type="text" name="title"/>
			</li>
			<li>
				<label>모집 시작일</label>
				<c:set var="now" value="<%=new java.util.Date()%>" />
				<input type="date" name="strDate" value="<fmt:formatDate value="${now}" type="date" pattern="yyyy-MM-dd" />"/>
			</li>			
			<li>
				<label>모집 마감일</label>
				<input type="date" name="endDate" />
			</li>
			<li>
				<!-- Recruit_Division 테이블에서 가져오기 -->
				<label>채용 구분</label>
				<select name="recruitDivisionId">
					<option>선택</option>
					<c:forEach var="rdl" items="${recruitDivisionList}">
						<option value="${rdl.id}">${rdl.value}</option>
					</c:forEach>
				</select>
			</li>
			<li>
				<!-- Type 테이블에서 가져오기 -->
				<label>전형 구분</label>
				<select name="typeId">
					<option>선택</option>
					<c:forEach var="t" items="${typeList}">
						<option value="${t.id}">${t.value}</option>
					</c:forEach>
				</select>
			</li>
			<li>
				<label>내용</label>
				<textarea rows="20" cols="100" name="contents"></textarea>
			</li>
		</ul>
		<input type="submit" value="저장" />
		</form>
	</section>
</main>