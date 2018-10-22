<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<main id="main">
	<section id="section">
		<h1>공고 수정 페이지</h1>
		<form method="POST">
		<ul>
			<li>
				<!-- Company 테이블에서 가져오기 -->
				<label>회사명${rnl.companyId}</label>
				<select name="companyId" class="companyId">
					<c:forEach var="company" items="${companyList}">
						<option value="${company.id}"<c:if test="${company.name == rnl.companyName}">selected</c:if>>${company.name}</option>
					</c:forEach>
				</select>
			</li>
			<li>
				<!-- Recruit_Notice에 입력 -->
				<label>제목</label>
				<input type="text" name="title" value="${rnl.title}"/>
			</li>
			<li>
				<label>모집 시작일</label>
				<input type="date" name="strDate" value="<fmt:formatDate value="${rnl.strDate}" type="date" pattern="yyyy-MM-dd" />" />
			</li>			
			<li>
				<label>모집 마감일</label>
				<input type="date" name="endDate" value="<fmt:formatDate value="${rnl.endDate}" type="date" pattern="yyyy-MM-dd" />" />
			</li>
			<li>
				<!-- Recruit_Division 테이블에서 가져오기 -->
				<label>채용 구분</label>
				<select name="recruitDivisionId">
					<option>선택</option>
					<c:forEach var="rdl" items="${recruitDivisionList}">
						<option value="${rdl.id}"<c:if test="${rdl.value == rnl.recruitDivisionValue}">selected</c:if>>${rdl.value}</option>
					</c:forEach>
				</select>
			</li>
			<li>
				<label>내용</label>
				<textarea rows="20" cols="100" name="contents">${rnl.contents}</textarea>
			</li>
		</ul>
		<input type="submit" value="저장" />
		</form>
	</section>
</main>