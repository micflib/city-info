package org.springframework.samples.mvc.views;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.mvc.data.Constant;
import org.springframework.samples.mvc.service.CoyaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class ViewsController {
	
	@Autowired
	private CoyaService coyaService;
	
	@GetMapping("")
	public String getCityInformation(Model model) {
		try {
			this.setModel(Constant.DEFAULT_CITY, model);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "home";
	}
	
	@GetMapping("/{cityName}")
	public String getCityInformationbyId(Model model
			, @PathVariable String cityName){
		try {
			this.setModel(cityName, model);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "home";
	}
	
	private void setModel(String cityName, Model model) throws Exception {
		HashMap<String, String> cityMap = new HashMap<String, String>();
		
		cityMap = coyaService.getCityInformation(cityName);
		model.addAttribute("cityName"	, cityMap.get("cityName"));
		model.addAttribute("country"	, cityMap.get("country"));
		model.addAttribute("currency"	, cityMap.get("currency"));
		
		cityMap = coyaService.getWeatherInformation(cityName);
		model.addAttribute("weather"	, cityMap.get("weather"));
		model.addAttribute("temp"		, cityMap.get("temp"));
	}
}
