<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<main id="main">
	<h1 class="hidden">채용 담당자 페이지</h1>
	<section id="section">
		<div class="search-bar">
			<input type="text" />
			<input type="button" value="검색" />
		</div>
		<table class="rn-table">
			<tr class="rn-list">
				<th class="rn-items">No.</th>
				<th class="rn-items">회사명</th>
				<th class="rn-items-l">제목</th>
				<th class="rn-items">모집기간</th>
				<th class="rn-items">채용구분</th>
				<th class="rn-items">전형구분</th>
				<th class="rn-items">작성일</th>
				<!-- <th class="rn-items">지원자 수</th> -->
			</tr>
			<c:forEach var="rnl" items="${recruitNoticeList}">
				<tr>
					<td class="rn-items">${rnl.id}</td>
					<td class="rn-items">${rnl.cName}</td>
					<td class="rn-items-l"><a href="detail?id=${rnl.id}">${rnl.title}</a></td>
					<td class="rn-items"><fmt:formatDate value="${rnl.strDate}" pattern="yyyy-MM-dd"/> ~ <fmt:formatDate value="${rnl.endDate}" pattern="yyyy-MM-dd"/></td>
					<td class="rn-items">${rnl.rdValue}</td>
					<td class="rn-items">${rnl.tValue}</td>
					<td class="rn-items"><fmt:formatDate value="${rnl.regDate}" pattern="yyyy-MM-dd"/></td>
				</tr>				
			</c:forEach>
		</table>
		<input type="button" class="add-btn" value="추가" onclick="location.href='recruit'"/>
	</section>
</main>


