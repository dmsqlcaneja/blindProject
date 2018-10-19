<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<style>
/* ---------------------------------------------------------------- */
body {
	margin: 0px;
}

h1 {
	margin: 0px;
}

h2 {
	margin: 10px;
	position: relative;
	font-size: 21px;
	color: white;
}

a:link { 
	color: red; 
	text-decoration: none;
}

a:visited { 
	color: black; 
 	text-decoration: none;
 }
 
a:hover { 
	color: red; 
	
}


li{
	list-style:none;

}

ol, ul {
	list-style: none;
}

/* ---------------------------------------------------------------- */
.main-container {
	position: relative;
	padding-bottom: 30px;
	overflow: auto;
	zoom: 1;
}

.employ-info-container {
	position: absolute;
	left: 20px;
	top: 101px;
	width: 180px;
	padding: 32px 0 0;
	background-color: #fff;
	z-index: 10;
}

.employ-notice-container {
	width: 740px;
	border-left: 1px solid #f2f2f2;
	padding: 0 0 80px 39px;
	margin-left: 200px;
}

/* ------btn---------------------------------------------------------- */
.btn {
	display: inline-block;
	text-align: left;
	vertical-align: middle;
	text-indent: -999px;
	overflow: hidden;
	cursor: pointer;
	border: 0px;
}

.btn-prev {
	width: 15px;
	height: 15px;
	background: url(../../webapp/resources/images/btn-prev.png) no-repeat
		center;
}

.btn-next {
	width: 15px;
	height: 15px;
	background: url(../webapp/resources/images/btn-next.png) no-repeat
		center;
}

/* --table-------------------------------------------------------------- */
.RecruitTable, .RecruitTable th, RecruitTable td{
	border: 0;

}
.RecruitTable{

	width: 100%;
	border-bottom: 1px solid #999;
	color: #666;
	font-size:  12px;
	table-layout: fixed;
}

.RecruitTable th{
	padding: 5px 0 6px;
	border-top: solid 1px #b2b2b2;
	background-color: #f1f1f4;
	color: #333;
	font-weight: bold;
	line-height: 20px;
	vertical-align: top;
}
.RecruitTable td{
	padding: 8px 0 9px;
	border-bottom: solid 1px #d2d2d2;
	text-align: center;
	line-height: 18px;
	
}

.RecruitTable .id{
	padding: 0px;
	font-family: Tahoma;
	font-size: 11px;
	line-height: normal;
}

.RecruitTable .title{ 
	text-align: left;
	padding-left: 15px;
	font-size: 13px
}

.RecruitTable .period{ 
	text-align: center;
	padding-left: 15px;
	font-size: 13px
}

</style> 


<div class="body"> 

	<!-- -----------aside------------------------------------------------------- -->
	<section id="employ-info-container">
		<h1>채용정보</h1>
		<ul class="employ-header">
			<li><a href="" class="recruit-notice">채용공고</a></li>
			<li><a href="" class="regular-recruit">상시채용</a></li>
			<li><a href="" class="notice">공지사항</a></li>

		</ul>
	</section>

	<!-- -----------main------------------------------------------------------- -->
	<section class="employ-notice-container">
		<h1>채용공고</h1>
		<span>현재 진행 중인 채용공고를 확인할 수 있습니다.</span>
	
		<div>
			<a href="">전체</a> <a href="">신입</a> <a href="">경력</a>
	
		</div>
	
	
		<tr>
			<td><label>회사구분 : </label> <select name="company">
					<option value="">회사선택</option>
					<option value="josun">신세계조선호텔</option>
					<option value="payment">신세계페이먼츠</option>
					<option value="everyday">에브리데이리테일</option>
					<option value="emart">이마트</option>
					<option value="tomboy">톰보이</option>
			</select></td>
		</tr>
	

		<td><label>진행상황 : </label> <select name="situation">
					<option value selected>전체</option>
					<option value="receive-schedule">접수예정</option>
					<option value="receive-ing">접수중</option>
					<option value="receive-end">접수마감</option>
			</select></td>
		</tr>
	
		<tr>
			<td>
				<h1 class="hidden">검색</h1> <input name="search" type="text" /> <input
				name="button" type="button" value="검색">
			</td>
		</tr>
	
	
		<div>
			<h1 class="hidden">게시판</h1>
			<table class="RecruitTable" border="1" cellspacing="0">
				 <colgroup>
				 	<col width="50">
				 	<col>
				 	<col width="200">
				 	<col width="80">
				 	<col width="110">				 
				 </colgroup>
				 <thead>
	                <tr>
	                	<th scope="col">번호</th>
	                    <th scope="col">제목</th>
	                    <th scope="col">모집기간</th>
	                    <th scope="col">채용구분</th>
	                    <th scope="col">진행상황</th>
	                   
	                </tr>
            	</thead>
				<tbody>
					
					<!-- var="rdl" items="${recruitDivisionList}" -->
					<c:forEach var="rnl" items="${recruitNoticeList}" >
						<tr>
							<td class="id">${rnl.id}</td>
							<td class="title"><a href="detail?id=${rnl.id}">${rnl.title}</a></td>
							<td class="period"><fmt:formatDate value="${rnl.strDate}" pattern="yyyy-MM-dd"/> - <fmt:formatDate value="${rnl.endDate}" pattern="yyyy-MM-dd"/></td>
							<td class="division"><%-- ${rnl.employDivsionName} --%></td>
							<td>???</td>
						</tr>				
					</c:forEach>
					
				</tbody>
			</table>
		</div>
	
		<div>
			<span class="btn btn-prev" onclick="alert('이전 페이지가 없습니다.');"></span> <span
				class="">.</span> <span class=""><a href="" title="1페이지">1</a></span>
			<span class="">.</span> <span class="btn btn-next"
				onclick="alert('다음 페이지가 없습니다.');"></span>
		</div>
	
	</section>


</div>


