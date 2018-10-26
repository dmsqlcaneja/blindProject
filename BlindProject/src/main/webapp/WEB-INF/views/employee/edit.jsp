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
				<label>회사명</label>
				<select name="companyId" class="companyId">
					<c:forEach var="cl" items="${companyList}">
						<option value="${cl.id}"<c:if test="${cl.name == rn.cName}">selected</c:if>>${cl.name}</option>
					</c:forEach>
				</select>
			</li>
			<li>
				<!-- Recruit_Notice에 입력 -->
				<label>제목</label>
				<input type="text" name="title" value="${rn.title}"/>
			</li>
			<li>
				<label>모집 시작일</label>
				<input type="date" name="strDate" value="<fmt:formatDate value="${rn.strDate}" type="date" pattern="yyyy-MM-dd" />" />
			</li>			
			<li>
				<label>모집 마감일</label>
				<input type="date" name="endDate" value="<fmt:formatDate value="${rn.endDate}" type="date" pattern="yyyy-MM-dd" />" />
			</li>
			<li>
				<!-- Recruit_Division 테이블에서 가져오기 -->
				<label>채용 구분</label>
				<select name="recruitDivisionId">
					<option>선택</option>
					<c:forEach var="rdl" items="${recruitDivisionList}">
						<option value="${rdl.id}"<c:if test="${rdl.value == rn.rdValue}">selected</c:if>>${rdl.value}</option>
					</c:forEach>
				</select>
			</li>
			<li>
				<label>전형 구분</label>
				<select name="typeId">
					<option>선택</option>
					<c:forEach var="tl" items="${typeList}">
						<option value="${tl.id}"<c:if test="${tl.value == rn.tValue}">selected</c:if>>${tl.value}</option>
					</c:forEach>
				</select>
			</li>
			<li>
				<label>내용</label>
				<textarea rows="20" cols="100" name="contents">${rn.contents}</textarea>
			</li>
		</ul>
		<input type="submit" value="저장" />
		</form>
	</section>
</main>