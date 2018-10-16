<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<main>
<form method="post">
					<h3>회사 경력</h3>
					
					<!-- input type1 start -->
					<div id="collection" class="input_type1 col">
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
				<tr>
					<td>
					<select><option value="">연도</option></select>
					 <select><option value="">월</option></select>
					 <span class="label">~</span>
					
					<select><option value="">연도</option></select>
					 <select><option value="">월</option></select>
					 </td>
					 
					<td><input type="text" style="width: 68px;"/></td>
					<td><input type="text" style="width: 68px;" /></td>
					<td><input type="text" style="width: 82px;" /></td>
					<td><input type="text" style="width: 68px;"></td>
					<td><input type="text" style="width: 176px;" /></td>
					<td><a href = "">삭제</a></td>
				</tr>

				<tr>
					<td class="add" colspan="7">항목 추가 시 추가 버튼을 눌러주시기 바랍니다. 
					<em>(최대 4개까지 가능)</em> <a href="">추가</a>
					</td>
				</tr>
			</tbody>

		</table>
					</div>
					<!-- <div id="hidden01" style="display:none;"></div> -->
					<!--// input type1 end -->
					
					<div class="h56"></div>					
					<h3>최근직장경력</h3>
					
					<!-- input type1 start -->
					<div class="input_type1 row">
					<table>
					
						<tbody>
							<tr class="fst">
								<th>주요담당업무 1 <em>*</em></th>
								<td><input name="jobnm1" id="jobnm1" ></td>
								<th>주요담당업무 2<em>*</em></th>
								<td><input type="text" style="width:268px;"></td>
							</tr>
							<tr>
								<th>주요업적 <em>*</em></th>
								<td colspan="3"><input type="text" style="width:720px;"></td>
							</tr>
							<tr>
								<th>연간급여<em title=>*</em></th>
								<td>
									<label>(월고정급여*12) + 연간상여총액 &nbsp;</label>
									<input type="text" style="width:84px;" />
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
					</div>
					
				</form>
</main>