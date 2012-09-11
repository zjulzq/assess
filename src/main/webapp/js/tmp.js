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
	xmlhttp.send();

	xmlhttp.onreadystatechange = function() {
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {

			firstName = $(xmlhttp.responseText).filter("#firstName").text();
			familyName = $(xmlhttp.responseText).filter("#familyName").text();

			$("#firstName").html(firstName);
			$("#familyName").html(familyName);
		}
	};
}
