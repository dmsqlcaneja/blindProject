<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	background: url(../../wepapp/resources/images/btn-prev.png) no-repeat
		center;
}

.btn-next {
	width: 15px;
	height: 15px;
	background: url(../../wepapp/resources/images/btn-next.png) no-repeat
		center;
}

</style>


<div class="body">
	<!-- -----------aside------------------------------------------------------- -->
	<section class="employ-info-container">
		<h1>채용정보</h1>
		<ul class="employ-header">
			<li><a href="">채용공고</a></li>
			<li><a href="">상시채용</a></li>
			<li><a href="">공지사항</a></li>

		</ul>
	</section>


	<!-- -----------body------------------------------------------------------- -->
	<section class="employ-notice-container">
		<h1>상시채용</h1>
		<span>상시채용 향후 인력 소요가 있을 경우 별도의 서류전형을 통하여 개별 연락을 드립니다.</span>

		<div>
			<a href="">전체</a> <a href="">신입</a> <a href="">경력</a>

		</div>

		<table>
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

			<tr>
				<td><label>전형구분 : </label> <select name="situation">
						<option value selected>전체</option>
						<option value="receive-schedule">서류전형중</option>
						<option value="receive-ing">서류결과발표</option>
						<option value="receive-end">면접전형중</option>
						<option value="receive-schedule">면접결과발표</option>
						<option value="receive-ing">1차면접발표</option>
						<option value="receive-end">2차면접발표</option>
						<option value="receive-schedule">신체검사진행</option>
						<option value="receive-ing">신검합격자발표</option>
						<option value="receive-end">최종합격자발표</option>
				</select></td>
			</tr>

			<tr>
				<td>
					<h1 class="hidden">검색</h1> <input name="search" type="text" /> <input
					name="button" type="button" value="검색">
				</td>
			</tr>
		</table>

		<div>
			<h1 class="hidden">게시판</h1>
			<table>
				<thead>
					<tr>
						<th scope="col" abbr="제목" class="fst" colspan="2"><img src=""
							alt="제목"></th>
						<th scope="col" abbr="모집기간"><img src="" alt="모집기간"></th>
						<th scope="col" abbr="구분"><img src="" alt="구분"></th>
						<th scope="col" abbr="진행상황"><img src="" alt="진행상황"></th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td>제목</td>
						<td>모집기간</td>
						<td>구분</td>
						<td>진행상황</td>
					</tr>
				</tbody>
			</table>
		</div>

		<div>
			<span class="btn btn-prev" onclick="alert('이전 페이지가 없습니다.');"></span>
			<span class="">.</span> <span class=""><a href="" title="1페이지">1</a></span>
			<span class="">.</span> <span class="btn btn-next"
				onclick="alert('다음 페이지가 없습니다.');"></span>
		</div>

	</section>


</div>