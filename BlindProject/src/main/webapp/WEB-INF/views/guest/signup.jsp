<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script src="../resources/js/guest/signup.js"></script>

<!-- -----------employee-------------------------------------------------------------------------------------------------- -->

<main id="employee">
<section id="body">
	<form method="post">
		<div class="content-container">
			<h1>
				<a href="">블라인드 채용</a>
			</h1>

			<section class="signup">
				<form action="/accounts/signup/" autocomplete="off" class=""
					id="signup-form" method="post">
					<input name="csrfmiddlewaretoken" type="hidden"
						value="52V3Us3HGc0bzauhrkp3RFfuIYEYRAeZ"><input
						name="next" type="hidden" value="">


					<div class="control-wrapper" style="padding-bottom: 20px;">
						<ul class="signup-list list-unstyled">
							<li class="signup-list-element"><label
								class="signup-list-element-label" for="id_usage_1">
									<p class="signup-list-element-txt">직원 채용을 원하시는</p>
									<div class="signup-list-element-radio-wrapper">
										<input class="signup-list-element-radio" id="id_usage_1"
											name="usage" type="radio" value="employee">
									</div>
									<div class="signup-list-element-sub-container">
										<p class="signup-list-element-sub-usage">채용 담당자</p>
										<hr class="signup-list-element-sub-usage-hr">
										<p class="signup-list-element-sub-cap">
											<br>
										</p>
									</div>
							</label></li>

							<li class="signup-list-element"><label
								class="signup-list-element-label active" for="id_usage_2"><p
										class="signup-list-element-txt">직업 갖기를 원하시는</p>
									<div class="signup-list-element-radio-wrapper">
										<input class="signup-list-element-radio" id="id_usage_2"
											name="usage" type="radio" value="applier">
									</div>
									<div class="signup-list-element-sub-container">
										<p class="signup-list-element-sub-usage">지원자</p>
										<hr class="signup-list-element-sub-usage-hr">
										<p class="signup-list-element-sub-cap">
											<br>
										</p>
									</div> </label></li>

							<li class="signup-list-element"><label
								class="signup-list-element-label active" for="id_usage_2"><p
										class="signup-list-element-txt"></p>
									<div class="signup-list-element-radio-wrapper">
										<input class="signup-list-element-radio" id="id_usage_2"
											name="usage" type="radio" value="admin">
									</div>
									<div class="signup-list-element-sub-container">
										<p class="signup-list-element-sub-usage">관리자</p>
										<hr class="signup-list-element-sub-usage-hr">
										<p class="signup-list-element-sub-cap">
											<br>
										</p>
									</div> </label></li>

						</ul>
					</div>
		</div>


		<div class="textbox-form">
			<label class="signup-title-element"><span>*</span>아이디</label> <input
				type="text" class="form-control" id="formGroupExampleInput1"
				required="required" name="id"> <input type="button"
				value="중복확인" id="checkbtn" />
		</div>

		<div class="textbox-form">
			<label class="signup-title-element"><span>*</span>비밀번호</label> <input
				type="password" class="form-control" id="formGroupExampleInput2"
				required="required" name="pwd"> <label
				class="signup-title-element"></label><small id="emailHelp"
				class="form-text text-muted">비밀번호는 특수문자를 포함한 6자 이상 20자 이하로
				입력해 주세요.</small>
		</div>

		<div class="textbox-form">
			<label class="signup-title-element"><span>*</span>비밀번호 재입력</label> <input
				type="password" class="form-control" id="formGroupExampleInput3"
				required="required" name="pwdcheck"> <label
				class="signup-title-element"></label> <small
				class="form-text text-muted" id="check-pwd">동일한 비밀번호를 입력해
				주세요.</small>
		</div>

		<div class="textbox-form">
			<label class="signup-title-element"><span>*</span>이름</label> <input
				type="text" class="form-control" id="" required="required"
				name="name">
		</div>

		<div class="textbox-form">
			<label class="signup-title-element"><span>*</span>이메일</label> <input
				type="email" class="form-control"
				pattern="^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$"
				id="formGroupExampleInput4" required="required" name="email">
			<label class="signup-title-element"></label><small
				class="form-text text-muted" id="confirm-Email"></small>
		</div>

		<div class="textbox-form">
			<label class="signup-title-element"><span>*</span>휴대전화</label> <input
				type="text" class="form-control" id="" required="required"
				name="phonenumber">
		</div>


		<div class="textbox-form">
			<label class="signup-title-element"></label>
			<button type="submit" class="btn btn-primary btn-lg btn-block">회원가입</button>
		</div>
	</form>
</section>
</main>
<!-- -----------applier-------------------------------------------------------------------------------------------------- -->






