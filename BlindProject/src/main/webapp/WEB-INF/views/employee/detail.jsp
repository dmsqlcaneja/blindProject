<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main>
	<h1>채용 공고 상세 페이지</h1>
	<section>
		<div><!-- 제목 + 채용정보 -->
			<div>
				<h2>제목 : ${rnl.title}</h2>
				<span>지원자수 : ?? 명</span>
			</div>
			<div>
				<p>접수 마감일 : ${rnl.endDate}</p>
				<p>채용구분 : </p>
			</div>
		</div>
		<div><!-- 내용 -->
			<p>내용 : ${rnl.contents}</p>
		</div>
		<div>
			<input type="button" value="수정"/>
		</div>
	</section>
</main>