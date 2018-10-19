<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<main>
<div>
		<a href="">개인사항</a> 
	  	<a href="">병역사항</a>
		<a href="">자기소개</a>
		<a href="">작성완료</a>
	</div>
	
<form method="post">
					<h3>회사 경력</h3>
					
					<!-- input type1 start -->
					<table>
						<thead>
							<tr>
								<th class="col">근무기간</th>
								<th class="col">회사명</th>
								<th class="col">직위</th>
								<th class="col">담당업무</th>
								<th class="col">연봉(만원)</th>
								<th class="col">퇴직사유</th>
								<th class="col"></th>
							</tr>
						</thead>
			<tbody>
				<tr name="trStaff">
					<td>
					<p> 날짜: <input type="text" name = "strWorkDate" class="datepicker" size="20" ></p>

					 <span class="label">~</span>
					
					<p>날짜: <input type="text" name  ="endWorkDate" class="datepicker"></p>
					 </td>
					 
					<td><input type="text"  name="companyName" style="width: 68px;"/></td>
					<td><input type="text" name="position" style="width: 68px;" /></td>
					<td><input type="text" name="task" style="width: 82px;" /></td>
					<td><input type="text" name="salary" style="width: 68px;"></td>
					<td><input type="text" name="retirement" style="width: 176px;" /></td>
					<td><a href = "">삭제</a></td>
				</tr>

				<tr>
					<td class="add" colspan="7">항목 추가 시 추가 버튼을 눌러주시기 바랍니다. 
					<em>(최대 4개까지 가능)</em>
				<button name="addStaff">추가</button>
					</td>
				</tr>
			</tbody>

		</table>
					<!-- <div id="hidden01" style="display:none;"></div> -->
					<!--// input type1 end -->
					
					<div class="h56"></div>					
					<h3>최근직장경력</h3>
					
					<!-- input type1 start -->

					<table>
					
						<tbody>
							<tr class="fst">
								<th>주요담당업무 1 <em>*</em></th>
								<td><input type = "text" name="importantTask1" id="jobnm1" ></td>
								<th>주요담당업무 2<em>*</em></th>
								<td><input type="text" name = "oortantTask2" style="width:268px;"></td>
							</tr>
							<tr>
								<th>주요업적 <em>*</em></th>
								<td colspan="3"><input type="text" name = "importantachievements" style="width:720px;"></td>
							</tr>
							<tr>
								<th>연간급여<em title=>*</em></th>
								<td>
									<label>(월고정급여*12) + 연간상여총액 &nbsp;</label>
									<input type="text" name = "Ysalary" style="width:84px;" />
									<span class="label">만원</span>
								</td>
								<th scope="row" abbr="제수당총액">제수당총액<em title="필수입력사항">*</em></th>
								<td>
									<label>비고정적 제수당&nbsp;</label>
									<input type="text" style="width:159px;">
									<span>만원</span>
								</td>
							</tr>
						</tbody>
					</table>

				 	<input type = "submit" value ="다음단계">
				</form>
</main>



<meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Datepicker - Display month &amp; year menus</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
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
view-source:http://huskdoll.tistory.com/517
