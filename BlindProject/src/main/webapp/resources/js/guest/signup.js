window.addEventListener("load",function() {
    var body = document.querySelector("#body");
    var email = body.querySelector("#formGroupExampleInput4");
	var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	var confirmEmail = body.querySelector("#confirm-Email");

    confirmEmail.onkeyup = function() {
			if (email.value.match(regExp) != null) {
				confirmEmail.innerText = "";
			} else {
				confirmEmail.innerText = "이메일 형식이 아닙니다.";
            }
            if(email.value == ""){
                confirmEmail.innerText = "";
            }
		}


    var pwd = body.querySelector("#formGroupExampleInput2");
    var cPwd = body.querySelector("#emailHelp");
    var regExp = /^(?=.*[a-zA-Z])((?=.*\d)|(?=.*\W)).{6,20}$/;

    pwd.onkeyup = function(){
        if (pwd.value.match(regExp) != null){
            cPwd.innerText = '다음 비밀번호를 재입력 해주세요.';
        }else{
            cPwd.innerText = '반드시 6~20 영문 대소문자, 최소 1개이상 특수문자를 포함해야합니다.';
        }
        if (pwd.value == "") {
            cPwd.innerText = '비밀번호는 8자 이상 32자 이하로 입력해주세요.';
        }      
    }  


    var chPwd = body.querySelector("#formGroupExampleInput3");
    var checking = body.querySelector("#check-pwd");


    chPwd.onkeyup = function(){
        if(pwd.value != chPwd.value){
            checking.innerText = '입력하신 비밀번호와 일치하지 않습니다.';
        }else{
            checking.innerText = '이용약관에 동의하세요.';
        }if(chPwd.value == ""){
            checking.innerText = '동일한 비밀번호를 입력해 주세요.';
        }
    }

});
