<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main>
	<h1>채용 담당자 페이지</h1>
	<section>
		<table>
			<tr>
				<th>No.</th>
				<th>제목</th>
				<th>작성일</th>
				<th>지원자 수</th>
			</tr>
			<tr>
				<td>1</td>
				<td><a href="./detail">제목입니다</a></td>
				<td>2018-10-10</td>
				<td><a href="">2</a></td>
			</tr>
<%-- 			<c:forEach var="RN" items="${RecruitNotice}"> --%>
<!-- 				<tr> -->
<%-- 					<td>${RN.id}</td> --%>
<%-- 					<td>${RN.title}</td> --%>
<%-- 					<td>${RN.regDate}</td> --%>
<!-- 					<td>지원자수</td> -->
<!-- 				</tr>				 -->
<%-- 			</c:forEach> --%>
		</table>
		<input type="button" value="추가" onclick="location.href='hire'"/>
	</section>
</main>
