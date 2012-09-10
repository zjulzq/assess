$(document).ready(function() {

});

function loadXMLDoc() {
	var xmlhttp;
	if (window.XMLHttpRequest) {
		xmlhttp = new XMLHttpRequest();
	} else {
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}

	xmlhttp.open("POST", "name.html", true);
	xmlhttp.setRequestHeader("Content-type",
			"application/x-www-form-urlencoded");
	xmlhttp.send("fname=Bill&lname=Gates");

	xmlhttp.onreadystatechange = function() {
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			txt = xmlhttp.responseText.split(',');
			firstName = xmlhttp.documentElement;
			$("#firstName").html(txt[0]);
			$("#familyName").html(txt[1]);
		}
	}
}

function myAJAX() {
	var xmlhttp;

	if (window.XMLHttpRequest) {
		xmlhttp = new XMLHttpRequest();
	} else {
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}

	xmlhttp.open("GET", "test1.txt", true);
	xmlhttp.send();

	xmlhttp.onreadystatechange = function() {
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
		}
	}

}