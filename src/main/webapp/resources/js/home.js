'use strict';
$(document).ready(function(){
	var wSession = document.getElementById("wSession");
	var wdata = wSession.getAttribute("data-wSession");
	coya.determineWeather(wdata);
})

var coya = {
	determineWeather : function(wdata) {
		var wstr = "";
		var icon = "";
		if(wdata == "01d") {
			icon = "sun";
		} else if(wdata == "01n") {
			icon = "moon-fill";
		} else if(wdata == "02d") {
			icon = "cloud-sun";
		} else if(wdata == "02n") {
			icon = "cloud-moon";
		} else if(wdata == "03d" || wdata == "03n") {
			icon = "cloud";
		} else if(wdata == "04d" || wdata == "04n") {
			icon = "clouds";
		} else if(wdata == "09d" || wdata == "09n") {
			icon = "cloud-raindrops";
		} else if(wdata == "10d") {
			icon = "cloud-sun-raindrops";
		} else if(wdata == "10n") {
			icon = "cloud-moon-raindrops";
		} else if(wdata == "11d" || wdata == "11n") {
			icon = "cloud-lightning";
		} else if(wdata == "13d" || wdata == "13n") {
			icon = "cloud-snowflakes";
		} else if(wdata == "50d" || wdata == "50n") {
			icon = "cloud-fog";
		} else {
			icon = "cloud";
		}
		wstr = '<svg><use xlink:href="#icon-'+icon+'"></use></svg>';
		$('#weather_container').html(wstr);		
	}
};