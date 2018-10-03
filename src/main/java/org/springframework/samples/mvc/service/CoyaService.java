package org.springframework.samples.mvc.service;

import java.util.HashMap;

public interface CoyaService {
	public HashMap<String, String> getCityInformation(String cityName) throws Exception;
	public HashMap<String, String> getWeatherInformation(String cityName) throws Exception;
}
