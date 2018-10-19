<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main>
	<section id="form-section">
		<h1>공지사항 입력 페이지</h1>
		<form method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td>
						<label>제목 : </label>
						<input name="title" type="text"/>
					</td>
				</tr>
				
				<tr>
					<td>
					<!-- Type 테이블에서 가져오기 -->
						<label>전형구분 : </label>
						<select name="typeId">
  							<option value="0">선택</option>
  							<c:forEach var="tyl" items="${typeList}">
								<option value="${tyl.id}">${tyl.value}</option>
							</c:forEach>
  							
						</select>
					</td>
				</tr>
				
				<tr>
					<td>
					<!-- RecruitDivision 테이블에서 가져오기 -->
						<label>채용구분 : </label>
						<select name="recruitDivisionId">
  							<option value="0">선택</option>
  							<c:forEach var="rdl" items="${recruitDivisionList}">
								<option value="${rdl.id}">${rdl.value}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				
				<tr>
					<td>
					<!-- Company 테이블에서 가져오기 -->
						<label>회사명 : </label>
						<select name="companyId">
  							<option value="0">선택</option>
  							<c:forEach var="company" items="${companyList}">
  							<option value="${company.id}">${company.name}</option>
  							</c:forEach>
						</select>
					</td>
				</tr>
				
				<tr>
					<td>
						<textarea name="contents" rows="10" cols="50">
							
							
						</textarea>
					</td>
				</tr>
				
				
				<tr>
					<td>
						<input type="submit" value="작성완료" />
					</td>
				</tr>
			</table>
		</form>
		 
	</section>

</main>