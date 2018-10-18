<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<main>
	<h1>채용 담당자 페이지</h1>
	<section>
		<table>
			<tr>
				<th>No.</th>
				<th>제목</th>
				<th>모집기간</th>
				<th>구분</th>
				<th>지원자 수</th>
			</tr>
			<c:forEach var="rnl" items="${recruitNoticeList}">
				<tr>
					<td>${rnl.id}</td>
					<td><a href="detail?id=${rnl.id}">${rnl.title}</a></td>
					<td><fmt:formatDate value="${rnl.strDate}" pattern="yyyy-MM-dd"/> - <fmt:formatDate value="${rnl.strDate}" pattern="yyyy-MM-dd"/></td>
					<td>??</td>
					<td>???</td>
				</tr>				
			</c:forEach>
		</table>
		<input type="button" value="추가" onclick="location.href='hire'"/>
	</section>
</main>
