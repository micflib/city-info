'use strict';
$(document).ready(function(){
	var wSession = document.getElementById("wSession");
	var wdata = wSession.getAttribute("data-wSession");
	coya.determineWeather(wdata);
})

var coya = {
	determineWeather : function(wdata) {
		var wstr = "";
		
		if(wdata.includes('rain')) {
			wstr = '<svg><use xlink:href="#icon-cloud-rain"></use></svg>';
		} else if(wdata.includes('wind')) {
			wstr = '<svg><use xlink:href="#icon-cloud-wind"></use></svg>';
		} else if(wdata.includes('fog')) {
			wstr = '<svg><use xlink:href="#icon-cloud-fog"></use></svg>';
		} else if(wdata.includes('lightning')) {
			wstr = '<svg><use xlink:href="#icon-cloud-lightning"></use></svg>';
		} else if(wdata.includes('raindrops')) {
			wstr = '<svg><use xlink:href="#icon-cloud-raindrops"></use></svg>';
		} else if(wdata.includes('snow')) {
			wstr = '<svg><use xlink:href="#icon-cloud-snow"></use></svg>';
		} else {
			wstr = '<svg><use xlink:href="#icon-cloud"></use></svg>';
		}
		$('#weather_container').html(wstr);		
	}
};