window.addEventListener("load", function() {
	var section = document.querySelector("#section");
	var employee = section.querySelector(".employee");
	var apply = section.querySelector(".apply");
	var admin = section.querySelector(".admin");

	employee.onclick = function() {
		location.href = './employee/index';
	}

	apply.onclick = function() {
		location.href = './member/RecruitNotice';
	}

	admin.onclick = function() {
		location.href = './admin/index';
	}
});