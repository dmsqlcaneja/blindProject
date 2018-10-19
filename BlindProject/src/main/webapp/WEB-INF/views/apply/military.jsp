<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<main>
<dt class="title"><strong>(주)블라인드 채용</strong></dt>
	<dl class="data">
<dt class="data01"><img src="/img/job_apply/dt_01.gif" alt="접수 상태"></dt>
	<dd class="data01">지원서 저장 전입니다.</dd>
	<dt class="data02"><img src="/img/job_apply/dt_02.gif" alt="원서 마감 일시"></dt>
	
	<dd class="data02">2018-12-31 23:59 
	<span class="data021">(D-76일 11:19:51)</span>
	</dd>
	
	<dt class="data03"><img src="/img/job_apply/dt_03_out.gif" alt="자동 로그아웃"></dt>
	<dd class="data03">0:59:9</dd>
	<dd class="data031"><a href="#none" onclick="javascript:doExtension();" title="연장"><img src="/img/job_apply/s_increase.gif"></a></dd>
</dl>

<div>
		<a href="index">개인사항</a> 
	  	<a href="">병역사항</a>
		<a href="">자기소개</a>
		<a href="">작성완료</a>
	</div>

<h3>병역정보</h3>
<div>
<form>
	<table>
		<thead>
			<tr>
				<th>제대구분</th>
				<th>복무기간</th>
				<th>군별</th>
				<th>계급</th>
			</tr>
		</thead>
		<tbody>
		<tr>
			<td><select>
					<option value="">선택</option>

			</select></td>
			<td>
					<p> 날짜: <input type="text" name = "strWorkDate" class="datepicker" size="20" ></p>

					 <span class="label">~</span>
					
					<p>날짜: <input type="text" name  ="endWorkDate" class="datepicker"></p>
					 </td>
			
			<td><select>
					<option value="">선택</option>
				
			</select>
			</td>
			
			<td>
			<select>
					<option value="">선택</option>
			</select></td>
			</tr>
		</tbody>
	</table>
</form>
</div>
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
