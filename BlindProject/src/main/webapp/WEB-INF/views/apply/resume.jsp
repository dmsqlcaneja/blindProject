<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<main>
<div>
	<a href="">개인사항</a> <a href="">병역사항</a> <a href="">자기소개</a> <a href="">작성완료</a>
</div>

<form action="" id="" method="post">
	<table>
		<thead>
			<tr>
				<th class="col">근무기간</th>
				<th class="col">회사명</th>
				<th class="col">직위</th>
				<th class="col">담당업무</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><input type="text" name="strDate" class="datepicker">
					<span>~</span> <input type="text" name="endDate" class="datepicker">
				</td>

				<td><input type="text" name="preCompany" style="width: 68px;" /></td>
				<td><input type="text" name="position" style="width: 68px;" /></td>
				<td><input type="text" name="task" style="width: 68px;" /></td>
				<td><a href="">삭제</a></td>
			</tr>

			<tr>
				<td class="add" colspan="7">항목 추가 시 추가 버튼을 눌러주시기 바랍니다. <em>(최대
						4개까지 가능)</em>
					<button name="addStaff">추가</button>
				</td>
			</tr>
		</tbody>

	</table>
	<!-- 기본값(2-2) start -->

	<!-- 기본값(2-2) end  -->

	<h3>1. 성장과정(자신에 대한 소개)</h3>
	<div>(0 / 400 자)</div>
	<textarea name="growth" rows="6" cols="126"></textarea>
	<!--// input type1 end -->

	<h3>2.지원동기</h3>
	<div>(0 / 400 자)</div>
	<div>
		<textarea name="motivation" rows="6" cols="126"></textarea>
	</div>
	
	<h3>3.입사 후 포부</h3>
	<div>(0 / 400 자)</div>
	<div>
		<textarea name="ambition" rows="6" cols="126"></textarea>
	</div>
	
	<h3>4. 성격의 장단점</h3>
	<div>(0 / 400 자)</div>
	<div>
		<textarea name="personality" rows="6" cols="126"></textarea>
	</div>
	
	<h3>5. 자유서술</h3>
	<div>(0 / 400 자)</div>
	<div>
		<textarea name="freeScript" rows="6" cols="126"></textarea>
	</div>
	
	<input type="submit" value="제출">
</form>
</main>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>jQuery UI Datepicker - Display month &amp; year menus</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>

//달력
			$(function() {
				$( ".datepicker" ).datepicker( {
					dateFormat:"yy/mm/dd",
					changeMonth: true,
				     changeYear: true
				});
			});
		             
		      
			
			
			
</script>