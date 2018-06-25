var xhr = new XMLHttpRequest();
xhr.open("GET", "/bitcamp-java106-project/html/header.html", false); // 동기 방식으로 요청한다.
xhr.send();
header.innerHTML = xhr.responseText; // 서버로 부터 받으 header를 삽입한다.

var xhr = new XMLHttpRequest();
xhr.open("GET", "/bitcamp-java106-project/json/auth/loginUser", false);
xhr.send();
if(xhr.responseText == "") {
	location.href= "/bitcamp-java106-project/html/auth/login.html";
} else {
	var data = JSON.parse(xhr.responseText);
	username.textContent = data.id;
}
    