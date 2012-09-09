$(document).ready(function() {
	$("#btn1").click(function() {
		$("table").hide("slow", "");
	});

	$("#btn2").click(function() {
		$("table").show("slow", "");
	});

	$("#btn3").click(function() {
		$("table").toggle("slow", "");
	});

	$("#btn4").click(function() {
		$("table").slideToggle("slow");
	});

	$(".flip").click(function() {
		$(".panel").slideToggle("slow");
	});

	$("#btn5").click(function() {
		$(".flip").fadeOut("slow");
	});

	$("#start").click(function() {
		// $("#box").animate({height: 300}, "slow");
		// $("#box").animate({width: 300}, "slow");
		// $("#box").animate({height: 100}, "slow");
		// $("#box").animate({width: 100}, "slow");
		$("#box").animate({
			left : "100px"
		}, "slow");
		$("#box").animate({
			fontSize : "3em"
		}, "slow", function() {
			alert("moved");
		});
	});

	$("#btn6").click(function() {
		$("#btn6").after("<p>ABCDEFG</p>");

		$("table").css("background-color", "red");

		$("p").css({
			"background-color" : "red",
			"font-size" : "200%"
		});

		$("#btn6").after($("p").css("font-size"));
		$("p").height("100px");
		$("p").width("100px");
	});
});

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